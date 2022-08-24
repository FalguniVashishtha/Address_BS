package com.bridgelabz;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
public class AddressBookMain {
        static CollectionBook addressBooks = new CollectionBook();
        //Main Method
        public static void main(String args[]) {
            System.out.println("Welcome to Address Book Page"); //Welcome Message
            CollectionBook.addressBooks(); //calling method from CollectionBook Class
            CollectionBook.chooseOption();
            System.out.println("\nAddress books and the current contact Details are: ");
            System.out.println(addressBooks.book);
        }
}