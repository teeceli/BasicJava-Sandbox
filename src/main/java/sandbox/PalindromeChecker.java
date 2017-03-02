package sandbox;

import java.util.Arrays;

public class PalindromeChecker {
	
	public static boolean isPalindrome(final String check) {

		boolean isPalindrome = checkForPalindrome(check);
		
		return isPalindrome;
	}

	private static boolean checkForPalindrome(final String check) {
		
		char[] charArray = check.toLowerCase().replaceAll("\\s","").toCharArray();

		int arraySize = charArray.length - 1;

		char[] reverseCharArray = new char[arraySize];
				
		int k = 0;
		
		for (int i = arraySize; i >= 0; i--) {
			reverseCharArray[k] = charArray[i];
			k++;
		}
		
		if (Arrays.equals(charArray, reverseCharArray)) {
			return true;
		}

		return false;
	}
}