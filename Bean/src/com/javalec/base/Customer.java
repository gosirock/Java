package com.javalec.base;

public class Customer {

	// Field
	
	int number;
	String name;
	String phone;
	
	// Constructor
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int number, String name, String phone) {
		super();
		this.number = number;
		this.name = name;
		this.phone = phone;
	}

		// Method
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	
	
	
	
	
}
