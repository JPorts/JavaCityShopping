/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataModels;

/**
 *
 * @author Jordan Porter
 * This class defining the attributes of a staff member//
 */
public class Staff extends User{
    
    
    
    //attributes for staff member//
    private String position;
    private double salary;
    
    
    
    
    //getters for staff member afftirbutes//
    public String getPosition(){return position;}
    public double getSalary(){return salary;}
    
    
    
    
    //setters for staff member attributes//
    public void setPosition(String position){this.position = position;}
    public void setSalary(double salary){this.salary = salary;}
    
    
    
    
    
     //default constructor for the Staff class//
    public Staff(){super();}
    
    
    /**
     * overloaded constructor with parameter arguments to create staff member//
     * 
     * @param userID 
     * @param username 
     * @param password 
     * @param firstName 
     * @param lastName 
     * @param position 
     * @param salary 
     */
    public Staff(int userID, String username, String password, String firstName, String lastName, String position, double salary)
    {
        super(userID, username, password, firstName, lastName);
        this.position = position;
        this.salary = salary;
    }
    
    
    //associated methods//
    
    
    /**
     * Method returns greeting to staff member//
     * @return - String 
     */
    public String displayGreeting()
    {
        String greeting = "Welcome " + super.getFirstName() + " " + super.getLastName() + ". You are now logged in with " + this.position + " privileges.";
        return greeting;
    }
   
} // End of Staff Class // 
