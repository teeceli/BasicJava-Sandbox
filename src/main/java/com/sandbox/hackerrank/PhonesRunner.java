package com.sandbox.hackerrank;

public class PhonesRunner {

	public static void main(String[] args) {
		
		PhoneBook pb = new PhoneBook();

		Person p = new Person("John", "Doe");
		Long phoneNumber = 5551234567L;

		Person p2 = new Person("Homer", "Simpson");		
		Long phoneNumber2 = 5551234568L;
		
		pb.addRecord(phoneNumber, p);
		pb.addRecord(phoneNumber2, p2);
		
		Long number = pb.getPhoneNumber(p2);
		
		System.out.println(number);	
	}
}