package com.sandbox.hackerrank;

import java.util.Scanner;

public class HackerRankArraySum {
	
	public static void main(final String[] args) {
		
		final Scanner in = new Scanner(System.in);
		
		//System.out.print("Enter the size of the array: ");
		final int sizeOfArray = in.nextInt();
		
		final int numArray[] = new int[sizeOfArray];
				
		for (int i = 0; i < sizeOfArray; i++) {
			numArray[i] = in.nextInt();
		}
		
		in.close();
		
		int total = sum(sizeOfArray, numArray);
		
		System.out.println(total);
	}
	
	public static int sum(final int sizeOfArray, final int[] numArray) {
		
		int total = 0;
		
		for (int k = 0; k < sizeOfArray; k++) {
			total = total + numArray[k];
		}
		
		return total;
	}
}