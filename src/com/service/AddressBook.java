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
		
		System.out.print("\n---Contact Added Into Address Book---\n");
	}
	
	//Display Method To Display Method
	public void displayContact() {
		System.out.println("\n---Contacts In Address Book---\n");
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

				System.out.println("\n---Contact Edited---\n");
			} else {
				continue;
			}
		}
	}

	//Delete Method To delete Contact
	public void deleteContact() {
		System.out.print("Enter First Name Of Contact You Want Delete:- ");
		String deleteByName = scan.next();

		for (int i = 0; i < contactBook.size(); i++) {
			String FindingName = contactBook.get(i).getFirstName();

			if (deleteByName.equals(FindingName)) {
				contactBook.remove(i);
				System.out.println("\n---Contact Deleted From Address Book---\n");
				break;
			} else {
				continue;
			}
		}
	}
}
