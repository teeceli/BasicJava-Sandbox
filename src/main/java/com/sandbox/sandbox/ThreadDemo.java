package com.sandbox.sandbox;

public class ThreadDemo {

	public static void main(String[] args) {
		
		MyThread myThread = new MyThread();
		MyThread myThread2 = new MyThread();	
		Thread thread = new Thread(myThread);

		// Creating a thread with a new instance gives us all new objects and doesn't create conflict 
		// between the two threads. Creating a thread with the same instance shares our Balance object 
		// and thread safety becomes a concern.
		Thread thread2 = new Thread(myThread); 

		thread.start();
		
		// Have another thread come in and try to get the balance while it is being updated
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread2.start();
	}
}