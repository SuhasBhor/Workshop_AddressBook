package com.entity;

public class Contact {
	
	//Initialize variables
	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	int zipCode;
	long phoneNumber;
	String email;
	
	//Parameterized Constructor
	public Contact(String firstName, String lastName, String address, String city, String state, int zipCode,
			long phoneNumber, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
}
