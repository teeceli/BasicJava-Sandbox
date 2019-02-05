package com.sandbox.examples;

import java.util.Arrays;
import java.util.List;

public class CharacterArrays {

	public static void main(String[] args) {

		char[] charArray = {'a', 'b', 'c'};
		
		List<Character> charList = Arrays.asList('a', 'b', 'c');
		List<String> stringList = Arrays.asList("this", "is", "a", "test");
		
		String s = "hello";
		
		char[] charArrayFromString = s.toCharArray();
		
		for (final char c : charArrayFromString) {
			System.out.println(c);
		}
		
		System.out.println(charArray);
		System.out.println(charList);
		System.out.println(stringList);
		System.out.println(charArrayFromString);
	}
}