// Functional Programming Example from Java Magazine July/August 2015
package com.sandbox.examples;

import java.util.Arrays;
import java.util.List;

public class LambdaArrayList {
  
  public static void main(String[] args) {
    
    final List<String> friends =
		Arrays.asList("Brian", "Nate", "Neal",
							"Raju", "Sara", "Scott");
  
  		// Old Approach (traditional for loop)
  		for(int i = 0; i < friends.size(); i++) {
			System.out.println(friends.get(i));
		} 
    
    	// Slightly better approach
    	for(String name : friends) {
			System.out.println(name);
		}
    
    	// Best approach using lambdas in Java 8 - below wont compile in code envy (Java 7)
    	// The forEach() is a higher-order function that accepts a lambda expression or block 
    	// of code to execute in the context of each element in the list. The variable name is 
    	// bound to each element of the collection during the call.
    	
    	//friends.forEach((final String name) ->
		//	System.out.println(name)); 
		
    	// The Java compiler also offers some lenience and can infer the types.
    	//friends.forEach((name) ->
		//	System.out.println(name)); 
    
    
    
  }
}
