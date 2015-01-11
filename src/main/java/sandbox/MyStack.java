package sandbox;

import java.util.Arrays;

public class MyStack {
	
	// constructor creates array with correct size
	// push each character onto stack
	// pop each char from stack 
	
	private char[] stackArray;
	private int top;
	private int max;
	
	public MyStack(int maxSize) {	
		max = maxSize;
		stackArray = new char[maxSize];
		top = 0;	
	}
	
	public void howLarge() {	
		System.out.println("Size of word: " + max);
	}

	public void push(char charAt) {	
		stackArray[top++] = charAt;
		System.out.println("top: " + top);
	}
	
	public char pop() {
		return stackArray[--top];
	}

	@Override
	public String toString() {
		return "MyStack [stackArray=" + Arrays.toString(stackArray) + "]";
	}
	
}
