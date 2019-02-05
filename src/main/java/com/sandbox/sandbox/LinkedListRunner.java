package com.sandbox.sandbox;

public class LinkedListRunner {

	public static void main(String[] args) {

		MyLinkedList mll = new MyLinkedList();

		mll.add("hello");
		
		mll.add("hi");

		mll.add("test");
		
		System.out.println(mll);
		System.out.println(mll.getCount());
	}
}