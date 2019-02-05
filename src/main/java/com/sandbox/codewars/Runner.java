package com.sandbox.codewars;

import org.slf4j.LoggerFactory;

import org.slf4j.Logger;

public class Runner {

	final static Logger logger = LoggerFactory.getLogger(Runner.class);

	public static void main(String[] args) {
		
		JadenCase jc = new JadenCase();
		
		String test = "hello world";
		
		String result = jc.toJadenCase(test);
		
		logger.info(result);
	}

}
