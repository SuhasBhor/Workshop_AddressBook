package com.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.entity.AddressBookList;
import com.entity.Contact;

public class AddressBook {
	Scanner scan = new Scanner(System.in);
	Contact contact;
	// ArrayList<Contact> contactBook = new ArrayList<>();
	ArrayList<AddressBookList> addressBookList = new ArrayList<>();
	
	//Add Contact Method To Add Contact
	public void addContact() {
		if (addressBookList.isEmpty()) {
			System.out.println("\n---Add Address Book First---\n");
			return;
		} else {
			System.out.println("Which Address Book You Want To Fill: ");
			String book = scan.next();

			System.out.println("How Many Contact You Want To Add: ");
			int n = scan.nextInt();

			for (int i = 0; i < n; i++) {
				System.out.print("Enter Your First Name: ");
				String firstName = scan.next();

				System.out.print("Enter Your Last Name: ");
				String lastName = scan.next();

				System.out.print("Enter Your Address: ");
				String address = scan.next();

				System.out.print("Enter Your City Name: ");
				String city = scan.next();

				System.out.print("Enter Your State: ");
				String state = scan.next();

				System.out.print("Enter Your Email ID: ");
				String email = scan.next();

				System.out.print("Enter Your Zip-Code: ");
				int zip = scan.nextInt();

				System.out.print("Enter Your Phone Number: ");
				long phoneNumber = scan.nextLong();

				contact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
				
					for (AddressBookList addressBook : addressBookList) {
						if (addressBook.bookName.contains(book)) {
							addressBook.contactDetails.add(contact);
							for (Contact contact : addressBook.contactDetails) {
								
							}
						}
					}
					System.out.println("\nContact Added Successfully\n");
				};
			}
		}

	// Edit Contact
	public void editContact() {
		System.out.println("Which AddressBook's Contact You Want To Edit: ");
		String book = scan.next();

		System.out.println("Enter First Name Of Contact You Want To Edit: ");
		String editedFirstName = scan.next();
		for (AddressBookList addressBook : addressBookList) {
			if (book.equals(addressBook.bookName)) {
				for (Contact person : addressBook.contactDetails) {
					if (editedFirstName.equals(contact.getFirstName())) {
						
						System.out.print("Enter New First Name :- ");
						String newFirstName = scan.next();
						person.setFirstName(newFirstName);

						System.out.print("Enter New Last Name :- ");
						String newLastName = scan.next();
						person.setLastName(newLastName);

						System.out.print("Enter New Address :- ");
						String newAddress = scan.next();
						person.setAddress(newAddress);

						System.out.print("Enter New City :- ");
						String newCity = scan.next();
						person.setCity(newCity);

						System.out.print("Enter New State :- ");
						String newState = scan.next();
						person.setState(newState);

						System.out.print("Enter New Zip Code :- ");
						int newZip = scan.nextInt();
						person.setZipCode(newZip);

						System.out.print("Enter New Phone Number :- ");
						long newPhone = scan.nextLong();
						person.setPhoneNumber(newPhone);

						System.out.print("Enter New Email :- ");
						String newEmail = scan.next();
						person.setEmail(newEmail);

						System.out.println("\n---Contact Edited---\n");
				
					} else {
						continue;
					}
				}
			}
		}
	}
	
	//Delete Method To Delete Contact 
	public void deleteContact() {
		System.out.println("Which AddressBook's Contact You Want To Delete: ");
		String book = scan.nextLine();

		System.out.println("Enter First Name Of Contact You Want To Delete: ");
		String deletedFirstName = scan.next();
		for (AddressBookList addressBook : addressBookList) {
			if (book.equals(addressBook.bookName)) {
				for (Contact contact : addressBook.contactDetails) {
					if (deletedFirstName.equals(contact.getFirstName())) {
						addressBook.contactDetails.remove(contact);
						System.out.println("\nSelected contact deleted successfully.");
						break;
					} else {
						System.out.println("The First Name You Entered Is Wrong Please Provide Right One");
						continue;
					}
				}
			}
		}
	}
	
	//Method To Add New Address Book
	public void newAddressBook() {
		System.out.println("Enter Address Book Name: ");
		String bookName = scan.next();

		if (!findAddressBook(bookName)) {
			System.out.println("This Name Address Book Already Exists");
		}

		AddressBookList obj = new AddressBookList(bookName);
		addressBookList.add(obj);

		System.out.println("New Address Book Is Added: " + obj);
	}
	
	//Method To Find The Address Book
	public boolean findAddressBook(String bookName) {
		if (addressBookList.isEmpty()) {
			return true;
		}
		for (int i = 0; i < addressBookList.size(); i++) {
			if (addressBookList.get(i).bookName.equals(bookName)) {
				return false;
			}
		}

		return true;
	}
	
	//Display Method
	public void displayAddressBook() {
		System.out.println("------Address Book List------");
		for (AddressBookList addressBookName : addressBookList) {
			System.out.println(addressBookName);
		}
	}
}
