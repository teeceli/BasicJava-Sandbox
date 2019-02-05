package com.sandbox.sort;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sandbox.examples.StaticInitialization;

public class BubbleSort {
	
	final static Logger logger = LoggerFactory.getLogger(StaticInitialization.class);
	
	final static Integer[] intArray = { 3, 7, 5, 9, 6 };
		
	public static void main(String[] args) {
	
		boolean numbersSwitched = false;
		
		/* The do/while loop here is the key otherwise we just go through the array once with the for loop. With each pass 
	    	through the for loop we can only make one switch. The best case is when the list is already sorted and we only
			need one pass through the array O(n). Worst case is if the array is reverse sorted and we have to switch every number
			O(n^2) */
		
		do {
			
			for (int i = 0; i < intArray.length - 1; i++ ) {    
				if (intArray[i] > intArray[i + 1]) {
					Integer tmp = intArray[i];
					intArray[i] = intArray[i + 1];
					intArray[i + 1] = tmp;
					numbersSwitched = true;	
				} else {
					numbersSwitched = false;
				}		
			}
			
		} while (numbersSwitched);
		
		logger.info("final order: ");
		
		for (Integer num : intArray) {
			logger.info(num.toString());
		}
		
	}

}
