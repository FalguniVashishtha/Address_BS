package com.bridgelabz;

public class AddressBookMain {
    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program!");
        //Creating object
        ContactList contacts = new ContactList();
        contacts.setFirstName("falguni");
        System.out.println("First Name: "+contacts.getFirstName());
        contacts.setLastName("Vashishtha");
        System.out.println("Last Name: "+contacts.getLastName());
        contacts.setAddress("Psafff");
        System.out.println("Address: "+contacts.getAddress());
        contacts.setCity("Delhi");
        System.out.println("City: "+contacts.getCity());
        contacts.setState("Delhi");
        System.out.println("State: "+contacts.getState());
        contacts.setZipCode("103001");
        System.out.println("Pin Code: "+contacts.getZipCode());
        contacts.setContactNumber("1234567890");
        System.out.println("Contact Number: "+contacts.getContactNumber());
        contacts.setEmailAddress("hsvdhgsv@gmail.com");
        System.out.println("Email Address: "+contacts.getEmailAddress());
    }
}
