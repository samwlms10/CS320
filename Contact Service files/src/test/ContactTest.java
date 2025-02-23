package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import moduleThreeMilestone.Contact;

class ContactTest {
	// test to make sure we can create a contact correctly
	@Test
	void testCreateContact() {
        Contact contact = new Contact("000000001", "Bill", "Doe", "5555555555", "100 Oak St");
        
        assertEquals("000000001", contact.getContactId());
        assertEquals("Bill", contact.getFirstName());
        assertEquals("Doe", contact.getLastName());
        assertEquals("5555555555", contact.getPhone());
        assertEquals("100 Oak St", contact.getAddress());
    }
// test to make sure the ContactID is not too long	
	@Test
	void testContactIdTooLong() {  
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("00000000001", "Bill", "Doe", "5555555555", "100 Oak St");
        });
    }
// test to make sure the ContactID is not null		
	@Test
	void testContactIdCannotBeNull() {  
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact(null, "Bill", "Doe", "5555555555", "100 Oak St");
        });
    }
// test to make sure the first name is not too long	
	@Test
	void testFirstNameTooLong() {  
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("000000001", "BillyJoeBob", "Doe", "5555555555", "100 Oak St");
        });
    }
// test to make sure the first name is not null		
	@Test
	void testFirstNameCannotBeNull() {  
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("000000001", null, "Doe", "5555555555", "100 Oak St");
        });
    }
// test to make sure the last name is not too long	
	@Test
	void testLastNameTooLong() {  
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("000000001", "Bill", "Joe Bob Doe", "5555555555", "100 Oak St");
        });
    }
// test to make sure the last name is not null		
	@Test
	void testLastNameCannotBeNull() {  
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("000000001", "Bill", null, "5555555555", "100 Oak St");
        });
    }
// test to make sure the Phone is not too long	
	@Test
	void testPhoneTooLong() {  
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("000000001", "Bill", "Doe", "55555555555", "100 Oak St");
        });
    }
// test to make sure the Phone is not too short		
	@Test
	void testPhoneTooShort() {  
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("000000001", "Bill", "Doe", "5555555", "100 Oak St");
        });
    }
// test to make sure the phone is not null		
	@Test
	void testPhoneCannotBeNull() {  
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("000000001", "Bill", "Doe", null, "100 Oak St");
        });
    }
// test to make sure the Address is not too long		
	@Test
	void testAddressTooLong() {  
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("000000001", "Bill", "Doe", "5555555555", "100000 Billards Street, Oaktown Moon 00001");
        });
    }
// test to make sure the address is not null		
	@Test
	void testAddressCannotBeNull() {  
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("000000001", "Bill", "Doe", "5555555555", null);
        });
    }
//Making sure we can update all the fields	
	@Test
	void testUpdatingFields() {
        Contact contact = new Contact("000000001", "Bill", "Doe", "5555555555", "100 Oak St");
        
        contact.setFirstName("Jill");
        contact.setLastName("Beach");
        contact.setPhone("0005550505");
        contact.setAddress("100 Maple St");
        
        assertEquals("Jill", contact.getFirstName());
        assertEquals("Beach", contact.getLastName());
        assertEquals("0005550505", contact.getPhone());
        assertEquals("100 Maple St", contact.getAddress());
	}
//Test to make sure a first name thats too long will throw
	@Test
	void testSettingAFirstNameThatsTooLong() {
        Contact contact = new Contact("000000001", "Bill", "Doe", "5555555555", "100 Oak St");
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            contact.setFirstName("BillyBobJoe");
        });       
    }
//Test to make sure a first name thats null will throw
	@Test
	void testSettingAFirstNameThatsNull() {
	    Contact contact = new Contact("000000001", "Bill", "Doe", "5555555555", "100 Oak St");
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
	    	contact.setFirstName(null);
	    });       
	}
//Test to make sure a last name thats too long will throw
	@Test
	void testSettingALastNameThatsTooLong() {
	    Contact contact = new Contact("000000001", "Bill", "Doe", "5555555555", "100 Oak St");
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        contact.setLastName("ANameThatsTooLong");
	    });       
	}
//Test to make sure a last name thats null will throw
	@Test
	void testSettingALastNameThatsNull() {
		Contact contact = new Contact("000000001", "Bill", "Doe", "5555555555", "100 Oak St");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.setLastName(null);
		});       
	}
//Test to make sure a phone thats too long will throw
	@Test
	void testSettingAPhoneThatsTooLong() {
		 Contact contact = new Contact("000000001", "Bill", "Doe", "5555555555", "100 Oak St");
		 Assertions.assertThrows(IllegalArgumentException.class, () -> {
		     contact.setPhone("012345678901");
		 });       
	}
//Test to make sure a phone thats null will throw
	@Test
	void testSettingAPhoneThatsNull() {
		Contact contact = new Contact("000000001", "Bill", "Doe", "5555555555", "100 Oak St");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.setPhone(null);
		});       
	}
//Test to make sure a phone thats too long will throw
	@Test
	void testSettingAnAddressThatsTooLong() {
		 Contact contact = new Contact("000000001", "Bill", "Doe", "5555555555", "100 Oak St");
		 Assertions.assertThrows(IllegalArgumentException.class, () -> {
		     contact.setAddress("This Address Is Too Long For The Required Field");
		 });       
	}
	//Test to make sure a phone thats null will throw
	@Test
	void testSettingAnAddressThatsNull() {
		Contact contact = new Contact("000000001", "Bill", "Doe", "5555555555", "100 Oak St");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.setAddress(null);
		});       
	}


}
