package com.bridgelabz;

public class AddressBookMain {
    public static void main (String[] args){
        // Welcome message
        System.out.println("Welcome to address book");

        // Created object for AddressBookServiceClass.
        AddressBookService addressBookService = new AddressBookService();
        // Calling create person.
        addressBookService.createContact();
    }
}
