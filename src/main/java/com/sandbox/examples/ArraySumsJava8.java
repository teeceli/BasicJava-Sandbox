package com.sandbox.examples;

import java.util.Arrays;
import java.util.List;

public class ArraySumsJava8 {
		
	public static Integer sumListofIntegers(final List<Integer> list) {
				
		// Sum List of Integer with java 8
		Integer sum = list.stream().reduce(0, (a, b) -> a + b);

		return sum;
	}
	
	public static Integer sumOldWay(final List<Integer> list) {
		
		Integer sum = 0;

		// Old for loop to sum Integers in List
		for (final Integer element : list) {
			sum = sum + element;
		}
		
		return sum;
	}
	
	public static Integer sumArrayOfIntegers(final List<Integer> list) {
		
		Integer[] integerArray = new Integer[list.size()];
		list.toArray(integerArray);
		
		// Sum array of Integers with java 8
		Integer sum = Arrays.stream(integerArray).reduce(0, (a, b) -> a + b);
		
		return sum;
	}
	
	public static Integer sumPrimitiveIntArray(final int[] intArray) {

		// Sum primitive int array with java 8
		Integer sum = Arrays.stream(intArray).sum();
		
		return sum;			
	}
}