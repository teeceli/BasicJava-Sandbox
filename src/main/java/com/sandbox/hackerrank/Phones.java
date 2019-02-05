package com.sandbox.hackerrank;

import java.util.*;
import java.util.Map.Entry;

// NOTE: Do not change the name of this class or make it public!
//       If you do, automated grading might fail, and you will not get full credit!
//
class Person {
	private String firstName, lastName;
	public Person(String first, String last) {
		if (first == null || last == null) {
			throw new NullPointerException();
		}
		firstName = first;
		lastName = last;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}
    // Add additional code, if necessary, here. Do not remove existing methods!
}

// NOTE: Do not change the name of this class or make it public!
//       If you do, automated grading might fail, and you will not get full credit!
//
class PhoneBook implements PhoneBookInterface{
	
	Map<Long, Person> phoneNumberMap = new HashMap<>();
	
	@Override
	public void addRecord(final Long phoneNumber, final Person p) {
		
		phoneNumberMap.put(phoneNumber, p);
	}

	@Override
	public Long getPhoneNumber(final Person p) {
		
		// Figure out how to get phone number by Person value in hashmap. Will come back to this
		//Integer phoneNumber = phoneNumberMap
		Long phoneNumber = null;
		
		for (Entry<Long, Person> entry : phoneNumberMap.entrySet()) {
			if (Objects.equals(p, entry.getValue())) {
				phoneNumber = entry.getKey();
			}
		}
				
		return phoneNumber;
	}
}

interface PhoneBookInterface {
    
	void addRecord(final Long number, final Person p);
    
	Long getPhoneNumber(final Person p);
}
