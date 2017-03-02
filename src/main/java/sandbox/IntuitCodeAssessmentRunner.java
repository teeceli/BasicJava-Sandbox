package sandbox;

public class IntuitCodeAssessmentRunner {

	public static void main(String[] args) {
		
		String testInput = "Abracadabra      Alakazam!!";

		IntuitCodeAssessmentUtil.getNumberOfWords(testInput);

		IntuitCodeAssessmentUtil.getNumberOfNonWhitespaceCharacters(testInput);
		
		IntuitCodeAssessmentUtil.getUniqueBreakdownOfCharacters(testInput);
	}
}