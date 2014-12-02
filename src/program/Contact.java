package program;

import java.util.List;

/**
 * @author Christopher Dubeau
 * @author Ron Rayas
 * @author Harpreet Setia
 * @author Long Xu
 * Date: 11/18/14
 * Description:  This class will run the contact  menu and call methods from the contact list class to print sort and search contacts
 */

public class Contact {

    private String firstName; //FirstName is a data member
    private String lastName; // LastName is a data member
    //Eventually have to add streetaddress functionality somewhere
    private String emailAddress;  // EmailAddress is a data member
    private String phoneNumber; //PhoneNumber is a data member
    private String notes;  //Notes is a data member
    private String zipCode;

    public Contact(){
        firstName = "";
        lastName = "";
        emailAddress = "";
        phoneNumber = "";
        notes = "";
        zipCode = "";
    }

    /**
     * This method prints an individual contact
     * @return
     */
//    public Contact printContact(){
//        return individualContact;
//    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the emailAddress
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * @param emailAddress the emailAddress to set
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the notes
     */
    public String getNotes() {
        return notes;
    }

    /**
     * @param notes the notes to set
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }

    /**
     * @return the zipCode
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * @param zipCode the zipCode to set
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
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
        output = firstName + " " + lastName + "\n";
        output+= emailAddress + "\n";
        output += phoneNumber + "\n";
        output += notes;
        return output;
    }

}