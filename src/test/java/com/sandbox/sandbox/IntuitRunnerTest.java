package com.sandbox.sandbox;

import static org.junit.Assert.*;
import org.junit.Test;

import com.sandbox.sandbox.IntuitRunner;

public class IntuitRunnerTest {

	@Test
	public void testRemoveDuplicates() {

		final String input = "AbraCadABraAlakAzam";
		
		final String expected = "AbrCdlkzm";
		
		String actual = IntuitRunner.removeDuplicates(input);
		
		assertEquals(expected, actual);
	}

	@Test
	public void testRemoveDuplicatesInvalidInput() {
		
		final String input = "Abra12sdf";
		
		final String expected = "Invalid Input";
		
		String actual = IntuitRunner.removeDuplicates(input);
		
		assertEquals(expected, actual);
	}

	@Test
	public void testRemoveDuplicatesNothing() {
		
		final String input = "";
		
		final String expected = "";
		
		String actual = IntuitRunner.removeDuplicates(input);
		
		assertEquals(expected, actual);
	}
}