package program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author Christopher Dubeau
 * @author Ron Rayas
 * @author Harpreet Setia
 * @author Long Xu Date: 11/18/14
 * Description: This is the main class for the Contact List program.
 */

public class ContactListApplication {

    static Scanner keyboard = new Scanner(System.in);
    static ContactList contactList = new ContactList();
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    /**
     * This is the main method for the application
     * @param args
     */
    public static void main(String args[]) throws IOException {
        //contactList.readContactListFromFile();
        int i = 1;
        while((i > 0) && (i < 8)){
            menu();
        }

    }

    /**
     * This method will exit the program.
     */
    public static void exit() {
        System.exit(0);
    }

    /**
     * This method will return a contact specified by the parameter index.
     *
     * @return
     */
    public static Contact getContact(int index) {
        return contactList.getContact(index);
    }

    /**
     * This method is a menu from which the user will determine the action they
     * want to take with the program.
     *
     * @return
     */
    public static void menu() {

        System.out.println("-- Actions --");
        System.out.println("Select an option: \n"
                + "  1) Enter a new person\n"
                + "  2) Print the contact list\n"
                + "  3) Retreive a persons information by last name \n"
                + "  4) Retrieve a person's information by email address\n"
                + "  5) Retrieve all people who live in a given zip code \n"
                + "  6) Print the sorted contact list\n"
                + "  7) Save all contacts\n"
                + "  0) Exit menu");

        int selection = keyboard.nextInt();
        keyboard.nextLine();

        switch (selection) {
            case 1:
                // Enter new person
                try {
                    addContact();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 2:
                // Print the information
                printContacts();
                break;
            case 3:
                // Retrieve info by last name
                String lastName = "";
                while(lastName.length() < 1) {
                    System.out.print("What is the persons last name? ");
                    lastName = keyboard.next();
                }
                contactList.searchByLastName(lastName);
                break;
            case 4:
                String email = "";
                System.out.print("What is the email address? ");
                    email = keyboard.next();
                    contactList.searchByEmail(email);
                break;
            case 5:
                String zipCode = "";
                System.out.print("What is the zip code? ");
                zipCode = keyboard.next();
                contactList.searchByZipCode(zipCode);
                break;
            case 6:
                contactList.sortContactList();
                break;
            case 7:
                contactList.writeContactListToFile();
            case 0:
                exit();
                break;
            default:
                System.out.println("Invalid selection.");
                break;
        }
    }

    /**
     * This method outputs to the console the contact list
     */
    public static void printContacts() {

        System.out.print(contactList);
    }

    /**
     * This method prompts the user for values to add a contact to the contact list.
     * @throws IOException
     */
    public static void addContact() throws IOException {
        Contact contact = new Contact();
        System.out.print("What is the First name: ");
        contact.setFirstName(reader.readLine());
        String lastName = "";
        while(lastName.length() < 1) {
            System.out.print("What is the Last name: ");
            lastName = reader.readLine();
            contact.setLastName(lastName);
        }
        System.out.print("What is the Phone Number: ");
        contact.setPhoneNumber(reader.readLine());
        System.out.print("What is your Email Address: ");
        contact.setEmailAddress(reader.readLine());
        System.out.print("What is the Zip Code: ");
        contact.setZipCode(reader.readLine());
        contactList.addContact(contact);

        menu();

    }
}