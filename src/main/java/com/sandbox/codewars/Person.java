package com.sandbox.codewars;

public class Person {
	String name;

	public Person(String personName) {
		name = personName;
	}
	
	public String greet(Person person, Person otherPerson) {
		return String.format("Hi %s, my name is %s", person.name, otherPerson.name);
	}
}
