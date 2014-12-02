package program;

import program.Contact;
import program.ContactList;

import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;

/**
 * @author Christopher Dubeau
 * @author Ron Rayas
 * @author Harpreet Setia
 * @author Long Xu Date: 11/18/14 Description: This class controls the program.
 *         It reads and prints out a contact or contact list.
 */

public class ContactListApplication {
    static Scanner keyboard = new Scanner(System.in);
    static ContactList contactList = new ContactList();
    static BufferedReader reader = new BufferedReader(new InputStreamReader(
            System.in));

    public static void main(String args[]) {

        ContactList contactList = new ContactList();
        menu();

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
        System.out.println("Select an option: \n" + "  1) Enter a new person\n"
                + "  2) Print the contact list\n"
                + "  3) Retreive a persons information by last name \n"
                + "  4) Retrieve a person's information by email address\n"
                + "  5) Retrieve all people who live in a given zip code \n"
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
                // searchByLast();
                break;
            case 4:
                // Retrieve info by email
                // searchByEmail();
                break;
            case 5:
                // Retrieve info by zip code
                // searchByZip();
                break;
            case 0:
                exit();
                break;
            default:
                System.out.println("Invalid selection.");
                break;
        }
    }

    public static void printContacts() {

        System.out.print(contactList);
    }

    public static void addContact() throws IOException {
        Contact contact = new Contact();
        System.out.println("What is the First name: ");
        contact.setFirstName(reader.readLine());
        // last name
        System.out.println("What is the Phone Number: ");
        contact.setPhoneNumber(reader.readLine());
        System.out.println("What is your Email Address: ");
        contact.setEmailAddress(reader.readLine());
        System.out.println("What is the Zip Code: ");
        contact.setZipCode(reader.readLine());
        contactList.addContact(contact);

        menu();

    }
}