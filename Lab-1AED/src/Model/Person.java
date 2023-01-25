/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author AseemD
 */
public class Person {
    

    private String firstName;
    private String lastName;
    Address address;
    Address permanentAddress;
    Contact personalContact;
    Contact officeContact;
    
    
    public Person(){
        this.firstName = "";
        this.lastName = "";
        this.address = new Address();
        this.permanentAddress = new Address();
        this.officeContact = new Contact();
        this.personalContact = new Contact();
    }

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
      public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
        public Address getAddress(){
        return address;
    }
    public void setAddress(Address address){
        this.address = address;
    }
    public Address getPermanentAddress(){
        return permanentAddress;
    }
    
    public void setPermanentAddress(Address permanentAddress){
        this.permanentAddress = permanentAddress;
    }
    public Contact getPersonalContact(){
        return personalContact;
    }
    public void setPersonalContact(Contact personalContact){
        this.personalContact = personalContact;
    }
    public Contact getOfficeContact(){
        return officeContact;
    }
    public void setOfficeContact(Contact officeContact){
        this.officeContact = officeContact;
    }        

}
