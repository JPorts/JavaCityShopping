/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataModels;

/**
 * @author Jordan Porter
 * Class for product // 
 */
public class Product {
    
    
    
    //attributes for product object//
    private int productID;
    private String productName;
    private double price;
    private int stockLevel;
    
    
    
    
    //getters for product object//
    public int getProductID(){return productID;}
    public String getProductName(){return productName;}
    public double getPrice(){return price;}
    public int getStockLevel(){return stockLevel;}
    
    
    
    
    //setters for product object//
    public void setProductID(int productID){this.productID = productID;}
    public void setProductName(String productName){this.productName = productName;}
    public void setPrice(double price){this.price = price;}
    public void setStockLevel(int stockLevel){this.stockLevel = stockLevel;}
    
    
    
    
    // Default empty constructor//
    public Product(){}
    
    
    
    
    /**
     * 
     * Constructor with parameter arguments to create product object// 
     * @param productID
     * @param productName 
     * @param price 
     * @param stockLevel 
     */
    public Product(int productID, String productName, double price, int stockLevel)
    {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.stockLevel = stockLevel;
    }
    
    
    
    
    /**
     *
     * Constructor with parameter arguments to create product object//
     * @param productName 
     * @param price
     * @param stockLevel 
     */
    public Product(String productName, double price, int stockLevel)
    {
        this.productName = productName;
        this.price = price;
        this.stockLevel = stockLevel;
    }

} // Emd Of Product Class // 
