package com.sandbox.designpatterns;

public class Singleton {
	
	private static Singleton instance = null;
	
	private Singleton() {}  // Make the constructor private so that this class can't be instantiated.
	
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		
		return instance;
	}
	
	public void showMessage() {
		System.out.println("Testing...");
	}
}