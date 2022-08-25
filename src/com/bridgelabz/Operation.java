package com.bridgelabz;
import java.util.ArrayList;
import java.util.*;
import java.util.Iterator;
import java.util.Scanner;

public class Operation {
    //Creating array List
    static ArrayList<ContactList> contactDetails = new ArrayList();
    //Taking Scanner Class Object
    static Scanner sc = new Scanner(System.in);
    static HashMap<String, ArrayList<ContactList>> hashmap = new HashMap<>();
    // method For Adding Multiple Address Book
    public static void AddressBook(Operation operations) {
        System.out.println("Select the Choice:\n1. Add Address Book \n2. Search City or State.");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                int selection;
                do {
                    System.out.println("Enter Name For Address Book");
                    String AddressBookName = sc.next();

                    if (hashmap.containsKey(AddressBookName)) {
                        System.out.println("The AddressBook already contains");
                        break;
                    } else {
                        ArrayList<ContactList> contactDetails1 = new ArrayList<>();
                        operations.menuChoose(operations, contactDetails1);
                        hashmap.put(AddressBookName,contactDetails1);
                    }
                    System.out.println("AddressBook Added" + hashmap + " ");
                    System.out.println("1. Add New Address Book \n2. Search Contact by City or State\n3. Search Contact by State \n" +
                            "4. Search Contact by City\n5. Exit");
                    selection = sc.nextInt();
                } while (selection == 1);
            case 2:
                System.out.println("Enter City or State name to search ");
                String name = sc.next();
                SearchInMultipleBook(name);
                break;
            case 3:
                operations.searchByState();
                break;
            case 4:
                operations.searchByCity();
                break;
            default:
        }
    }
    //Search person in a Multiple Address book.
    private static List<ContactList> SearchInMultipleBook(String name) {
        for (Map.Entry<String, ArrayList<ContactList>> entry : hashmap.entrySet()) {
            for (ContactList contacts : entry.getValue()) {
                if (contacts.getCity().equals(name) || contacts.getState().equals(name)) {
                    System.out.println("\nAddress Book Name :" + entry.getKey());
                    System.out.println("First Name :" + contacts.getFirstName());
                    System.out.println("Last Name :" + contacts.getLastName());
                    System.out.println("Email-ID :" + contacts.getEmail());
                    System.out.println("Address :" + contacts.getAddress());
                    System.out.println("City Name :" + contacts.getCity());
                    System.out.println("Contact Number :" + contacts.getContactNo());
                }
            }
        }
        System.out.printf("No record found:");
        return null;
    }
    public void SearchInSingleBook(ArrayList<ContactList> contactdetails){
        System.out.println("Enter name of city or state to search");
        String name=sc.next();
        ArrayList<ContactList> contacts=new ArrayList<>();
        for (ContactList contact:contactdetails){
            if(contact.getCity().equals(name)||contact.getState().equals(name))
            {
                contacts.add(contact);
            }
            System.out.println(contact);
        }
    }
    public void searchByCity() {
        System.out.println("Enter the city:");
        String city = sc.next();
        contactDetails.stream().filter(contacts -> contacts.getCity().equalsIgnoreCase(city)).forEach(contacts -> System.out.println(contacts));
    }
    public void searchByState() {
        System.out.println("Enter the State:");
        String state = sc.next();
        contactDetails.stream().filter(contacts -> contacts.getState().equalsIgnoreCase(state)).forEach(contacts -> System.out.println(contacts));
    }
    /*
       Create addDetails method
       create info contact Class object
        */
    public static ArrayList<ContactList> addDetails(ArrayList<ContactList> contactsDetails) {
        ContactList info = new ContactList();
        if (contactsDetails.size() == 0) {
            System.out.println("Enter the First Name");
            info.setFirstName(sc.next());
            System.out.println("Enter the Last Name");
            info.setLastName(sc.next());
            System.out.println("Enter the Address");
            info.setAddress(sc.next());
            System.out.println("Enter the city");
            info.setCity(sc.next());
            System.out.println("Enter the State");
            info.setState(sc.next());
            System.out.println("Enter the your zip Code");
            info.setZip(sc.next());
            System.out.println("Enter the Contact Number");
            info.setContactNo(sc.next());
            System.out.println("Enter the Email Id");
            info.setEmail(sc.next());
            contactsDetails.add(info);
            System.out.println("Contact details added");
        }
        else {
            System.out.println("Enter first name");
            String firstName = sc.next();
            /*
            For searching the duplicate names in arraylist
            */
            for (ContactList contacts : contactsDetails) {
                // checking the duplicate name.
                if (contacts.getFirstName().equals(firstName)) {
                    System.out.println("The Name is already present.");
                    Operation.addDetails(contactsDetails);
                }
            }
            System.out.println("Re-enter first name");
            info.setFirstName(sc.next());
            System.out.println("Enter Last Name");
            info.setLastName(sc.next());
            System.out.println("Enter contact Number:");
            info.setContactNo(sc.next());
            System.out.println("Enter Email: ");
            info.setEmail(sc.next());
            System.out.println("Enter Address: ");
            info.setAddress(sc.next());
            System.out.println("Enter City Name: ");
            info.setCity(sc.next());
            System.out.println("Enter State: ");
            info.setState(sc.next());
            System.out.println("Enter Zip Code:");
            info.setZip(sc.next());
            contactsDetails.add(info);
        }
        return contactsDetails;
    }
    public void displayContacts(ArrayList<ContactList> contactDetails) {
        for (ContactList contactDetailsValue : contactDetails) {
            System.out.println(contactDetailsValue);
        }
    }
    /*
       Another method is to create editDetails
       Edit details you want to editing in the respective information by using switch case
     */
    public void editDetails(ArrayList<ContactList> contactDetails) {
        System.out.println("Enter the first name you want to edit ");
        String searchFirstName = sc.next();
        // taking for each loop
        for (ContactList contact : Operation.contactDetails) {
            // taking name variable and store the first name that you want to edit
            String name = contact.getFirstName();
            // checking if condition your input first name is equal to search first name or not by equals function
            System.out.println(name);
            if (name.equals(searchFirstName)) {
                System.out.println("1. First Name \n2. Last Name \n3. Address \n4. City " +
                        "\n5. State \n6. Zip Code \n7. Contact No \n8. Email");
                System.out.println("Enter value to update: ");
                int num = sc.nextInt();
                switch (num) {
                    case 1:
                        System.out.println("Enter the first name You want to update");
                        String updatedFirstName = sc.next();
                        contact.setFirstName(updatedFirstName);
                        //displayContacts();
                        break;
                    case 2:
                        System.out.println("Enter the Last NAme You want to update");
                        String updatedLastName = sc.next();
                        contact.setLastName(updatedLastName);
                        //displayContacts();
                        break;
                    case 3:
                        System.out.println("Enter the Address You want to update");
                        String updatedAddress = sc.next();
                        contact.setAddress(updatedAddress);
                        //displayContacts();
                        break;
                    case 4:
                        System.out.println("Enter the City You want to update");
                        String updatedCity = sc.next();
                        contact.setCity(updatedCity);
                        //displayContacts();
                        break;
                    case 5:
                        System.out.println("Enter the State You want to update");
                        String updatedState = sc.next();
                        contact.setState(updatedState);
                        //displayContacts();
                        break;
                    case 6:
                        System.out.println("Enter the Zip code You want to update");
                        String updatedZipCode = sc.next();
                        contact.setZip(updatedZipCode);
                        //displayContacts();
                        break;
                    case 7:
                        System.out.println("Enter the Contact numberYou want to update");
                        String updatedContact = sc.next();
                        contact.setContactNo(updatedContact);
                        //displayContacts();
                        break;
                    case 8:
                        System.out.println("Enter the email You want to update");
                        String updatedEmail = sc.next();
                        contact.setEmail(updatedEmail);
                        //displayContacts();
                        break;
                    default:
                        System.out.println("Invalid number!");
                }
                System.out.println("details updated");
            } else
                System.out.println("No record found!");
        }
    }
    public void deleteContact(ArrayList<ContactList> contactDetails) {
        System.out.println("Enter First Name for which you want to delete contact: ");
        String firstname = sc.next();
        Iterator<ContactList> removeContact = Operation.contactDetails.iterator();
        /*   Checking the next element where
         *   condition holds true till there is single element
         *   in the List using hasNext() method
         */
        while (removeContact.hasNext()) {
            /*  Move cursor to next element */
            ContactList nextElement = removeContact.next();
            if (nextElement.getFirstName().equals(firstname)) {
                removeContact.remove();
                System.out.println("Contact is removed!");
                break;
            } else {
                System.out.println("Contact not found.");
            }
        }
    }
    public static void menuChoose(Operation operations, ArrayList<ContactList> contactDetails){
        Scanner sc = new Scanner(System.in);
        int chooseNumber;
        do {
            System.out.println("Enter the number that you want to choose to perform the certain task");
            System.out.println("1. Add Details \n2. Edit Details \n3. Delete Details \n4. Display Details \n5. exit ");
            chooseNumber = sc.nextInt();

            switch (chooseNumber){
                /*  Add contact details in address book */
                case 1:
                    System.out.println("Add Details");
                    operations.addDetails(contactDetails);
                    break;
                case 2:
                    /*  Edit contact details in address book */
                    System.out.println("Edit details");
                    operations.editDetails(contactDetails);
                    break;
                /*  Delete contact details */
                case 3:
                    System.out.println("Delete Details");
                    operations.deleteContact(contactDetails);
                    break;
                /*  Display contact details */
                case 4:
                    System.out.println("Display details");
                    operations.displayContacts(contactDetails);
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("invalid Option choose");
                    break;
            }
        }while (chooseNumber != 5 );
    }
}
