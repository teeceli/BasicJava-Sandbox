package com.sandbox.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HackerRankBigSum {
	
	public static void main(final String args[]) {
		
		Scanner in = new Scanner(System.in);

		//System.out.print("Enter the number of values: ");
		final int numberOfInputs = in.nextInt();
		
		in.nextLine();
		
		//System.out.print("Enter the list: ");
		String input = in.nextLine();
		
		in.close();
		
		String[] inputElements = input.split("\\s+");
		
		List<Long> elementList = new ArrayList<>();
		
		for (final String inputElement : inputElements) {
			elementList.add(Long.parseLong(inputElement));
		}
		
		Long total = bigSum(elementList);
		
		System.out.println(total);
	}

	public static Long bigSum(final List<Long> elementList) {

		Long total = 0L;
		
		for (final Long element : elementList) {
			total = total + element;
		}
		
		return total;
	}
}