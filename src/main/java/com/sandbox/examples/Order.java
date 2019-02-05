package com.sandbox.examples;

public class Order {
	
	public Order(long orderId, String firstName, String lastName, String location, String order) {
		this.orderId = orderId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.location = location;
		this.order = order;
	}
	
	public Order() {}

	private long orderId;
  
	private String firstName;
	
  	private String lastName;
	
  	private String location;
	
  	private String order;
	
	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public String getFirstName() {
		return firstName;
	}
  
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
  
	public String getLastName() {
		return lastName;
	}
  
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
  
	public String getLocation() {
		return location;
	}
  
	public void setLocation(String location) {
		this.location = location;
	}
  
	public String getOrder() {
		return order;
	}
  
	public void setOrder(String order) {
		this.order = order;
	}
  
	@Override
	public String toString() {
		return "CurrentOrder [firstName=" + firstName + ", lastName="
				+ lastName + ", location=" + location + ", order=" + order
				+ ", orderId=" + orderId + "]";
	}
  
}