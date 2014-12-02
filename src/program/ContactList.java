package program;

import java.util.ArrayList;

/**
 * @author Christopher Dubeau
 * @author Ron Rayas
 * @author Harpreet Setia
 * @author Long Xu
 * Date: 11/18/14
 * Description: This class sorts, prints, and searches the contact list.
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
     * This method returns a contact from the list of contacts
     * @param index
     * @return
     */
    public Contact getContact(int index) {
        return contactList.get(index);
    }


    /**
     * This method searches the contact list by email and returns an individual contact.
     */
    public void searchByEmail(String email) {

        if(contactList.isEmpty()) {
            System.out.println("Your contact list is empty. ");

        }

        for(int i=0;i<contactList.size();i++){

            if(contactList.get(i).getEmailAddress() == email){
                System.out.print(contactList.get(i));

            }else{
                System.out.println("Could not find anyone with that email address." );

            }
        }
    }

    /**
     * This method searches the contact list by last name and returns an individual contact.
     */
    public void searchByLastName(String lastName) {

        if(contactList.isEmpty()) {
            System.out.println("Your contact list is empty. ");
        }

        for(int i=0;i<contactList.size();i++){

            if(contactList.get(i).getEmailAddress() == lastName){
                System.out.print(contactList.get(i));
            }else{
                System.out.println("Could not find anyone with that last name." );
            }
        }

    }

    /**
     * This method searches the contact list by zip code and returns an individual contact.
     */
    public void searchByZipCode(String zipCode) {
        if(contactList.isEmpty()) {
            System.out.println("Your contact list is empty. ");
        }

        for(int i=0;i<contactList.size();i++){

            if(contactList.get(i).getEmailAddress() == zipCode){
                System.out.print(contactList.get(i));
            }else{
                System.out.println("Could not find anyone with that last name." );
            }
        }
    }

    /**
     * This method sorts the entire contact list by last name.
     */
    public void sortContactList() {

    }

    /**
     * This method returns a string of all contacts
     * @return String
     */
    public String toString() {
        String output = "";
        for (int i = 0; i < contactList.size(); i++) {
            output += (getContact(i) + "\n" + "\n");
        }
        return output;
    }

    /**
     * This method receives a contact and adds it to the contact list
     * @param contact
     */
    public void addContact(Contact contact) {
        contactList.add(contact);

    }

}
