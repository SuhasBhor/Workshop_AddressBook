package com.service;

import java.util.Scanner;

public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("---Welcome To Address Book---");
		
		Scanner scan = new Scanner(System.in);
		//Creating a Object Of AddressBook Class
		AddressBook address = new AddressBook();
		while(true){
			System.out.println("Select Option:");
			System.out.println("1.Add Contact\n2.Edit Contact\n3.Delete Contact");
			int option = scan.nextInt();
			switch(option) {
			case 1:
				address.addContact();
				address.displayContact();
				break;
			case 2:
				address.editContact();
				address.displayContact();
				break;
			case 3:
				address.deleteContact();
				address.displayContact();
				break;
			default:
				System.out.print("---Choose Option 1 to 3---");
			}
		}
	}
}
