package moduleThreeMilestone;
/*
* Samuel Williams
* CS320 
* 1/24/2025
*/

public class Contact{
    private final String contactID;
    private String firstName;
    private String lastName;
    private String phone;
    private String address; // declaring the variables and making sure that contactID is unique


//using a constructor to make a new contact with these parameters and checks to make sure they are valid
    public Contact(String contactID, String firstName, String lastName, String phone, String address){
        if(contactID == null || contactID.length() > 10){
            throw new IllegalArgumentException("The contact ID should be less than 10 characters and not null.");
        }
        if(firstName == null || firstName.length() > 10){
            throw new IllegalArgumentException("The first name should be less than 10 characters and not null.");
        }
        if(lastName == null || lastName.length() > 10){
            throw new IllegalArgumentException("The last name should be less than 10 characters and not null.");
        }
        if(phone == null || phone.length() != 10){
            throw new IllegalArgumentException("The phone number should be 10 characters and not null.");
        }
        if(address == null || address.length() > 30){
            throw new IllegalArgumentException("The address should be less than 30 characters and not null.");
        }
        
        // Assigns the values from the constructor to the class contact
        this.contactID = contactID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }

    // Getters for the contact class so they can be accessed in other classes
    public String getContactId(){
        return contactID;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getPhone(){
        return phone;
    }
    public String getAddress(){
        return address;
    }

    // setters to set new values for the class attributes with checks to makes sure they are valid
    public void setFirstName(String firstName){
        if(firstName == null || firstName.length() > 10){
            throw new IllegalArgumentException("The first name should be less than 10 characters and not null.");
        }
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        if(lastName == null || lastName.length() > 10){
            throw new IllegalArgumentException("The last name should be less than 10 characters and not null.");
        }
        this.lastName = lastName;
    }
    public void setPhone(String phone){
        if(phone == null || phone.length() != 10){
            throw new IllegalArgumentException("The phone number should be 10 characters and not null.");
        }
        this.phone = phone;
    }
    public void setAddress(String address){
        if(address == null || address.length() > 30){
            throw new IllegalArgumentException("The address should be less than 30 characters and not null.");
        }
        this.address = address;
    }
}