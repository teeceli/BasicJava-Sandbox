package examples;

import examples.Recursion;

public class RecursionApp {
  	public static void main(String args[]) {
		Recursion ob = new Recursion(10);
		int i;

     for(i=0; i<10; i++) ob.values[i] = i;
	
     ob.printArray(10);
	}
}
