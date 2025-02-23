package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import moduleThreeMilestone.Contact;
import moduleThreeMilestone.ContactService;

class ContactServiceTest {
// test to make sure the contact is added correctly
	@Test
    void testAddContactSuccessfully() {
        ContactService contactService = new ContactService();
		contactService.addContact("Bill", "Doe", "5555555555", "100 Oak St");

        Contact contact = contactService.contactList.get(0);

        assertNotNull(contact);
        assertTrue(contactService.contactList.get(0).getFirstName().equals("Bill"));
        assertTrue(contactService.contactList.get(0).getLastName().equals("Doe"));
        assertTrue(contactService.contactList.get(0).getPhone().equals("5555555555"));
        assertTrue(contactService.contactList.get(0).getAddress().equals("100 Oak St"));
    }
// test to make sure the contactID is implemented to increase by 1 and be unique
	@Test
    void testUniqueID() {
        ContactService contactService = new ContactService();
		contactService.addContact("Bill", "Doe", "5555555555", "100 Oak St");
		contactService.addContact("Jill", "Beach", "0005550505", "100 Maple St");
		
        assertTrue(contactService.contactList.get(0).getContactId().equals("1"));
        assertTrue(contactService.contactList.get(1).getContactId().equals("2"));
		
	}
// test to make sure the contact is deleted correctly	
	@Test
    void testDeletingAContact() {
        ContactService contactService = new ContactService();
		contactService.addContact("Bill", "Doe", "5555555555", "100 Oak St");
		contactService.addContact("Jill", "Beach", "0005550505", "100 Maple St");
		
		contactService.deleteContact("1");
		
        assertFalse(contactService.contactList.get(0).getContactId().equals("1"));
        assertTrue(contactService.contactList.get(0).getContactId().equals("2"));
	
	}
// test to make sure the contacts first name is updated correctly	
	@Test
    void testUpdatingFirstName() {
        ContactService contactService = new ContactService();
		contactService.addContact("Bill", "Doe", "5555555555", "100 Oak St");
		
		contactService.updateContactFirstName("1", "Jill");
		
		assertTrue(contactService.contactList.get(0).getFirstName().equals("Jill"));
		
	}
// test to make sure the contacts last name is updated correctly		
	@Test
    void testUpdatingLastName() {
        ContactService contactService = new ContactService();
		contactService.addContact("Bill", "Doe", "5555555555", "100 Oak St");
		
		contactService.updateContactLastName("1", "Beach");
		
		assertTrue(contactService.contactList.get(0).getLastName().equals("Beach"));
		
	}
// test to make sure the contacts phone is updated correctly	
	@Test
    void testUpdatingPhone() {
        ContactService contactService = new ContactService();
		contactService.addContact("Bill", "Doe", "5555555555", "100 Oak St");
		
		contactService.updateContactPhone("1", "0005550505");
		
		assertTrue(contactService.contactList.get(0).getPhone().equals("0005550505"));
		
	}
// test to make sure the contacts address is updated correctly		
	@Test
    void testUpdatingAddress() {
        ContactService contactService = new ContactService();
		contactService.addContact("Bill", "Doe", "5555555555", "100 Oak St");
		
		contactService.updateAddress("1", "100 Maple St");
		
		assertTrue(contactService.contactList.get(0).getAddress().equals("100 Maple St"));
		
	}
// test to make sure no contact is deleted if id doesn't exist
	@Test
    void testDeletingContactThatsNotThere() {
        ContactService contactService = new ContactService();
		contactService.addContact("Bill", "Doe", "5555555555", "100 Oak St");

		assertEquals(1,contactService.getContactList().size());
		
		contactService.deleteContact("11");
		
		assertEquals(1,contactService.getContactList().size());
		
        assertTrue(contactService.contactList.get(0).getContactId().equals("1"));
    }
	// test to make sure information is not updated if wrong id given	
	@Test
	void testUpdatingInformationThatsNotThere() {
        ContactService contactService = new ContactService();
		contactService.addContact("Bill", "Doe", "5555555555", "100 Oak St");
			
		contactService.updateContactFirstName("3", "Jill");
		contactService.updateContactLastName("3", "Buck");
		contactService.updateContactPhone("3", "0005550505");
		contactService.updateAddress("3", "100 Maple St");
		
			
		for(int i = 0; i < contactService.getContactList().size(); i++) {
			assertFalse(contactService.contactList.get(i).getFirstName().equals("Clean"));
			assertFalse(contactService.contactList.get(i).getLastName().equals("Buck"));
			assertFalse(contactService.contactList.get(i).getPhone().equals("0005550505"));
			assertFalse(contactService.contactList.get(i).getAddress().equals("100 Maple St"));
			
			}
			
		}
	
}
