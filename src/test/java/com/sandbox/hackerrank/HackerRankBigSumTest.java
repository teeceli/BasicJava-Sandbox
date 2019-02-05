package com.sandbox.hackerrank;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

import com.sandbox.hackerrank.HackerRankBigSum;

public class HackerRankBigSumTest {

	@Test
	public void testGetBigSum() {

		List<Long> elementList = new ArrayList<>();
		elementList.add(1000000001L);
		elementList.add(1000000002L);
		elementList.add(1000000003L);
		elementList.add(1000000004L);
		elementList.add(1000000005L);
		
		Long expected = 5000000015L;
		
		Long actual = HackerRankBigSum.bigSum(elementList);
		
		assertEquals(expected, actual);
	}
}