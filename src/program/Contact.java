package program;


import java.io.Serializable;

/**
 * @author Christopher Dubeau
 * @author Ron Rayas
 * @author Harpreet Setia
 * @author Long Xu
 * Date: 11/18/14
 * Description:  This class will stores the contacts first name, last name, email address, street address, phone number, notes
 * and zipcode then holds it.
 */

public class Contact implements Serializable {

    private String firstName; //FirstName is a data member
    private String lastName; // LastName is a data member
    private String emailAddress;  // EmailAddress is a data member
    private String streetAddress;
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
        streetAddress = "";
    }


    /**
     * This is the getter for street address
     * @return
     */
    public String getStreetAddress() {
        return streetAddress;
    }

    /**
     * This is the setter for street address
     * @param streetAddress
     */
    public void setStreetAddress(String streetAddress) {
        streetAddress = streetAddress;
    }

    /**
     * This is the getter for first name
     * @return firstName
     */
    private String getFirstName() {
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
    private String getNotes() {
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
        output += streetAddress + "\n";
        output += zipCode + "\n";
        output += notes + "\n\n";
        return output;
    }


}
