package DataModels;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;



/**
 * @author Jordan Porter
 * Class for the management of the database methods for city shopping //
 */
public class DbManager {

    
    /**
     * Save product method
     * @param product
     **/
    public void saveProduct(Product product) {
        
        try {
            // database driver//
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            
            
            // creates connection to the database//
            try (Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/CITYSHOPPINGDB","Jordan", "1111")) {
             
                //creates a statment using connection //
                Statement stmt = conn.createStatement();
                
                //runs update on products//
                stmt.executeUpdate("INSERT INTO PRODUCTSTABLE (PRODUCTID, PRODUCTNAME, PRICE, STOCKLEVEL)" + " VALUES (" + product.getProductID() + ", '" + product.getProductName() + "', " + product.getPrice() + ", " + product.getStockLevel() + ")");
                
                //if the product is an instance of  clothing//
                if(product instanceof Clothing)
                {
                    
                    // executes update// 
                    stmt.executeUpdate("INSERT INTO CLOTHINGTABLE (PRODUCTID, MEASUREMENT) VALUES (" + product.getProductID() + ", '" + ((Clothing) product).getMeasurement() + "')");
                }
               
                else
                {
                    //INSERTS ID AND SIZE TO FOOTWEAR TABLE//
                    stmt.executeUpdate("INSERT INTO FOOTWEARTABLE (PRODUCTID, SIZE) VALUES (" + product.getProductID() + ", " + ((Footwear) product).getSize() + ")");
                }
            }
        //catch error message//
        } catch (ClassNotFoundException | SQLException ex) {
            String message = ex.getMessage();
            System.out.println(message);
        }
    }
    

    /**
     * Delete product method
     * @param product
     **/ 
    public void deleteProduct (Product product)
    {
        try {
            //derby database driver//
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            //connection to database//
            try (Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/CITYSHOPPINGDB","Jordan", "1111")) {
                //statment with connection//
                Statement stmt = conn.createStatement();
            
            //if product is instance of clothing//
            if(product instanceof Clothing)
                {
                    //create sql statements to delete product//
                    String sql = "DELETE FROM PRODUCTSTABLE WHERE PRODUCTID = " + product.getProductID() + "";
                    String sql2 =  "DELETE FROM CLOTHINGTABLE WHERE PRODUCTID = " + product.getProductID() + "";
                   
                    //execute statements//
                    stmt.executeUpdate(sql2);
                    stmt.executeUpdate(sql);
                    
                }
                
                else
                {
                     //create sql statements to delete product//
                    String sql = "DELETE FROM PRODUCTSTABLE WHERE PRODUCTID = " + product.getProductID() + "";
                    String sql2 = "DELETE FROM FOOTWEARTABLE WHERE PRODUCTID = " + product.getProductID() + "";
                   // execute statements//
                    stmt.executeUpdate(sql);
                    stmt.executeUpdate(sql2);
                }
            }
        //catch errors//
        } catch (ClassNotFoundException | SQLException ex) {
            String message = ex.getMessage();
            System.out.println(message);
        }
    }
    
    
    /**
     *Load Clothing//
     * @return - HashMap //
     */
    public HashMap<Integer, Clothing> loadAllClothing()
    {
        //declare HashMap// 
        HashMap<Integer, Clothing> clothes = new HashMap();
        
        
        try 
        {
           
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            
            
            try (Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/CITYSHOPPINGDB","Jordan", "1111")) {
               
                
                Statement stmt = conn.createStatement();
                
                
                String sql = "Select * From CLOTHINGTABLE INNER JOIN PRODUCTSTABLE ON CLOTHINGTABLE.PRODUCTID = PRODUCTSTABLE.PRODUCTID";
               
                ResultSet rst;
                 
                rst = stmt.executeQuery(sql);
                
               
                while (rst.next())
                {
                    //instantiate clothing object//
                    Clothing clothing = new Clothing();
                    
                    //assign values from product table to clothing//
                    clothing.setProductID(rst.getInt("PRODUCTID"));
                    clothing.setProductName(rst.getString("PRODUCTNAME"));
                    clothing.setPrice(rst.getDouble("PRICE"));
                    clothing.setStockLevel(rst.getInt("STOCKLEVEL"));
                    clothing.setMeasurement(rst.getString("MEASUREMENT"));
                    //adds clothing objects to hashmap//
                    clothes.put(clothing.getProductID(), clothing);
                }
            }
        //catch any exceptions//
        } catch (ClassNotFoundException | SQLException ex) {
            String message = ex.getMessage();
            System.out.println(message);
        }
        //returns hashmap//
        return clothes;
    }
    
    
    /**
     Load Footwear
     * @return - HashMap 
     */
    public HashMap<Integer, Footwear> loadAllFootwear()
    {
        //instantiating footwear HashMap
        HashMap<Integer, Footwear> footwear = new HashMap();
        
        
        try 
        {
            //Use Driver//
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            //Create Connextion//
            try (Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/CITYSHOPPINGDB","Jordan", "1111")) {
                //Create Statement//
                Statement stmt = conn.createStatement();
                //sql string//
                String sql = "Select * From FOOTWEARTABLE INNER JOIN PRODUCTSTABLE ON FOOTWEARTABLE.PRODUCTID = PRODUCTSTABLE.PRODUCTID";
                //Declare result set//
                ResultSet rst;
                //execute statement//
                rst = stmt.executeQuery(sql);
                
                //loop result set//
                while (rst.next())
                {
                    
                    Footwear footwearItem = new Footwear();
                    
                    footwearItem.setProductID(rst.getInt("PRODUCTID"));
                    footwearItem.setProductName(rst.getString("PRODUCTNAME"));
                    footwearItem.setPrice(rst.getDouble("PRICE"));
                    footwearItem.setStockLevel(rst.getInt("STOCKLEVEL"));
                    footwearItem.setSize(rst.getInt("SIZE"));
                    //add item//
                    footwear.put(footwearItem.getProductID(), footwearItem);
                }
            }
        //catchexceptions
        } catch (ClassNotFoundException | SQLException ex) {
            String message = ex.getMessage();
            System.out.println(message);
        }
        //returns hashmap//
        return footwear;
    }
    
    
    /**
     * Updates clothing Item
     * @param newClothing
     */
    public void updateClothingItem (Clothing newClothing)
    {
        try {
                //Use Driver//
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                //Create connection//
                try (Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/CITYSHOPPINGDB","Jordan", "1111")) {
                    //Creates statement//
                    Statement stmt = conn.createStatement();
                    // Execute statements// 
                    stmt.executeUpdate("UPDATE PRODUCTSTABLE SET PRODUCTNAME = '" + newClothing.getProductName() + "', PRICE = " + newClothing.getPrice() + ", STOCKLEVEL = " + newClothing.getStockLevel() + " WHERE PRODUCTID = " + newClothing.getProductID() + "");
                    stmt.executeUpdate("UPDATE CLOTHINGTABLE SET MEASUREMENT = '" + newClothing.getMeasurement() + "' WHERE PRODUCTID = " + newClothing.getProductID() + "");
                }
                //Catch Exceptions//
        } catch (ClassNotFoundException | SQLException ex) {
                String message = ex.getMessage();
                System.out.println(message);
            }
    }
    
    
    /**
     * Updates Footwear Item
     * @param newFootwear
     */
    public void updateFootwearItem (Footwear newFootwear)
    {
        try {
                //Use Driver//
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                //Create Statement//
                try (Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/CITYSHOPPINGDB","Jordan", "1111")) {
                    //Create Statement//
                    Statement stmt = conn.createStatement();
                    // Update Statement// 
                    stmt.executeUpdate("UPDATE PRODUCTSTABLE SET PROCUCTNAME = '" + newFootwear.getProductName() + "', PRICE = '" + newFootwear.getPrice() + "', STOCKLEVEL = '" + newFootwear.getStockLevel() + "' WHERE PRODUCTID = '" + newFootwear.getProductID() + "'");
                    stmt.executeUpdate("UPDATE FOOTWEARTABLE SET SIZE = '" + newFootwear.getSize() + "' WHERE PRODUCTID = '" + newFootwear.getProductID() + "'");
                }
            //catch exceptions//
            } catch (ClassNotFoundException | SQLException ex) {
                String message = ex.getMessage();
                System.out.println(message);
            }
    }
    
    
    /**
     * Finds clothing
     * @param id
     * @return returns Clothing Item
     */
    public Clothing findClothing(int id)
    {
        //clothing variable //
        Clothing clothing = new Clothing();
        try 
        {
            //Use Driver//
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            //Create connection// 
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/CITYSHOPPINGDB","Jordan", "1111");
            //Create statement//
            Statement stmt = conn.createStatement();
            //sql string//
            String sql = "Select * From CLOTHINGTABLE INNER JOIN PRODUCTSTABLE ON CLOTHINGTABLE.PRODUCTID = PRODUCTSTABLE.PRODUCTID WHERE PRODUCTSTABLE.PRODUCTID = " + id + "";
            //result set//
            ResultSet rst;
            //Execute query//
            rst = stmt.executeQuery(sql);
                
            //if rsult is returned//
            if(rst.next())
            {
                //Set values//
                clothing.setProductID(rst.getInt("PRODUCTID"));
                clothing.setProductName(rst.getString("PRODUCTNAME"));
                clothing.setPrice(rst.getDouble("PRICE"));
                clothing.setStockLevel(rst.getInt("STOCKLEVEL"));
                clothing.setMeasurement(rst.getString("MEASUREMENT"));
            }
            else
            {
                clothing = null;
            }
        //catch exceptions 
        } catch (ClassNotFoundException | SQLException ex) {
            String message = ex.getMessage();
            System.out.println(message);
        }
        //returning clothing
        return clothing;
    }
        

    /**
     * find product by id
     * @param id 
     * @return returns clothing item
     */
    public Product findProduct(int id)
    {
        //if values are there//
        if(findClothing(id)!=null)
        {
            //find clothing by id//
            return findClothing(id);
        }
        
        else
        {
            //find footwear by id
            return findFootwear(id);
        }
    }
    
    
    /**
     *finds footwear
     * @param id
     * @return footwear object
     */
    public Footwear findFootwear(int id)
    {
        //footwear object//
        Footwear footwear = new Footwear();
            try 
            {
                //Use driver//
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                //connect to db//
                Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/CITYSHOPPINGDB","Jordan", "1111");
                //Create statement//
                Statement stmt = conn.createStatement();
                //sql string 
                String sql = "Select * From FOOTWEARTABLE INNER JOIN PRODUCTSTABLE ON FOOTWEARTABLE.PRODUCTID = PRODUCTSTABLE.PRODUCTID WHERE PRODUCTSTABLE.PRODUCTID = " + id + "";
                //result set//
                ResultSet rst;
                //execute statement//
                rst = stmt.executeQuery(sql);


                if(rst.next())
                {
                    
                    footwear.setProductID(rst.getInt("PRODUCTID"));
                    footwear.setProductName(rst.getString("PRODUCTNAME"));
                    footwear.setPrice(rst.getDouble("PRICE"));
                    footwear.setStockLevel(rst.getInt("STOCKLEVEL"));
                    footwear.setSize(rst.getInt("SIZE"));
                }
                else
                {
                    //if nothing is returned set object to null//
                    footwear = null;
                }
            //catch exceptions//
            } catch (ClassNotFoundException | SQLException ex) {
                String message = ex.getMessage();
                System.out.println(message);
            }
        //return object//
        return footwear;
    }
    
    
    /**
     * Gets next id for use in system
     * @return integer denoting max id
     */
    public int getNextOrderID()
    {
        
        int next = 1;
        
        try
        {
            //Db Driver//
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            //Create Connection
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/CITYSHOPPINGDB","Jordan", "1111");
            //Create statement//
            Statement stmt = conn.createStatement();
            //sql statement//
            String sql = "Select MAX(ORDERID) From ORDERSTABLE";
            
            ResultSet rst;
            //Execute statement//
            rst = stmt.executeQuery(sql);
            
           
            if(rst.next())
            {
               
                next = rst.getInt(1);              
                next++;
            }
        //catch errors//
        } catch (ClassNotFoundException | SQLException ex) {
            String message = ex.getMessage();
            System.out.println(message);
        }

        //returns max id//
        return next;
    }
    
    
  
    public int getNextUserID()
    {
        
        int next = 1;
        try 
        {
           
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/CITYSHOPPINGDB","Jordan", "1111");
            Statement stmt = conn.createStatement();
            String sql = "Select MAX(USERID) From (SELECT USERID FROM CUSTOMERSTABLE UNION SELECT USERID FROM STAFFTABLE)COMBINED";
            ResultSet rst;
            rst = stmt.executeQuery(sql);
                
            if(rst.next())
            {
                next = rst.getInt(1);              
                next++;
                
            }
        } catch (ClassNotFoundException | SQLException ex) {
            String message = ex.getMessage();
            System.out.println(message);
        }
        return next;
    }
         
    /**
     * Delete customer from database 
     * @param originalCustomer
     */
    public void deleteCustomer (Customer originalCustomer)
    {

        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            try (Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/CITYSHOPPINGDB","Jordan", "1111")) {
                Statement stmt = conn.createStatement();

                
                stmt.executeUpdate("DELETE FROM CUSTOMERSTABLE WHERE USERNAME = '" + originalCustomer.getUsername() + "'");                
                stmt.executeUpdate("DELETE FROM ORDERSTABLE WHERE CUSTID = " + originalCustomer.getUserID() + "");
           
            }
        } catch (ClassNotFoundException | SQLException ex) {
            String message = ex.getMessage();
            System.out.println(message);
        }
    }
    
         public void saveCustomer(Customer customer) {
        try {
            //Use Driver//
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            //Create connection//
            try (Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/CITYSHOPPINGDB","Jordan", "1111")) {
                //Create statement//
                Statement stmt = conn.createStatement();
                //execute sql statement//
                stmt.executeUpdate("INSERT INTO CUSTOMERSTABLE (USERID, USERNAME, PASSWORD, FIRSTNAME, LASTNAME, ADDRESSLINE1, ADDRESSLINE2, TOWN, POSTCODE, ISREGISTERED) VALUES (" +
                        customer.getUserID() + " , '" + customer.getUsername() + "' , '" + customer.getPassword() + "', '" + customer.getFirstName() + "', '" + customer.getLastName() +
                        "', '" + customer.getAddressLine1() + "', '" + customer.getAddressLine2() + "', '" + customer.getTown() + "', '" + customer.getPostcode() + "', '" + customer.getIsRegistered()
                        + "')" );
            }
        //catch errors//
        } catch (ClassNotFoundException | SQLException ex) {
            String message = ex.getMessage();
            System.out.println(message);
        }
    }
    /**
     * Update customer
     * @param originalCustomer 
     * @param newCustomer
     */
    public void updateCustomer (Customer originalCustomer, Customer newCustomer)
    {
        try {
            //Use driver//
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                //create connection//
                try (Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/CITYSHOPPINGDB","Jordan", "1111")) {
                    //create statement//
                    Statement stmt = conn.createStatement();
                    //execute statement//
                    stmt.executeUpdate("UPDATE CUSTOMERSTABLE SET PASSWORD = '" + newCustomer.getPassword() + "', FIRSTNAME = '" +
                            newCustomer.getFirstName() + "', LASTNAME = '" + newCustomer.getLastName() + "', ADDRESSLINE1 = '" +
                            newCustomer.getAddressLine1() + "', ADDRESSLINE2 = '" + newCustomer.getAddressLine2() + "', TOWN = '" +
                            newCustomer.getTown() + "', POSTCODE = '" + newCustomer.getPostcode() + "' WHERE USERNAME = '" + originalCustomer.getUsername() + "'");
                }
            //catch exceptions//
            } catch (ClassNotFoundException | SQLException ex) {
                String message = ex.getMessage();
                System.out.println(message);
            }
    }
    
   
    /**
     *Find customer by username
     * @param input 
     * @return - customer
     */
    public Customer findCustomer(String input)
    {
        //Customer instance//
        Customer cust = new Customer();
        try 
        {
            //Db Driver//
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            //vreate connection
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/CITYSHOPPINGDB","Jordan", "1111");
            //create statement//
            Statement stmt = conn.createStatement();
            //sql statement//
            String sql = "Select * From CUSTOMERSTABLE Where USERNAME = '" + input.trim() + "'";
            //rsdult set tst//
            ResultSet rst;
            //Execute statement//
            rst = stmt.executeQuery(sql);
                
            if(rst.next())
            {
                cust.setUserID(rst.getInt("USERID"));
                cust.setUserName(rst.getString("USERNAME"));
                cust.setPassword(rst.getString("PASSWORD"));
                cust.setFirstName(rst.getString("FIRSTNAME"));
                cust.setLastName(rst.getString("LASTNAME"));
                cust.setAddressLine1(rst.getString("ADDRESSLINE1"));
                cust.setAddressLine2(rst.getString("ADDRESSLINE2"));
                cust.setTown(rst.getString("TOWN"));
                cust.setPostcode(rst.getString("POSTCODE"));
                cust.setIsRegistered(rst.getBoolean("ISREGISTERED"));
               
                
            }
            else
            {
                cust = null;
            }
        //catch any errors//    
        } catch (ClassNotFoundException | SQLException ex) {
            String message = ex.getMessage();
            System.out.println(message);
        }
        //return customer variable//
        return cust;
    }
    
    /**
     * return customer through user id match
     * @param input
     * @return - customer
     */
    public Customer findCustomer(int input)
    {
        //instance of the customer class
        Customer customer = new Customer();
        try 
        {
            //Use Driver//
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            //Create connection//
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/CITYSHOPPINGDB","Jordan", "1111");
            //creates a statment //
            Statement stmt = conn.createStatement();
            //sql stirng//
            String sql = "Select * From CUSTOMERSTABLE Where USERID = " + input + "";
            //instantiating our result set
            ResultSet rst;
            //execute query//
            rst = stmt.executeQuery(sql);
                
            //if result has values//
            if(rst.next())
            {
                customer.setUserID(rst.getInt("USERID"));
                customer.setUserName(rst.getString("USERNAME"));
                customer.setPassword(rst.getString("PASSWORD"));
                customer.setFirstName(rst.getString("FIRSTNAME"));
                customer.setLastName(rst.getString("LASTNAME"));
                customer.setAddressLine1(rst.getString("ADDRESSLINE1"));
                customer.setAddressLine2(rst.getString("ADDRESSLINE2"));
                customer.setTown(rst.getString("TOWN"));
                customer.setPostcode(rst.getString("POSTCODE"));
                customer.setIsRegistered(rst.getBoolean("ISREGISTERED"));
                
            }
            else
            {
                customer = null;
            }
        //catch exceptions//
        } catch (ClassNotFoundException | SQLException ex) {
            String message = ex.getMessage();
            System.out.println(message);
        }
        //returning customer
        return customer;
    }
    
    
    /**
     * 
     * @param inputUsername 
     * @return - staff
     */
    public Staff findStaff(String inputUsername) {
        //create staff//
        Staff staff = new Staff();
        try 
        {
            //Use Driver//
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            //Create Connection//
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/CITYSHOPPINGDB","Jordan", "1111");
            //Create Statement//
            Statement stmt = conn.createStatement();
            //sql string//
            String sql = "Select * From STAFFTABLE Where USERNAME = '" + inputUsername.trim() + "'";
            //Resultset//
            ResultSet rst;
            //Execute Statement//
            rst = stmt.executeQuery(sql);
                
            //if tresult has values//
            if(rst.next())
            {
               
                staff.setUserID(rst.getInt("USERID"));
                staff.setUserName(rst.getString("USERNAME"));
                staff.setPassword(rst.getString("PASSWORD"));
                staff.setFirstName(rst.getString("FIRSTNAME"));
                staff.setLastName(rst.getString("LASTNAME"));
                staff.setPosition(rst.getString("POSITION"));
                staff.setSalary(rst.getDouble("SALARY"));
            }
          
            else
            {
                
                staff = null;
            }
      
        } catch (ClassNotFoundException | SQLException ex) {
            String message = ex.getMessage();
            System.out.println(message);
        }
        
        return staff;
    }

    
    /**
     * method For getting the next Product IDs //
     * @return - Integer for ID
     */
    public int getNextProductID() {
        //creatingour integer and setting it to one
        int next = 1;
        try 
        {
            //Driver//
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            //Create Connection//
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/CITYSHOPPINGDB","Jordan", "1111");
            //Create Statement//
            Statement stmt = conn.createStatement();
            //Construct SQL statement//
            String sql = "Select MAX(PRODUCTID) From PRODUCTSTABLE";
            //Create instance of ResultSet//
            ResultSet rst;
            // execute query//
            rst = stmt.executeQuery(sql);
                
            //if query has a result//
            if(rst.next())
            {
                //assign the variable to result
                next = rst.getInt(1);           
                //increment//
                next++;
                
            }
        //catch exceptions//
        } catch (ClassNotFoundException | SQLException ex) {
            String message = ex.getMessage();
            System.out.println(message);
        }
        
        //return next//
        return next;        
    }

    /**
     * @param productID
     * @param quantity 
     */
    public void adjustStockLevel(int productID, int quantity) {
            try {
                //derby database driver//
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                
                // create connection to database//
                try (Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/CITYSHOPPINGDB","Jordan", "1111")) {
                    
                    //create statment with connection//
                    Statement stmt = conn.createStatement();
                    
                    //execute sql//
                    stmt.executeUpdate("UPDATE PRODUCTSTABLE SET STOCKLEVEL = " + (findProduct(productID).getStockLevel() - quantity) + " WHERE PRODUCTID = " + productID + "");
                }
            //catch exceptions//
            } catch (ClassNotFoundException | SQLException ex) {
                String message = ex.getMessage();
                System.out.println(message);
            }
    }
    
}