package program;

import java.util.ArrayList;

/**
 * @author Christopher Dubeau
 * @author Ron Rayas
 * @author Harpreet Setia
 * @author Long Xu
 * Date: 11/18/14
 * Description: This class is designed for  the methods to sort , print, and search the contacts.
 */

public class ContactList {

    private ArrayList<Contact> contactList;


    /**
     * This method defines a constructor that creates a new ArrayList when a new object of class contactList is created
     */
    public ContactList() {
        contactList = new ArrayList<Contact>();

    }

    /**
     * This method returns a contact
     *
     * @param index
     * @return
     */
    public Contact getContact(int index) {
        return contactList.get(index);
    }

    /**
     * This method searches the contact list by email and returns an individual contact.
     *
     * @return
     */
    public void searchByEmail() {

    }

    /**
     * This method searches the contact list by last name and returns an individual contact.
     *
     * @return
     */
    public void searchByLastName() {

    }

    /**
     * This method searches the contact list by zip code and returns an individual contact.
     *
     * @return
     */
    public void searchByZipCode() {

    }

    /**
     * This method sorts the entire contact list by last name.
     *
     * @return
     */
    public void sortContactList() {

    }

    /**
     * This method returns the contact
     *
     * @return
     */
    public String toString() {
        String output = "";
        for (int i = 0; i < contactList.size(); i++) {
            output += (getContact(i) + "\n" + "\n");
        }
        return output;
    }

    public void addContact(Contact contact) {
        contactList.add(contact);

    }

}
