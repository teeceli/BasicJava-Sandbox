package com.sandbox.examples;

// Example from Oracle Java Complete Reference p.350
public class GenericsWildcardDemo {
	
  public static void main(String args[]) {
		
		Integer inums[] = { 1, 2, 3, 4, 5 };
		Generics<Integer> iob = new Generics<Integer>(inums);
		double v = iob.average();
		System.out.println("iob average is " + v);
     
		Double dnums[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		Generics<Double> dob = new Generics<Double>(dnums);
		double w = dob.average();
		System.out.println("dob average is " + w);
     
		Float fnums[] = { 1.0F, 2.0F, 3.0F, 4.0F, 5.0F };
		Generics<Float> fob = new Generics<Float>(fnums);
		double x = fob.average();
		System.out.println("fob average is " + x);
     
      // See which arrays have same average.
      System.out.print("Averages of iob and dob ");
      if(iob.sameAvg(dob)) {
			System.out.println("are the same.");
      } else {
      	System.out.println("differ.");
      }
        
		System.out.print("Averages of iob and fob ");
      if(iob.sameAvg(fob)) {
      	System.out.println("are the same.");
      } else {
      System.out.println("differ.");
      }
    
	}
}

