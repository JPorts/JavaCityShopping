/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataModels;

/**
 * 
 * @author Jordan Porter//
 * Sub Class of User //
 * Creates instance of a customer object //
 */

public class Customer extends User {
    
    
    
    
    //attributes for customer object // 
    private String addressLine1;
    private String addressLine2;
    private String town;
    private String postcode;
    private boolean isRegistered;
    
    
    
    //getters for customer object // 
    public String getAddressLine1(){return addressLine1;}
    public String getAddressLine2(){return addressLine2;}
    public String getTown(){return town;}
    public String getPostcode(){return postcode;}
    public boolean getIsRegistered(){return isRegistered;}
    
    
    
    //setters for customer object // 
    public void setAddressLine1(String addressLine1){this.addressLine1 = addressLine1;}
    public void setAddressLine2(String addressLine2){this.addressLine2 = addressLine2;}
    public void setTown(String town){this.town = town;}
    public void setPostcode(String postcode){this.postcode = postcode;}
    public void setIsRegistered(boolean isRegistered){this.isRegistered = isRegistered;}
    
    
    
    
    //Default constructor//
    public Customer(){super();}

    
    /**
     * Constructor with parameters To create customer //
     * @param userID 
     * @param username 
     * @param password 
     * @param firstName 
     * @param lastName
     * @param addressLine1 
     * @param addressLine2 
     * @param town 
     * @param postcode 
     * @param orders 
     * @param isRegistered 
     */
    public Customer(int userID, String username, String password, String firstName, String lastName, String addressLine1, String addressLine2, String town, String postcode, boolean isRegistered)
    {
        super(userID, username, password, firstName, lastName);
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.town = town;
        this.postcode = postcode;
        
        this.isRegistered = isRegistered;
        
        
    }
    
    
    //Associated methods//
    
    
    /**
       Displays Greeting
     * @return greeting 
     */
    public String displayGreeting()
    {
        String greeting = "Welcome " + super.getFirstName() + "!";
        return greeting;
    }
    
 
} // End of Customer Class // 
