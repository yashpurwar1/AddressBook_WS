package com.bridgelabz;

import java.util.Scanner;

public class AddressBookService {
    Scanner scanner = new Scanner(System.in);

    // To take user input
    public void createContact() {
        Contacts contact = new Contacts();
        System.out.println("Enter first name : ");
        contact.setFirstName(scanner.next());
        System.out.println("Enter last name : ");
        contact.setLastName(scanner.next());
        System.out.println("Enter address : ");
        contact.setAddress(scanner.next());
        System.out.println("Enter city : ");
        contact.setCity(scanner.next());
        System.out.println("Enter state : ");
        contact.setState(scanner.next());
        System.out.println("Enter zip : ");
        contact.setZipCode(scanner.nextLong());
        System.out.println("Enter phone number : ");
        contact.setPhoneNumber(scanner.nextLong());
        System.out.println("Enter Email :");
        contact.setEmail(scanner.next());
        scanner.close();


    }

}