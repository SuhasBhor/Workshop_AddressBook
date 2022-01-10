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
			System.out.println("1.Add Contact\n2.Edit Contact\n3.Delete Contact\n4.Add AddressBook \n5.Display");
			int option = scan.nextInt();
			switch(option) {
			case 1:
				address.addContact();
				break;
			case 2:
				address.editContact();
				break;
			case 3:
				address.deleteContact();
				break;
			case 4:
				address.newAddressBook();
				break;
			case 5:
				address.displayAddressBook();
				break;
			default:
				System.out.print("---Choose Option 1 to 5---");
			}
		}
	}
}
