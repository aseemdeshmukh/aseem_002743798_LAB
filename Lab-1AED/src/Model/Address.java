/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author AseemD
 */
public class Address {
    String  street;
    int aptNumber;
    String city;
    int zip;
    
    public Address(){
        this.street= "";
    }
    
    public String getStreet(){
        return street;
    }
    public void setStreet(String street){
        this.street = street;
    }
    public int getAptNumber(){
        return aptNumber;
    }
    public void setAptNumber(int aptNumber){
        this.aptNumber = aptNumber;
    }
    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city = city;
    }
    public int getZip(){
        return zip;
    }
    public void setCity(int zip){
        this.zip = zip;
    }
    
}