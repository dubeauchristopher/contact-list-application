package program;

/**
 * @author Christopher Dubeau
 * @author Ron Rayas
 * @author Harpreet Setia
 * @author Long Xu
 * Date: 11/18/14
 * Description: This class reads the data the user inputs from the menu.
 */

public class ContactListApplication {


    public static void main(String args[]){

        Contact contact = new Contact();
        contact.addContact();
        contact.printContact();;

        ContactList contactList = new ContactList();
        contactList.printAllContacts();;
        contactList.searchByEmail();
        contactList.searchByZipCode();
        contactList.searchByLastName();
        contactList.sortContactList();


    }


}
