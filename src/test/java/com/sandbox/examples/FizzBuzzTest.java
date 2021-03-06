package com.sandbox.examples;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sandbox.examples.FizzBuzz;

// Write an algorithm that prints all numbers between 1 and n, replacing multiples of 3 
// with the String Fizz, multiples of 5 with Buzz, and multiples of 15 with FizzBuzz.
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-context.xml"})
public class FizzBuzzTest {
	
	@Autowired
	private FizzBuzz fizzBuzz;
	
	@Test(expected=AssertionError.class)
	public void fizzBuzzNull() {
		
		@SuppressWarnings("unused")
		List<String> actualList = fizzBuzz.buzz(null);
	}
	
	@Test
	public void fizzBuzzTest1() {
		
		Integer n = 1;
		
		List<String> expectedList = new ArrayList<>();
		expectedList.add("1");
		
		List<String> actualList = fizzBuzz.buzz(n);
		
		assertNotNull(actualList);
		assertEquals(expectedList, actualList);
	}
	
	@Test
	public void fizzBuzzTest3() {
		
		Integer n = 3;

		List<String> expectedList = new ArrayList<>();
		expectedList.add("1");
		expectedList.add("2");
		expectedList.add("Fizz");
		
		List<String> actualList = fizzBuzz.buzz(n);
		
		assertNotNull(actualList);
		assertEquals(expectedList, actualList);
	}

	@Test
	public void fizzBuzzTest5() {
		
		Integer n = 5;

		List<String> expectedList = new ArrayList<>();
		expectedList.add("1");
		expectedList.add("2");
		expectedList.add("Fizz");
		expectedList.add("4");
		expectedList.add("Buzz");
			
		List<String> actualList = fizzBuzz.buzz(n);
		
		assertNotNull(actualList);
		assertEquals(expectedList, actualList);
	}

	@Test
	public void fizzBuzzTest15() {
		
		Integer n = 15;

		List<String> expectedList = new ArrayList<>();
		expectedList.add("1");
		expectedList.add("2");
		expectedList.add("Fizz");
		expectedList.add("4");
		expectedList.add("Buzz");
		expectedList.add("Fizz");
		expectedList.add("7");
		expectedList.add("8");
		expectedList.add("Fizz");
		expectedList.add("Buzz");
		expectedList.add("11");
		expectedList.add("Fizz");
		expectedList.add("13");
		expectedList.add("14");
		expectedList.add("FizzBuzz");
				
		List<String> actualList = fizzBuzz.buzz(n);
		
		assertNotNull(actualList);
		assertEquals(expectedList, actualList);
	}
}