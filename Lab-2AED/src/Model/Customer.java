/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author AseemD
 */
public class Customer {
    
    String name;
    int CustomerId;
    
    public Customer(){
        
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getCustomerId(){
        return CustomerId;
    }
    public void setCustomerId(int CustomerId){
        this.CustomerId=CustomerId;
    }
}
