package com.sandbox.examples;

// Example from Oracle:Complete Java Reference book on recursion that didn't look correct to me
	
public class Recursion {
  int values[];
  
  Recursion(int i) {
    values = new int[i];
  }

  // display array -- recursively
	void printArray(int i) {
     if(i == 0) {
       return;
     } else {
       printArray(i-1);
     } 
	
     System.out.println("[" + (i-1) + "] " + values[i-1]);
	}
}
