package arrowhead;

public class InterviewAdmissionStrategy implements AdmissionStrategy {
	
	private Candidate candidate;
	
	private static String message;
	
	private static final String INSTANT_ACCEPT = "instant accept";

	private static final String INSTANT_REJECT = "instant reject";

	private static final String FURTHER_REVIEW = "further review";
	
	private static final Integer FELONY_AGE_THRESHOLD = 5;

	private static final Integer ACCEPTED_AGE_LOW = 17;

	private static final Integer ACCEPTED_AGE_HIGH = 26;

	private static final Integer ACCEPTED_AGE_GUARANTEED = 80;

	private static final Integer ACT_SCORE_NEEDED = 27;

	private static final Integer SAT_SCORE_NEEDED = 1920;

	private static final Integer LOW_GPA_PERCENT = 70;

	private static final Integer HIGH_GPA_PERCENT = 90;

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}
	
	@Override
	public Decision checkAccepted() {
		
		// Instant Reject
		if (hasNullsReject(candidate) || hasFelonies(candidate) || hasInvalidAge(candidate) || 
				hasLowGPA(candidate) || hasInvalidNameFormatting(candidate)) {
			return decision(INSTANT_REJECT);
		};
		
		// Instant Accept
		if (hasCorrectAgeAndState(candidate) || hasHighScores(candidate) || hasHighGPA(candidate)) {
			return decision(INSTANT_ACCEPT);
		}
		
		// Needs Further Review
		return decision(FURTHER_REVIEW);
	}

	private static boolean hasCorrectAgeAndState(final Candidate candidate) {

		String candidateState = candidate.getState();
		
		Integer candidateAge = candidate.getAge();
				
		if (candidateAge >= ACCEPTED_AGE_GUARANTEED || (candidateState.equals("CA") && 
				(candidateAge > ACCEPTED_AGE_LOW && candidateAge < ACCEPTED_AGE_HIGH))) {
			
			message = "good age";
			
			return true;
		}
		
		return false;
	}
	
	private static boolean hasHighScores(final Candidate candidate) {

		if ((candidate.getTestScores().getActScore() != null && candidate.getTestScores().getActScore() >= ACT_SCORE_NEEDED) || 
				(candidate.getTestScores().getSatScore() != null && candidate.getTestScores().getSatScore() >= SAT_SCORE_NEEDED)) {
			
			message = "high test score";
			
			return true;
		}
		return false;
	}
	
	private static boolean hasHighGPA(final Candidate candidate) {

		Integer percentScore = calculatePercent(candidate);
		
		if (percentScore >= HIGH_GPA_PERCENT) {
			
			message = "high GPA score";
			
			return true;
		}
		
		return false;
	}

	private static boolean hasFelonies(final Candidate candidate) {

		Integer yearsSinceFelony = candidate.getFelony().getYearsSinceFelony();
		
		if (yearsSinceFelony <= FELONY_AGE_THRESHOLD) {
			
			message = "felony too recent";
			
			return true;
		}
		
		return false;
	}
	
	private static boolean hasInvalidAge(final Candidate candidate) {

		if (candidate.getAge() < 0) {
			
			message = "invalid age";
			
			return true;
		}
		
		return false;
	}
	
	private static boolean hasLowGPA(final Candidate candidate) {
		
		Integer percentScore = calculatePercent(candidate);
		
		if (percentScore <= LOW_GPA_PERCENT) {
			
			message = "gpa too low";
			
			return true;
		}
		
		return false;
	}
	
	private static boolean hasInvalidNameFormatting(final Candidate candidate) {
		
		String firstLetterOfFirstName = candidate.getFirstName().trim().substring(0, 1);
		String expectedFirstLetterOfFirstName = firstLetterOfFirstName.toUpperCase();

		String firstLetterOfLastName = candidate.getLastName().trim().substring(0, 1);
		String expectedFirstLetterOfLastName = firstLetterOfLastName.toUpperCase();
		
		if (!firstLetterOfFirstName.equals(expectedFirstLetterOfFirstName) || 
				!firstLetterOfLastName.equals(expectedFirstLetterOfLastName)) {
			
			message = "invalid name format";

			return true;	
		}
		
		return false;
	}
	
	private static boolean hasNullsReject(final Candidate candidate) {
		
		// TODO The assignment doesn't really specify how to handle nulls. 
		// At this point it is an assumption that it would be an instant reject but 
		// obviously I would clarify this if it was a real project and have some validation on the input
		
		if (candidate.getFirstName() != null && candidate.getLastName() != null && candidate.getAge() != null && 
				candidate.getEmailAddress() != null && candidate.getFelony().getYearsSinceFelony() != null && 
				candidate.getGpa().getScale() != null && candidate.getGpa().getScore() != null) {
			
			return false;
		}
		
		message = "Not all fields captured";
		
		return true;
	}
	
	private static Integer calculatePercent(final Candidate candidate) {
		
		Float gpaScale = candidate.getGpa().getScale();
		Float gpaScore = candidate.getGpa().getScore();
		
		return Math.round((gpaScore / gpaScale) * 100);
	}
	
	private Decision decision(final String result) {

		Decision decision = new Decision();
		
		decision.setResult(result);
		decision.setMessage(message);
		
		return decision;
	}
}