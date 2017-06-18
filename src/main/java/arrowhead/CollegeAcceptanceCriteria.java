package arrowhead;

public class CollegeAcceptanceCriteria {
	
	public static Decision checkCandidateAccepted(final Candidate candidate) {
		
		AdmissionStrategy strategy = new InterviewAdmissionStrategy(); 
		
		strategy.setCandidate(candidate);
		
		return strategy.checkAccepted();
	}
}