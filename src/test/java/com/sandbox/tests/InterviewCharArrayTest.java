package com.sandbox.tests;

import static org.junit.Assert.*;
import org.junit.Test;

import com.sandbox.interview.InterviewCharArray;

public class InterviewCharArrayTest {
	
	@Test
	public void testCharArray() {
		
		char[] expected = {'T', 'i', 'm', 'u', 'r'};
		
		char[] actual = InterviewCharArray.parseString("Timur");
		
		assertArrayEquals(actual, expected);
	}
}
