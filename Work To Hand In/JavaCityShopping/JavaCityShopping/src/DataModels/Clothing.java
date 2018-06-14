/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataModels;

/**
 *
 * @author Jordan Porter
 * Clothing subclass inheriting from products//
 */
public class Clothing extends Product{
    
    //attributes for clothing object//
    private String measurement;
    
    //getters for clothing object//
    public String getMeasurement(){return measurement;}
    
    //setters for clothing object//
    public void setMeasurement(String measurement){this.measurement = measurement;}
    
    
    //default constructor//
    public Clothing(){super();}
    
    
    /**
     * Constructor with parameters to create instance of Clothing //
     * @param productID 
     * @param productName 
     * @param price 
     * @param stockLevel 
     * @param measurement 
     */
    public Clothing(int productID, String productName, double price, int stockLevel, String measurement)
    {
        super(productID, productName, price, stockLevel);
        this.measurement = measurement;
    }
    
    
    /**
     * Constructor with parameters to create instance of clothing//
     * @param productName 
     * @param price 
     * @param stockLevel 
     * @param measurement
     */
    public Clothing(String productName, double price, int stockLevel, String measurement)
    {
        super(productName, price, stockLevel);
        this.measurement = measurement;
    }
    
    
    
    
    @Override
    /**
     * toString method which concatenates the product details//
     */
    public String toString()
    {
        
        return ("Item No: " + super.getProductID() + ", Name: " + super.getProductName() + ", Price: £" + String.format("%.2f", super.getPrice()) + ", Stock Available: " + super.getStockLevel() + ", Measurement: " + measurement + "");
    }
    
    
    
} // End of Clothing Class // 
