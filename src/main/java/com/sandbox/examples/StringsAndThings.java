package com.sandbox.examples;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StringsAndThings {

	final static Logger logger = LoggerFactory.getLogger(StaticInitialization.class);

	public static void main(String[] args) {

		// Immutable Strings
		String s1 = "test";
		
		String s2 = s1;
		
		s1 = "another test";
				
		logger.info(s2.toUpperCase());		// TEST

		logger.info(s2);					// test
		
		// s1 changes reference. If strings were mutable what we did for s1 would be applied to s2 as well. 
	}

}
