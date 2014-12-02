
import java.util.ArrayList;
import java.util.List;

/**
 * @author Christopher Dubeau
 * @author Ron Rayas
 * @author Harpreet Setia
 * @author Long Xu
 * Date: 11/18/14
 * Description: This class is designed for  the methods to sort , print, and search the contacts.
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
   
    public String toString(){
    	String output = "";
    	for(int i = 0; i<contactList.size();i++){	
    		output += (getContact(i)+ "\n" + "\n");
    	}
        return output;
    }

}
/**
* addperosn
* printperson
* contact: print single contact
* contactlist: printlist of contact
*/
