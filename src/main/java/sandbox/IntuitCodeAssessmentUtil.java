package sandbox;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class IntuitCodeAssessmentUtil {

	public static Integer getNumberOfWords(final String testInput) {
		
		String testInputTruncated = testInput.replaceAll("\\s+", " ");
		
		Integer numberOfWords = testInputTruncated.split("\\s").length;
		
		System.out.println("Word count = " + numberOfWords);
		
		return numberOfWords;
	}
	
	public static Integer getNumberOfNonWhitespaceCharacters(final String testInput) {

		Integer numberOfNonWhitespaceCharacters = testInput.replaceAll("\\s","").toCharArray().length;
		
		System.out.println("Non-whitespace character count = " + numberOfNonWhitespaceCharacters);
		
		return numberOfNonWhitespaceCharacters;
	}

	public static Map<Character, Integer> getUniqueBreakdownOfCharacters(final String testInput) {
		
		char[] trimmedInput = testInput.toCharArray();
		
		Map<Character, Integer> charMap = new LinkedHashMap<>();
		
		for (final char c : trimmedInput) {
			if (charMap.containsKey(c)) {
				Integer count = charMap.get(c).intValue() + 1;
				charMap.put(c, count);
			} else {
				charMap.put(c, 1);
			}	
		}
		
		System.out.println("Unique breakdown of all characters in order they appeared...");
		
		for (Entry<Character, Integer> entry : charMap.entrySet()) {
		    Character key = entry.getKey();
		    Integer value = entry.getValue();
		    System.out.println(key + ": " + value);
		}		
		
		return charMap;
	}
}
