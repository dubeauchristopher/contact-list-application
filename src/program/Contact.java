package program;


import java.io.Serializable;

/**
 * @author Christopher Dubeau
 * @author Ron Rayas
 * @author Harpreet Setia
 * @author Long Xu
 * Date: 11/18/14
 * Description:  This class stores into memory a contact, prints a contact, and returns a string of a contact.
 */

public class Contact implements Serializable {

    private String firstName; //FirstName is a data member
    private String lastName; // LastName is a data member
    private String emailAddress;  // EmailAddress is a data member
    private String phoneNumber; //PhoneNumber is a data member
    private String notes;  //Notes is a data member
    private String zipCode;

    public Contact() {


        firstName = "";
        lastName = "";
        emailAddress = "";
        phoneNumber = "";
        notes = "";
        zipCode = "";
    }

    /**
     * This method outputs to the console an individual contact
     * @return
     */
    public void printContact(String contact) {

    }

    /**
     * This is the getter for first name
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This is the setter for first name
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * This is the getter for last name
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * This is the setter for last name
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * This is the getter for email address
     * @return emailAddress
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * This is the setter for the email address
     * @param emailAddress the emailAddress
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * This is the getter for phone number
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * This is the setter for phone number
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * This is the getter for notes
     * @return notes
     */
    public String getNotes() {
        return notes;
    }

    /**
     * This is the setter for notes
     * @param notes
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }

    /**
     * This is the getter for zip code
     * @return zipCode
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * This is the setter for zip code
     * @param zipCode
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * This method accepts values and returns a string
     *
     * @return output
     */
    public String toString() {
        String output = "";
        output = firstName + " " + lastName + "\n";
        output += emailAddress + "\n";
        output += phoneNumber + "\n";
        output += zipCode + "\n";
        output += notes;
        return output;
    }


}