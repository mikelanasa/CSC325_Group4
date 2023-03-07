/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bakerysystem;

/**
 *
 * @author erickcruz
 */
public class Customer {
    //private member variables that will hold customer information.
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String password;
    
    /**
     * This is the default constructor for the Customer class.
     */
    public Customer(){
        this.firstName = null;
        this.lastName = null;
        this.email = null;
        this.phoneNumber = null;
        this.password = null;

    }
    
    /**
     * This is a constructor that takes in parameters for the customer information 
     * @param firstName
     * @param lastName
     * @param email
     * @param phoneNumber
     * @param password 
     */
    public Customer(String firstName, String lastName, String email, String phoneNumber, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }
    
    
    /**
     * Getter method that returns the users First Name.
     * @return 
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * Setter method for the users first name 
     * @param firstName 
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    /**
     * Getter method that returns the users Last Name.
     * @return 
     */
    public String getLastName() {
        return lastName;
    }
    
    /**
     * Setter method for the users last name 
     * @param lastName 
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    /**
     * Getter method that returns the users email.
     * @return 
     */
    public String getEmail() {
        return email;
    }
    
    /**
     * Setter method for the users email  
     * @param email 
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * Getter method that returns the users phone number.
     * @return 
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    /**
     * Setter method for the users phone number 
     * @param phoneNumber 
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    /**
     * Getter method that returns the users password.
     * @return 
     */
    public String getPassword() {
        return password;
    }
    
    /**
     * Setter method for the users password. 
     * @param password 
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
