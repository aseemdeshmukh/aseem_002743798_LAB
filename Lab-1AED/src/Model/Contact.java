/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author AseemD
 */
public class Contact {
    long phoneNumber;
    String emailID;
    int nuid;
    String collegeName;
        
    public Contact(){
        }
    
    public long getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(long phoneNumber){
       this.phoneNumber = phoneNumber;
    }
    
    public String getEmailID(){
        return emailID;
    }
    
    public void setEmailID(String emailID){
        this.emailID = emailID;
    }
    public int getNuid(){
        return nuid;
    }
    public void setNuid(int nuid){
        this.nuid = nuid;
    }
    public String getCollegeName(){
        return collegeName;
    }
    public void setCollegeName(String collegeName){
        this.collegeName = collegeName;
    }
}
