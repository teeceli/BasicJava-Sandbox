package tests;

import interview.InterviewCharArray;
import static org.junit.Assert.*;
import org.junit.Test;

public class InterviewCharArrayTest {
	
	@Test
	public void testCharArray() {
		
		char[] expected = {'T', 'i', 'm', 'u', 'r'};
		
		char[] actual = InterviewCharArray.parseString("Timur");
		
		assertArrayEquals(actual, expected);
	}
}
