package moduleThreeMilestone;
/*
* Samuel Williams
* CS320 
* 1/24/2025
*/

import java.util.ArrayList;



public class ContactService{
// creating an array list so we can store the contacts and also have a list that can expand
    public ArrayList<Contact> contactList = new ArrayList<Contact>();
    public ArrayList<Contact> getContactList() {
		return contactList;
	}
//making a uniqueID for every new contact
    public String makeUniqueId(){
        if (contactList.isEmpty()){
            return "1";
        }
        int uniqueId = Integer.parseInt(contactList.get(contactList.size() - 1) .getContactId());
        return String.valueOf(uniqueId + 1);
    }
//adding a contact to the array and assigning them with a uniqueID
    public void addContact(String firstName, String lastName, String phone, String address){
        Contact contact = new Contact(makeUniqueId(), firstName, lastName, phone, address);
        contactList.add(contact);
    }
    //deleting a contact out of the contact array
    public void deleteContact(String uniqueId){
        for (int i = 0; i < contactList.size(); i++){
            if (contactList.get(i).getContactId().equals(uniqueId)){
                contactList.remove(i);
                break;
            }
        }
    }
    //updating the contacts first name at the contactID
    public void updateContactFirstName(String contactId, String newFirstName){
        for (int i = 0; i < contactList.size(); i++){
            if (contactList.get(i).getContactId().equals(contactId)){
                contactList.get(i).setFirstName(newFirstName);
                return;
            }
        }
    }
    //updating the contacts last name at the contactID
    public void updateContactLastName(String contactId, String newLastName){
        for (int i = 0; i < contactList.size(); i++){
            if (contactList.get(i).getContactId().equals(contactId)){
                contactList.get(i).setLastName(newLastName);
                return;
            }
        }
    }
    //updating the contacts phone at the contactID
    public void updateContactPhone(String contactId, String newPhone){
        for (int i = 0; i < contactList.size(); i++){
            if (contactList.get(i).getContactId().equals(contactId)){
                contactList.get(i).setPhone(newPhone);
                return;
            }
        }
    }
    //updating the contacts address at the contactID
    public void updateAddress(String contactId, String newAddress){
        for (int i = 0; i < contactList.size(); i++){
            if (contactList.get(i).getContactId().equals(contactId)){
                contactList.get(i).setAddress(newAddress);
                return;
            }
        }
    }

}