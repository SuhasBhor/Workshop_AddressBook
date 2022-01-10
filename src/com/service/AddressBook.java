package com.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.entity.Contact;

public class AddressBook {
	Scanner scan = new Scanner(System.in);

	// ArrayList To Store Contact
	ArrayList<Contact> contactBook = new ArrayList<>();

	// Method To Add Contact
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

		// Add Contact In ArrayList
		contactBook.add(contact);
	}

	public void displayContact() {
		System.out.println("---Contacts In Address Book--");
		for (Contact person : contactBook) {
			System.out.println(person.toString());
		}
	}

	// Edit Contact
	public void editContact() {
		System.out.println("\nEnter first name to edit :- ");
		String editedFirstName = scan.next();

		for (Contact person : contactBook) {
			if (editedFirstName.equalsIgnoreCase(person.getFirstName())) {

				System.out.print("Enter new first name :- ");
				String newFirstName = scan.next();
				person.setFirstName(newFirstName);

				System.out.print("Enter new last name :- ");
				String newLastName = scan.next();
				person.setLastName(newLastName);

				System.out.print("Enter new Address :- ");
				String newAddress = scan.next();
				person.setAddress(newAddress);

				System.out.print("Enter new city name :- ");
				String newCity = scan.next();
				person.setCity(newCity);

				System.out.print("Enter new state name :- ");
				String newState = scan.next();
				person.setState(newState);

				System.out.print("Enter new Zip code :- ");
				int newZip = scan.nextInt();
				person.setZipCode(newZip);

				System.out.print("Enter new phonr number :- ");
				long newPhone = scan.nextLong();
				person.setPhoneNumber(newPhone);

				System.out.print("Enter new email :- ");
				String newEmail = scan.next();
				person.setEmail(newEmail);

				System.out.println("Contact edited Successfully.");
			} else {
				continue;
			}
		}
	}
}
