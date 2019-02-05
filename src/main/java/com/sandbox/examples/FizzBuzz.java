package com.sandbox.examples;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.springframework.stereotype.Component;

@Component
public class FizzBuzz {
	
	// Write an algorithm that prints all numbers between 1 and n, replacing multiples of 3 
	// with the String Fizz, multiples of 5 with Buzz, and multiples of 15 with FizzBuzz.
	public List<String> buzz(final Integer n) {
		
		Assert.assertNotNull(n);
		
		List<String> resultList = new ArrayList<>();
		
		for (Integer i = 1; i <= n; i++) {
			if (i % 15 == 0) {
				resultList.add("FizzBuzz");
			
			} else if (i % 5 == 0) {
				resultList.add("Buzz");

			} else if (i % 3 == 0) {
				resultList.add("Fizz");

			} else {
				resultList.add(i.toString());
			}
		}
		
		System.out.println(resultList);
		
		return resultList;
	}
}