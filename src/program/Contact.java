

import java.util.List;

/**
 * @author Christopher Dubeau
 * @author Ron Rayas
 * @author Harpreet Setia
 * @author Long Xu
 * Date: 11/18/14
 * Description:  This class will stores the contacts first name, last name, email address, street address, phone number, notes
 * and zipcode then holds it.
 */

public class Contact {

	private String firstName; //FirstName is a data member
	private String lastName; // LastName is a data member
	//Eventually have to add streetaddress functionality somewhere
	private String emailAddress;  // EmailAddress is a data member
	private String phoneNumber; //PhoneNumber is a data member
	private String notes;  //Notes is a data member
/*
 * Creating a method called Contact to read and stores all the values.
 */
    public Contact(){
// write in test code
    }

    /**
     * This method prompts the user to
     * @return
     */
    public void addContact(){

    }

    /**
     * This method accepts values and returns a string
     * @return
     */
    public String toString(){
    	String output = "";
    	output = firstName + " " + lastName + "/n";
    	output+= emailAddress + "/n";
    	output += phoneNumber + "/n";
    	output += notes;
        return output;
    }

}
