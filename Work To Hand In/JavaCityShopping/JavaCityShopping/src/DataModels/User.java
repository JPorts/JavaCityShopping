/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataModels;

/**
 *
 * @author Jordan Porter
 * User Superclass 
 * Gives base properties for staff and customer subclasses 
 */
public class User {
    
    
    
    
    //attributes for user object // 
    private int userID;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    
    
    
    
    //getters for user object // 
    public int getUserID(){return userID;}
    public String getUsername(){return username;}
    public String getPassword(){return password;}
    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    
    
    
    
    //setters for user object // 
    public void setUserID(int userID){this.userID = userID;}
    public void setUserName(String username){this.username = username;}
    public void setPassword(String password){this.password = password;}
    public void setFirstName(String firstName){this.firstName = firstName;}
    public void setLastName(String lastName){this.lastName = lastName;}
    
    
    
    
   // default constructor//
    public User(){}
    
    
    
    
    /**
     * Overloaded Constructor//
     * @param userID 
     * @param username 
     * @param password 
     * @param firstName 
     * @param lastName 
     * 
     */ 
    public User(int userID, String username, String password, String firstName, String lastName)
    {
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    
} // Emd of User Class // 
