package com.sandbox.designpatterns;

public class SingletonRunner {

	public static void main(String[] args) {
		// This throws a compile error
		//Singleton singleton = new Singleton();
		
		Singleton singleton = Singleton.getInstance();
		
		Singleton singleton2 = Singleton.getInstance();
		
		if (singleton == singleton2) {
			singleton.showMessage();
		}
	}
}