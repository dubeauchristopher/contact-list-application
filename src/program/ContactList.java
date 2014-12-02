package program;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author Christopher Dubeau
 * @author Ron Rayas
 * @author Harpreet Setia
 * @author Long Xu
 * Date: 11/18/14
 * Description: This class sorts, prints, and searches the contact list.
 */

public class ContactList implements Serializable {

    private ArrayList<Contact> contactList;


    /**
     * This method defines a constructor that creates a new ArrayList when a new object of class contactList is created
     */
    public ContactList() {
        contactList = new ArrayList<Contact>();

    }

    /**
     * Method that reads the contact list from a file
     * @throws IOException
     */
    public void readContactListFromFile() throws IOException {
        try{
            FileInputStream fis = new FileInputStream("/Users/christopherdubeau/Development/java-class/contact-list-application/contact-file/contactList.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ContactList contactList = (ContactList)ois.readObject();
            ois.close();
        }catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    /**
     * Method that writes the contact list to a file
     */
    public void writeContactListToFile(){

        try{
            FileOutputStream fos = new FileOutputStream("/Users/christopherdubeau/Development/java-class/contact-list-application/contact-file/contactList.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(contactList);
            oos.close();
        }catch(IOException e){
            e.printStackTrace();
        }

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

        int j = 0;
        if(contactList.isEmpty()) {
            System.out.println("Your contact list is empty. \n");
            j++;
        }

        for(int i=0;i<contactList.size();i++){

            if(contactList.get(i).getEmailAddress().equals(email)){
                System.out.print(contactList.get(i));
                j++;

            }
        }

        if(j == 0){
            System.out.println("Could not find anyone with that email address.\n" );
        }
    }

    /**
     * This method searches the contact list by last name and returns an individual contact.
     */
    public void searchByLastName(String lastName) {

        int j = 0;
        if(contactList.isEmpty()) {
            System.out.println("Your contact list is empty. \n");
            j++;
        }

        for(int i=0;i<contactList.size();i++){

            if(contactList.get(i).getLastName().equals(lastName)){
                System.out.print(contactList.get(i));
                j++;
            }
        }

        int i = 0;
        if(j == 0){
            System.out.println("Could not find anyone with that last name.\n"+contactList.get(i).getLastName() );
        }

    }

    /**
     * This method searches the contact list by zip code and returns an individual contact.
     */
    public void searchByZipCode(String zipCode) {

        int j = 0;
        if(contactList.isEmpty()) {
            System.out.println("Your contact list is empty. ");
            j++;
        }

        for(int i=0;i<contactList.size();i++){

            if(contactList.get(i).getZipCode().equals(zipCode)){
                System.out.print(contactList.get(i));
                j++;
            }
        }

        if(j == 0){
            System.out.println("Could not find anyone with that last name.\n" );
        }
    }

    /**
     * This method sorts the entire contact list by last name.
     */
    public void sortContactList() {

        Collections.sort(contactList, new Comparator<Contact>(){
            public int compare(Contact s1, Contact s2) {
                return s1.getLastName().compareToIgnoreCase(s2.getLastName());
            }

        });
        String output = "";
        for(int i = 0; i < contactList.size(); i++){
            output += (getContact(i) + "\n" + "\n");
        }

        System.out.print(output);

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
