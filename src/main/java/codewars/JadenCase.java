package codewars;

// ToDo: Refactor this using Java 8s lambda expressions
public class JadenCase {
	
	public String toJadenCase(final String nonJadenCase) {
		
		if (nonJadenCase == null || nonJadenCase.isEmpty()) {
			return null;
		}
    
		String jadenCase = "";
		
		String[] jadenArray = nonJadenCase.split(" ");
		
		for (String word : jadenArray) {
			String jadenWord = word.substring(0, 1).toUpperCase() + word.substring(1);
			jadenCase = jadenCase + " " + jadenWord;
		}
				
		return jadenCase.trim();
	}
}