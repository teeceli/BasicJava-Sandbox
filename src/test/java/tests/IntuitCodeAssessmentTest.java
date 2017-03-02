package tests;

import static org.junit.Assert.*;
import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.Test;
import sandbox.IntuitCodeAssessmentUtil;

public class IntuitCodeAssessmentTest {
	
	private final static String TEST_INPUT = "Abracadabra      Alakazam!!";

	@Test
	public void testGetNumberOfWords() {
		
		Integer actual = IntuitCodeAssessmentUtil.getNumberOfWords(TEST_INPUT);
		
		Integer expected = 2;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetNumberOfNonWhitespaceCharacters() {
				
		Integer actual = IntuitCodeAssessmentUtil.getNumberOfNonWhitespaceCharacters(TEST_INPUT);
		
		Integer expected = 21;
		
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUniqueBreakdownOfCharacters() {
		
		Map<Character, Integer> expectedMap = new LinkedHashMap<>();
		expectedMap.put('A', 2);
		expectedMap.put('b', 2);
		expectedMap.put('r', 2);
		expectedMap.put('a', 7);
		expectedMap.put('c', 1);
		expectedMap.put('d', 1);
		expectedMap.put(' ', 6);
		expectedMap.put('l', 1);
		expectedMap.put('k', 1);
		expectedMap.put('z', 1);
		expectedMap.put('m', 1);
		expectedMap.put('!', 2);

		Map<Character, Integer> actualMap = IntuitCodeAssessmentUtil.getUniqueBreakdownOfCharacters(TEST_INPUT);
		
		assertEquals(expectedMap, actualMap);
	}
}