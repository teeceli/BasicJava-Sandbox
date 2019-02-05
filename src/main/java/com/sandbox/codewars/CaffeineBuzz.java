package com.sandbox.codewars;

public class CaffeineBuzz {
	  public String caffeineBuzz(int n){
	  
	    String tmp;
	    
	    if (n % 3 == 0) {
	      if (n % 4 == 0) {
	        tmp = "Coffee";
	      } else {
	        tmp = "Java";
	      }
	    } else {
	      return "mocha_missing!";
	    }
	    
	    if (n % 2 == 0) {
	      tmp = tmp + "Script";
	    }
	    
	    return tmp;
	  }
	    
}
