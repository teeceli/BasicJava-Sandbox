package com.sandbox.codewars;
import org.junit.Test;

import com.sandbox.codewars.VowelCount;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;

@Ignore
public class VowelCountTest {
   
	@Test
    public void testCase1() {
      assertEquals("Nope!", 5, VowelCount.getCount("abracadabra"));
    }
    
}