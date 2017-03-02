package examples;

import static org.junit.Assert.*;
import org.junit.Test;

public class PalindromeCheckerTest {
	
	@Test
	public void testCheckForPalindromeFalse() {
	
		String check = "Timur";
		
		boolean isPalindrome = PalindromeChecker.isPalindrome(check);
		
		assertFalse(isPalindrome);
	}
	
	@Test
	public void testCheckForPalindromeFalse2() {
		
		String check = "123a";
		
		boolean isPalindrome = PalindromeChecker.isPalindrome(check);
		
		assertFalse(isPalindrome);
	}

	@Test
	public void testCheckForPalindromeTrue() {
		
		String check = "Hannah";
		
		boolean isPalindrome = PalindromeChecker.isPalindrome(check);
		
		assertTrue(isPalindrome);
	}

	@Test
	public void testCheckForPalindromeTrue2() {
		
		String check = "123a321";
		
		boolean isPalindrome = PalindromeChecker.isPalindrome(check);
		
		assertTrue(isPalindrome);
	}

	@Test
	public void testCheckForPalindromeTrue3() {
		
		String check = "top spot";
		
		boolean isPalindrome = PalindromeChecker.isPalindrome(check);
		
		assertTrue(isPalindrome);
	}
}