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
 * Description: This class is the main and it controls the program. It has a menu that prompts the 
 * user with several different options regarding the contact list.
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

        runApplication();

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
     * @return  int
     */
    public static int menu() {

        System.out.println("-- Actions --");
        System.out.println("Select an option: \n"
                + "  1) Enter a new person\n"
                + "  2) Print the contact list\n"
                + "  3) Retreive a persons information by last name \n"
                + "  4) Retrieve a person's information by email address\n"
                + "  5) Retrieve all people who live in a given zip code \n"
                + "  6) Sort the and print the contact list\n"
                + "  7) Save all contacts\n"
                + "  0) Exit menu");

        int selection = keyboard.nextInt();
        keyboard.nextLine();
        return selection;
    }

    /**
     * This method starts the application, loads the contact list from the file and calls the menu method
     * @throws IOException
     */
    public static void runApplication() throws IOException {
        contactList.readContactListFromFile();
        int selection = 1;
        while(selection > 0 && selection < 8) {
            selection = menu();
            switch (selection) {
                case 1:
                    try {
                        addContact();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    printContacts();
                    break;
                case 3:
                    contactList.searchByLastName();
                    break;
                case 4:
                    contactList.searchByEmail();
                    break;
                case 5:
                    contactList.searchByZipCode();
                    break;
                case 6:
                    contactList.sortContactList();
                    System.out.print(contactList.toString());
                    break;
                case 7:
                    contactList.writeContactListToFile();
                    break;
                case 0:
                    exit();
                    break;
                default:
                    System.out.println("Invalid selection.");
                    break;
            }
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

        System.out.print("What is the Last name: ");
        lastName = reader.readLine();
        contact.setLastName(lastName);

        System.out.print("What is the Phone Number: ");
        contact.setPhoneNumber(reader.readLine());
        System.out.print("What is your Email Address: ");
        contact.setEmailAddress(reader.readLine());
        System.out.print("What is your Street Address: ");
        contact.setStreetAddress(reader.readLine());
        System.out.print("What is the Zip Code: ");
        contact.setZipCode(reader.readLine());
        System.out.print("Are there any notes: ");
        contact.setNotes(reader.readLine());
        if(lastName.length()  > 0) {
            contactList.addContact(contact);
        }

    }
}
