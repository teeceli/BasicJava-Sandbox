package com.sandbox.codewars;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.sandbox.codewars.JadenCase;

public class JadenCaseTest {
	
	JadenCase jc;
	
	@Before
	public void setup() {
		
		jc = new JadenCase();
	}

	@Test
	public void testString() {
		
		String testString = "How can mirrors be real if our eyes aren't real";
		
		String expectedString = "How Can Mirrors Be Real If Our Eyes Aren't Real";
		
		String actualString = jc.toJadenCase(testString);
		
		assertEquals(expectedString, actualString);

	}

}
