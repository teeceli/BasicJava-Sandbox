package com.sandbox.sandbox;

import java.util.Scanner;

public class IntuitRunner {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String input = in.nextLine();
		
		in.close();
		
		String dupesRemoved = removeDuplicates(input);
		
		System.out.println(dupesRemoved);		
	}
	
	public static String removeDuplicates(final String input){
		
		String dupesRemoved = "";

		Boolean onlyLetters = initialCheck(input);
		
		if (onlyLetters || input.equals("")) {

			char[] charArray = input.toCharArray();
			
			for (final Character c : charArray) {
				if (!dupesRemoved.contains(c.toString().toLowerCase()) 
						&& !dupesRemoved.contains(c.toString().toUpperCase())) {
					
					dupesRemoved = dupesRemoved + c;
				}
			}
			
		} else {
			
			return "Invalid Input";
		}
				
		return dupesRemoved;
	}
	
	public static Boolean initialCheck(final String input) {
		
		// Assumption: We only accept English characters
		Boolean onlyLetters = input.matches("[a-zA-Z]+\\.?");
		
		return onlyLetters;
	}
}