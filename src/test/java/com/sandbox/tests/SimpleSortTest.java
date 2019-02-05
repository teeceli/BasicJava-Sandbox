package com.sandbox.tests;

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;

public class SimpleSortTest {
	
	@Test
	public void simpleStringArraySort() {
		
		final String[] group = {"cdc", "aba", "zz", "mean", "baa"};
		final String[] expected = {"aba", "baa", "cdc", "mean", "zz"};
		
		Arrays.sort(group);
		assertArrayEquals(expected, group);
		
	}
	
	@Test
	public void simpleAssert() {
		
		final String test = "hello";
		final String test2 = "hello";
		
		assertEquals(test, test2);
		
	}

}
