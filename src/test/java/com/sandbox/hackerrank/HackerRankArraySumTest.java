package com.sandbox.hackerrank;

import static org.junit.Assert.*;
import org.junit.Test;

import com.sandbox.hackerrank.HackerRankArraySum;

public class HackerRankArraySumTest {

	@Test
	public void testSum() {
		
		final int sizeOfArray = 6;
		final int[] numArray = {1, 2, 3, 4, 10, 11};
		final int expected = 31;
		
		final int actual = HackerRankArraySum.sum(sizeOfArray, numArray);
		
		assertEquals(expected, actual);	
	}
}
