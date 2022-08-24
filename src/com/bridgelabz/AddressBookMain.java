package com.bridgelabz;
import java.util.ArrayList;
import java.util.Scanner;
public class AddressBookMain {
    ArrayList <ContactList> contactsDetails = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void addPersonDetails(){
        ContactList info = new ContactList();
        System.out.print("Enter your First Name: ");
        info.setFirstName(sc.nextLine());

        System.out.print("Enter Last Name: ");
        info.setLastName(sc.nextLine());

        System.out.print("Enter Your Address: ");
        info.setAddress(sc.nextLine());

        System.out.print("Enter your city: ");
        info.setCity(sc.nextLine());

        System.out.print("Enter your State: ");
        info.setState(sc.nextLine());

        System.out.print("Enter your zip Code: ");
        info.setZipCode(sc.nextLine());

        System.out.print("Enter your Contact Number: ");
        info.setContactNumber(sc.nextLine());

        System.out.print("Enter your Email Address: ");
        info.setEmailAddress(sc.nextLine());

        contactsDetails.add(info);
    }
    public void displayContacts(){
        System.out.println(contactsDetails);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Page");
        AddressBookMain person1 = new AddressBookMain();
        person1.addPersonDetails();
        person1.displayContacts();
    }
}
