package com.service;

import java.util.Scanner;

import com.entity.Contact;

public class AddressBook {
	Scanner scan = new Scanner(System.in);
	
	//Method To Add Contact
	public void addContact() {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter Your First Name: ");
		String firstName = scan.next();
		
		System.out.print("Enter Your Last Name: ");
		String lastName = scan.next();
		
		System.out.print("Enter Your Address:");
		String address = scan.next();
		
		System.out.print("Enter Your City:");
		String city = scan.next();
		
		System.out.print("Enter Your State:");
		String state = scan.next();
		
		System.out.print("Enter Your Zip Code: ");
		int zipCode = scan.nextInt();
		
		System.out.print("Enter Your Phone Number: ");
		long phoneNumber = scan.nextLong();
		
		System.out.print("Enter Your Email: ");
		String email = scan.next();
		
		// Creating A Object of Contact Class 
		Contact contact = new Contact(firstName, lastName, address, city, state, zipCode, phoneNumber, email);
	}
}
