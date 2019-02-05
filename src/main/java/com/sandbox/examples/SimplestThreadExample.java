package com.sandbox.examples;

public class SimplestThreadExample implements Runnable{

	public static void main(String[] args) {
		 (new Thread(new SimplestThreadExample())).start();
	}

	@Override
	public void run() {
		System.out.println("Hello from the thread");
	}
}