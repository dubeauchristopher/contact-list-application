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

    private static Scanner keyboard = new Scanner(System.in);
    private static ContactList contactList = new ContactList();
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

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


/*
-- Actions --
Select an option:
  1) Enter a new person
  2) Print the contact list
  3) Retreive a persons information by last name
  4) Retrieve a person's information by email address
  5) Retrieve all people who live in a given zip code
  6) Sort the and print the contact list
  7) Save all contacts
  0) Exit menu

1
What is the First name: Christopher
What is the Last name: Dubeau
What is the Phone Number: 000-000-0000
What is your Email Address: chris@email.com
What is your Street Address: 1 Main Street
What is the Zip Code: 94022
Are there any notes: no notes for chris
-- Actions --
Select an option:
  1) Enter a new person
  2) Print the contact list
  3) Retreive a persons information by last name
  4) Retrieve a person's information by email address
  5) Retrieve all people who live in a given zip code
  6) Sort the and print the contact list
  7) Save all contacts
  0) Exit menu
1
What is the First name: Ron
What is the Last name: Rayas
What is the Phone Number: 000-000-0000
What is your Email Address: ronemail.com
What is your Street Address: 2 main st
What is the Zip Code: 94022
Are there any notes: Yes
-- Actions --
Select an option:
  1) Enter a new person
  2) Print the contact list
  3) Retreive a persons information by last name
  4) Retrieve a person's information by email address
  5) Retrieve all people who live in a given zip code
  6) Sort the and print the contact list
  7) Save all contacts
  0) Exit menu
1
What is the First name: Long
What is the Last name: Xu
What is the Phone Number: 415-521-8122
What is your Email Address: xulonggg@gmail.com
What is your Street Address: 152 thrid street
What is the Zip Code: 94041
Are there any notes: Yes
-- Actions --
Select an option:
  1) Enter a new person
  2) Print the contact list
  3) Retreive a persons information by last name
  4) Retrieve a person's information by email address
  5) Retrieve all people who live in a given zip code
  6) Sort the and print the contact list
  7) Save all contacts
  0) Exit menu
1
What is the First name: Harpreet
What is the Last name: Setia
What is the Phone Number: 444-555-4545
What is your Email Address: harpreet@gmail.com
What is your Street Address: 444 main street
What is the Zip Code: 94087
Are there any notes: So many notes
-- Actions --
Select an option:
  1) Enter a new person
  2) Print the contact list
  3) Retreive a persons information by last name
  4) Retrieve a person's information by email address
  5) Retrieve all people who live in a given zip code
  6) Sort the and print the contact list
  7) Save all contacts
  0) Exit menu
  7
Contacts saved.
-- Actions --
Select an option:
  1) Enter a new person
  2) Print the contact list
  3) Retreive a persons information by last name
  4) Retrieve a person's information by email address
  5) Retrieve all people who live in a given zip code
  6) Sort the and print the contact list
  7) Save all contacts
  0) Exit menu

6
Christopher Dubeau
chris@email.com
000-000-0000
1 Main Street
94022
no notes for chris



Ron Rayas
ronemail.com
000-000-0000
2 main st
94022
Yes



Harpreet Setia
harpreet@gmail.com
444-555-4545
444 main street
94087
So many notes



Long Xu
xulonggg@gmail.com
415-521-8122
152 thrid street
94041
Yes



-- Actions --
Select an option:
  1) Enter a new person
  2) Print the contact list
  3) Retreive a persons information by last name
  4) Retrieve a person's information by email address
  5) Retrieve all people who live in a given zip code
  6) Sort the and print the contact list
  7) Save all contacts
  0) Exit menu
3
What is the persons last name? Rayas
Ron Rayas
ronemail.com
000-000-0000
2 main st
94022
Yes

-- Actions --
Select an option:
  1) Enter a new person
  2) Print the contact list
  3) Retreive a persons information by last name
  4) Retrieve a person's information by email address
  5) Retrieve all people who live in a given zip code
  6) Sort the and print the contact list
  7) Save all contacts
  0) Exit menu

4
What is the email address? harpreet@gmail.com
Harpreet Setia
harpreet@gmail.com
444-555-4545
444 main street
94087
So many notes

-- Actions --
Select an option:
  1) Enter a new person
  2) Print the contact list
  3) Retreive a persons information by last name
  4) Retrieve a person's information by email address
  5) Retrieve all people who live in a given zip code
  6) Sort the and print the contact list
  7) Save all contacts
  0) Exit menu
5
What is the zip code? 94022
Christopher Dubeau
chris@email.com
000-000-0000
1 Main Street
94022
no notes for chris

Ron Rayas
ronemail.com
000-000-0000
2 main st
94022
Yes

-- Actions --
Select an option:
  1) Enter a new person
  2) Print the contact list
  3) Retreive a persons information by last name
  4) Retrieve a person's information by email address
  5) Retrieve all people who live in a given zip code
  6) Sort the and print the contact list
  7) Save all contacts
  0) Exit menu

 */