/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.ice4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author rebel
 */
public class ContactManagerTest {
       
    private ContactManager contactManager;
    
    public ContactManagerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        contactManager = new ContactManager();
        contactManager.setContactList(new Contact[] {
            new Contact("john.doe@example.com"),
            new Contact("jane.doe@example.com"),
            new Contact("justin.doe@example.com")
        });
    }
    
    @AfterEach
    public void tearDown() {
        contactManager.clearContacts();
    }

    /**
     * Test of findContact method, of class ContactManager.
     */
    
    @Test
    public void testFindContactGood() {
        
        Contact foundContact = contactManager.findContact("jane.doe@example.com");

        assertNotNull(foundContact);
    }
    
    @Test
    public void testFindContactBad() {
        
        Contact foundContact = contactManager.findContact("james.doe@example.com");

        assertNull(foundContact);
    }
    
    @Test
    public void testFindContactBoundaryLow() {
        
        Contact foundContact = contactManager.findContact("justin.doe@example.com");

        assertNotNull(foundContact);
    }
    
    @Test
    public void testFindContactBoundaryHigh() {
        
        Contact foundContact = contactManager.findContact("john.doe@example.com");

        assertNotNull(foundContact);
    }
    
    @Test
    public void testFindContactEmptyList() {
        contactManager.clearContacts();
        Contact foundContact = contactManager.findContact("john.doe@example.com");
        
        assertNull(foundContact);
    }
    
    @Test
    public void testFindContactDuplicateValues() {
        contactManager.setContactList(new Contact[] {
            new Contact("john.doe@example.com"),
            new Contact("john.doe@example.com"),
            new Contact("justin.doe@example.com")
        });
        Contact foundContact = contactManager.findContact("john.doe@example.com");

        assertNotNull(foundContact);
    }
    
    @Test
    public void testFindContactNull() {
       
        Contact foundContact = contactManager.findContact(null);

        assertNull(foundContact);
    }
    
    @Test
    public void testFindContactNullEmail() {
        contactManager.setContactList(new Contact[] {
            new Contact(null)
            
        });
       
        Contact foundContact = contactManager.findContact("jane.doe@example.com");

        assertNull(foundContact);
    }
    
    
    
    
    
    
    
    
    
    
    
}
