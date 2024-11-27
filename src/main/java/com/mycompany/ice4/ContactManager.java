/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ice4;

/**
 *
 * @author rebel
 */
public class ContactManager {
    private Contact[] contactList;
    private String myProperty;

    public String getMyProperty() {
        return myProperty;
    }

    public void setMyProperty(String myProperty) {
        this.myProperty = myProperty;
    }
    

    public Contact[] getContactList() {
        return contactList;
    }

    public void setContactList(Contact[] contactList) {
        this.contactList = contactList;
    }
    
    /*
	Locate a Contact record that matches the email address provided.
	Returns the Contact record if found, null if not found.
    */
    public Contact findContact(String emailAddress) {
    // Iterate through the contactList array
    for (Contact contact : contactList) {
        // Check if the current contact's email matches the provided emailAddress
        if (contact != null && emailAddress != null && emailAddress.equals(contact.getEmailAddress())) {
            return contact; // Return the matching Contact if found
        }
    }
    // If no match is found, return null
    return null;
}

    /*
	 Removes all contacts
    */
	public void clearContacts() {
    // Check if the contactList is not null to avoid NullPointerException
    if (contactList != null) {
        // Loop through each index in the contactList array and set it to null
        for (int i = 0; i < contactList.length; i++) {
            contactList[i] = null;
        }
    }
}

}
