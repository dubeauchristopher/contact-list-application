
import java.util.ArrayList;
import java.util.List;

/**
 * @author Christopher Dubeau
 * @author Ron Rayas
 * @author Harpreet Setia
 * @author Long Xu
 * Date: 11/18/14
 * Description: The class ContactList has an arraylist in which a list of contact/contacts is stored.It also has loop which
 * adds a new contact to the contact list and then returns the output.
 */

public class contactList {

    private ArrayList<Contact> contactList;
    
  /**
   * This method defines a constructor that creates a new ArrayList when a new object of class contactList is created
   */
    public contactList(){
    	contactList = new ArrayList<Contact>();

    }
    /**
     * This method returns a contact
     * @param index
     * @return
     */
    public Contact getContact(int index){
    	return contactList.get(index);
    }
   /*
    *This method will use loop to circle the menu
    */
    
    public String toString(){
    	String output = "";
    	for(int i = 0; i<contactList.size();i++){	
    		output += (getContact(i)+ "\n" + "\n");
    	}
        return output;
    }

}
