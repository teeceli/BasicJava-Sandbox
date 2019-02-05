package com.sandbox.examples;

public class Bird implements Animal{

	Beak beak;
	
	public Bird() {
		this.beak = new Beak();
	}
	
	@Override
	public String speak() {
		String speak = "tweet";
		System.out.println(speak);
		beak.setLength(5);
		getBeakLength();
		return speak;
	}

	@Override
	public String eat() {
		String eat = "eats bird food";
		System.out.println(eat);
		return eat;
	}
	
	public Integer getBeakLength() {
		Integer length = beak.getLength();
		System.out.println("Beak length: " + length);
		return length;
	}
}