/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataModels;

/**
 *
 * @author Jordan Porter
 * Class for Footwear 
 * Subclass inheriting from Product
 */
public class Footwear extends Product{
    
    
    
    
    //attribute for footwear object// 
    private int size;
    
    
    
    
    //getters for footwear object// 
    public int getSize(){return size;}
    
    
    
    
    //setters for footwear object// 
    public void setSize(int size){this.size = size;}
    
    
    
    
    
    //default constructor//
    public Footwear(){super();}
    
    
    
    
    
    /**
     * Constructor with parameter arguments to create footwear object// 
     * @param productID 
     * @param productName 
     * @param price 
     * @param stockLevel 
     * @param size 
     */
    public Footwear(int productID, String productName, double price, int stockLevel, int size)
    {
        super(productID, productName, price, stockLevel);
        this.size = size;
    }
    
    
    
    
    
    /**
     * Constructor with parameter arguments to create footwear object// 
     * @param productName
     * @param price 
     * @param stockLevel 
     * @param size
     */
    public Footwear(String productName, double price, int stockLevel, int size)
    {
        super(productName, price, stockLevel);
        this.size = size;
    }
    
    
    
    
    /**
     * this method concatenates all product details
     * @return - String
     */
    @Override
    
    public String toString()
    {
        return ("Item No: " + super.getProductID() + ", Name: " + super.getProductName() + ", Price: £" + String.format("%.2f", super.getPrice()) + ", Stock Available: " + super.getStockLevel() + ", Size: " + size + "");
 
    }
    
} // End of Footwear Class// 
