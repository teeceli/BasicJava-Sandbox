package com.sandbox.hackerrank;

import static org.junit.Assert.*;
import org.junit.Test;

import com.sandbox.hackerrank.HackerRankTriplets;

public class HackerRankTripletsTest {

	@Test
	public void testTriplets() {

		String[] input1 = {"5", "6", "7"};
		String[] input2 = {"3", "6", "10"};
		
		String expected = "1 1";
		
		String actual = HackerRankTriplets.getScores(input1, input2);
		
		assertEquals(expected, actual);
	}
}
