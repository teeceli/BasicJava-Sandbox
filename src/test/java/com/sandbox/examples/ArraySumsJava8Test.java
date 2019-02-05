package com.sandbox.examples;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

import com.sandbox.examples.ArraySumsJava8;

public class ArraySumsJava8Test {
	
	final List<Integer> list = Arrays.asList(1, 2, 3, 4);
	
	final static Integer EXPECTED_SUM = 10;
	
	@Test
	public void testOldWay() {
		
		final Integer actualSum = ArraySumsJava8.sumOldWay(list);

		assertEquals(EXPECTED_SUM, actualSum);
	}

	@Test
	public void testSumArrayOfIntegers() {
				
		final Integer actualSum = ArraySumsJava8.sumArrayOfIntegers(list);
		
		assertEquals(EXPECTED_SUM, actualSum);
	}

	@Test
	public void testSumListofIntegers() {
		
		final Integer actualSum = ArraySumsJava8.sumListofIntegers(list);
		
		assertEquals(EXPECTED_SUM, actualSum);
	}
	
	@Test
	public void testSumPrimitiveIntArray() {
		
		int[] intArray = list.stream().mapToInt(i->i).toArray();

		final Integer actualSum = ArraySumsJava8.sumPrimitiveIntArray(intArray);
		
		assertEquals(EXPECTED_SUM, actualSum);
	}
}