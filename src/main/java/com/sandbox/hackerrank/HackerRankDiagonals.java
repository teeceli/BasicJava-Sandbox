package com.sandbox.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HackerRankDiagonals {

	public static void main(final String[] args) {

		Scanner in = new Scanner(System.in);

		//System.out.print("Enter the number of rows: ");
		final int numberOfRows = in.nextInt();
		
		in.nextLine();
		
		List<String> inputList = new ArrayList<>();
		
		//System.out.print("Enter the values: ");
		for (int i = 0; i < numberOfRows; i++) {
			String input = in.nextLine();
			inputList.add(input);
		}
		
		in.close();
		
		List<List<String>> rowList = new ArrayList<>();
		List<String> individualElements = new ArrayList<>();

		for (String elementRow : inputList) {
			individualElements = Arrays.asList(elementRow.split("\\s+"));
			rowList.add(individualElements);
		}

		Integer difference = calculateDiagonalsDifference(numberOfRows, rowList);
		
		System.out.println(difference);
	}

	private static Integer calculateDiagonalsDifference(final int numberOfRows, final List<List<String>> rowList) {

		Integer total1 = 0;
		Integer total2 = 0;
		
		for (int k = 0; k < numberOfRows; k++) {
			total1 = total1 + Integer.parseInt(rowList.get(k).get(k));
		}
		
		int innerCounter = 0;
		for (int k = numberOfRows; k > 0; k--) {
			total2 = total2 + Integer.parseInt(rowList.get(innerCounter).get(k-1));
			innerCounter++;
		}
		
		Integer difference = calculateDifference(total1, total2);
		
		return Math.abs(difference);
	}

	private static Integer calculateDifference(final Integer total1, final Integer total2) {

		return total1 - total2;
	}
}