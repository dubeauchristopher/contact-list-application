package program;

import java.util.List;

/**
 * @author Christopher Dubeau
 * @author Ron Rayas
 * @author Harpreet Setia
 * @author Long Xu
 * Date: 11/18/14
 * Description: This class
 */

public class ContactList {

    private List contactList;
    private List sortedContactList;
    private List searchResultsByEmail;
    private List searchResultsByLastName;
    private List searchResultsByZipCode;

    public ContactList(){

    }

    /**
     * This method prints all contacts
     */
    public void printAllContacts(){
           System.out.print(contactList);
    }

    /**
     * This method searches the contact list by email and returns an individual contact.
     * @return
     */
    public List searchByEmail(){
        return searchResultsByEmail;
    }

    /**
     * This method searches the contact list by last name and returns an individual contact.
     * @return
     */
    public List searchByLastName(){
        return searchResultsByLastName;
    }

    /**
     * This method searches the contact list by zip code and returns an individual contact.
     * @return
     */
    public List searchByZipCode(){
        return searchResultsByZipCode;
    }

    /**
     * This method sorts the entire contact list by last name.
     * @return
     */
    public List sortContactList(){
        return sortedContactList;
    }

    /**
     * This method accepts values and returns a string
     * @return
     */
    public String toString(){
        return "";
    }

}
