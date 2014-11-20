package program;

import java.util.List;

/**
 * @author Christopher Dubeau
 * @author Ron Rayas
 * @author Harpreet Setia
 * @author Long Xu
 * Date: 11/18/14
 * Description:
 */

public class ContactListApplication {


    public static void main(String args[]){

        Contact contact = new Contact();
        List newContact = contact.addContact();
        contact.printContact();;

        ContactList contactList = new ContactList();
        contactList.printAllContacts();;
        contactList.searchByEmail();
        contactList.searchByZipCode();
        contactList.searchByLastName();
        contactList.sortContactList();


    }


}
