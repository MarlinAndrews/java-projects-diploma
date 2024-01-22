/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;


//This class manages the details of the customer looking to hire a car
public class Customer {
    //class variables
    private String customerName;
    private String customerEmail;
    private String customerAddress;
    
    //constructor
    public Customer(String customerName, String customerEmail, String customerAddress){
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerAddress = customerAddress;
    }
    
    //getters
    public String getCustomerName(){
        return customerName;
    }
    public String getCustomerEmail() {
        return customerEmail;
    }
    public String getCustomerAddress() {
        return customerAddress;
    }
}
