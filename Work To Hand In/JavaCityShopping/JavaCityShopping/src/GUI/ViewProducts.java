package GUI;

import DataModels.Clothing;
import DataModels.Footwear;
import DataModels.Customer;
import DataModels.Product;
import DataModels.DbManager;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;


/**
 * 
 * @author Jordan Porter
 * class for the ViewProducts page
 */
public class ViewProducts extends javax.swing.JFrame {
    
    //global variable for customer//
    Customer customer;
  

 
    
    /**
     * Constructor
     */
   private ViewProducts() {
        initComponents();
        fillCategoryList();
        if (customer == null)
        {
            returnBtn.setText("Return to Main Menu");
        }  
    }
    
    /**
     * Constructor
     * @param cust
     */
    public ViewProducts(Customer cust)
    {
        initComponents();
        this.customer = cust;
        fillCategoryList();
        if (cust == null)
        {
            returnBtn.setText("Return to Main Menu");
        }        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        returnBtn = new javax.swing.JButton();
        titleLbl = new javax.swing.JLabel();
        basketBtn = new javax.swing.JButton();
        categoriesLbl = new javax.swing.JLabel();
        productLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        categoryList = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        productList = new javax.swing.JList<>();
        quantityLbl = new javax.swing.JLabel();
        quantityDD = new javax.swing.JComboBox<>();
        addBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 600));

        returnBtn.setText("RETURN TO CUSTOMER HOME");
        returnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBtnActionPerformed(evt);
            }
        });

        titleLbl.setText("PRODUCTS");

        basketBtn.setText("VIEW BASKET");
        basketBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                basketBtnActionPerformed(evt);
            }
        });

        categoriesLbl.setText("CATEGORIES");

        productLbl.setText("PRODUCTS");

        categoryList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                categoryListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(categoryList);

        productList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                productListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(productList);

        quantityLbl.setText("QUANTITY:");

        quantityDD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", " " }));

        addBtn.setText("ADD TO BASKET");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(returnBtn)
                        .addGap(18, 18, 18)
                        .addComponent(titleLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 312, Short.MAX_VALUE)
                        .addComponent(basketBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(categoriesLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(productLbl))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(quantityLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(quantityDD, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(jScrollPane2))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(returnBtn)
                    .addComponent(titleLbl)
                    .addComponent(basketBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoriesLbl)
                    .addComponent(productLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantityLbl)
                    .addComponent(quantityDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addBtn)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    /**
     * Event listener to check for changed clothing category
     * @param evt (un-used)
     */
    private void categoryListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_categoryListValueChanged
        
        productList.clearSelection();
        
        if(categoryList.getSelectedValue().equals("Clothing"))
        {
            DbManager db = new DbManager();
            DefaultListModel dlm = new DefaultListModel();
            HashMap<Integer, Clothing> clothing;    
            
            clothing = db.loadAllClothing();         
            
            
            if(!clothing.isEmpty())
            {
                // if hashmap is empty, loop the HashMap//
                //adding each product to our list model//
                clothing.values().forEach((c) -> {
                    dlm.addElement(c);
                });    
            }

            //passed the list for display//
            productList.setModel(dlm);
            
        }
        
        if(categoryList.getSelectedValue().equals("Footwear"))
        {
            //initialise an instance of db manager, clothing HashMap and list model//
            DbManager db = new DbManager();
            DefaultListModel dlm = new DefaultListModel();
            HashMap<Integer, Footwear> footwear;
            
            //load footwear from db//
            footwear = db.loadAllFootwear();
            
            
            if(!footwear.isEmpty())
            {
                // if hashmap is not empty//
                //loops the HashMap to add values tomodel//
                footwear.values().forEach((c) -> {
                    dlm.addElement(c);
                });
            }
            
            //pass the list for display//
            productList.setModel(dlm);  
            
        }
    }//GEN-LAST:event_categoryListValueChanged

    
    /**
     * on click listener for our add to basket button
     * @param evt (un-used)
     */
    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        //if there is a category value selected//
        if(categoryList.getSelectedValue() != null)
        {
            if(productList.getSelectedValue() != null)
            {
                //creates list model
                DefaultListModel dlm;
                
                // gets selected items index number
                int index = productList.getSelectedIndex();
                
                dlm = (DefaultListModel)productList.getModel();
                
                Product p = (Product)dlm.getElementAt(index);
                
                int quantity = quantityDD.getSelectedIndex()+1;

                //creates a db manager
                DbManager db = new DbManager();

            }
            
            else
            {
                 messageBox("Please select an item!","BASKET");
            }
        }
        
        //if there is no category selected we display message in pop up window
        else
        {
            messageBox("Please select a category!","BASKET");
        }
    }//GEN-LAST:event_addBtnActionPerformed

    
    /**
     * Basket button
     * @param evt (un-used)
     */
    private void basketBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basketBtnActionPerformed
    
    }//GEN-LAST:event_basketBtnActionPerformed

    
    /**
     *  back button
     * @param evt (un-used)
     */
    private void returnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBtnActionPerformed

                if(customer == null){
                    //create new menu form//
                    MainMenu menu = new MainMenu();

                    //dispose of current form//
                    this.dispose();

                    //make new form visible
                    menu.setVisible(true); 
            }
        
        
        else
        {
            //create instance of our customer home form passing our cust variable to the new form
            CustomerHome custhome = new CustomerHome(customer);
            
            //close existing form
            this.dispose();
            
            //make new form visible
            custhome.setVisible(true);
        }
    }//GEN-LAST:event_returnBtnActionPerformed

    
    /**
     * on click listener for our product list box triggered when the selected element is changed
     * this method is used to ensure the quantity drop down is populated dynamically
     * @param evt (un-used)
     */
    private void productListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_productListValueChanged
        //creates default list model variable
        DefaultListModel dlm;
        
        //checks to see if there is an active selection
        if(productList.getSelectedIndex()!=-1)
        {
          
            int index = productList.getSelectedIndex();

            //
            dlm = (DefaultListModel)productList.getModel();

            //
            if(!dlm.isEmpty())
            {

               
                Product p = (Product)dlm.getElementAt(index);

                if(p.getStockLevel() != 0)
                {
                    //enables our add button and drop down
                    addBtn.setEnabled(true);
                    quantityDD.setEnabled(true);

                    //creates a string array the size of our stock level
                    String[] quantity = new String[p.getStockLevel()];

                    //loops from 1 to our stock level adding each number to our array
                    for (int i = 1; i <= p.getStockLevel(); i++)
                    {
                        quantity[i-1] = "" + i;
                    }

                   
                    DefaultComboBoxModel dcbm = new DefaultComboBoxModel(quantity);

                    ///sets the model to our combo box for display
                    quantityDD.setModel(dcbm);
                }

              
                else
                {
                    //disable buttons and dropdowns//
                    addBtn.setEnabled(false);
                    quantityDD.setEnabled(false);

                    //displays error message//
                    messageBox("This item is out of stock!","BASKET");
                }
            }
        }
        
        
    }//GEN-LAST:event_productListValueChanged

    
    /**
     *Fill list model
     */
    private void fillCategoryList()
    {
        
        categoryList.setVisibleRowCount(2);
        categoryList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        DefaultListModel dlm = new DefaultListModel();
        
      
        dlm.addElement("Clothing");
        dlm.addElement("Footwear");
        
        
        categoryList.setModel(dlm);
    }
    
    
    /**
     * @param args 
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ViewProducts().setVisible(true);
        });
    }
    
    
    /**
     * Message Box method
     * @param infoMessage
     * @param titleBar 
     */
    public static void messageBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "Information: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton basketBtn;
    private javax.swing.JLabel categoriesLbl;
    private javax.swing.JList<String> categoryList;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel productLbl;
    private javax.swing.JList<String> productList;
    private javax.swing.JComboBox<String> quantityDD;
    private javax.swing.JLabel quantityLbl;
    private javax.swing.JButton returnBtn;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables


}
