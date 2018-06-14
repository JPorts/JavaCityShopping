/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DataModels.Clothing;
import DataModels.DbManager;
import DataModels.Footwear;
import DataModels.Product;
import DataModels.Staff;
import javax.swing.JOptionPane;


/**
 *
 * @author Jordan Porter
 */
public class EditProduct extends javax.swing.JFrame {

    //global variable storing product//
    Product prod;
    //boolean tp check what category it belongs to//
    boolean clothing;     
    //current staff member//
    Staff staff;
    //Constructor
    public EditProduct() {
        initComponents();
    }
    
    //Constructor
    public EditProduct(Product prod, Staff staff, boolean clothing)
    {
        initComponents();
        this.prod = prod;
        this.staff = staff;
        this.clothing = clothing;
        
        passInputs();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLbl = new javax.swing.JLabel();
        idLbl = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        priceLbl = new javax.swing.JLabel();
        stockLbl = new javax.swing.JLabel();
        varLbl = new javax.swing.JLabel();
        idTxtBx = new javax.swing.JTextField();
        priceTxtBx = new javax.swing.JTextField();
        nameTxtBx = new javax.swing.JTextField();
        varTxtBx = new javax.swing.JTextField();
        stockTxtBx = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        submitBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText("EDIT PRODUCT DETAILS");

        idLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        idLbl.setText("ID:");

        nameLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nameLbl.setText("NAME:");

        priceLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        priceLbl.setText("PRICE: £");

        stockLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        stockLbl.setText("STOCK LEVEL:");

        varLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        varLbl.setText("MEASUREMENT:");

        backBtn.setText("RETURN TO PRODUCT SELECT");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        submitBtn.setText("SUBMIT CHANGES");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        clearBtn.setText("CLEAR CHANGES");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stockLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(varLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(varTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stockTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 113, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(submitBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(titleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clearBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLbl)
                    .addComponent(idTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLbl)
                    .addComponent(nameTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceLbl)
                    .addComponent(priceTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stockLbl)
                    .addComponent(stockTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(varLbl)
                    .addComponent(varTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(submitBtn)
                .addGap(53, 53, 53)
                .addComponent(clearBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    /**
     * clear button
     * @param evt 
     */
    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        passInputs();
    }//GEN-LAST:event_clearBtnActionPerformed

    
    /**
      back button
     * @param evt 
     */
    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
       
        StaffViewProducts staffViewProducts = new StaffViewProducts(staff);
        //dispse form//
        this.dispose();
        //set form visible//
        staffViewProducts.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    
    /**
      submit button
     * @param evt 
     */
    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        
        
        int o = JOptionPane.showConfirmDialog(null, "This will update a product in your shop\nDo you wish to continue?","Update Product",JOptionPane.YES_NO_OPTION);
        
        
        if(o == 0)
        {
            //if inputs are blank//
            if(varTxtBx.getText().equals("") ||
            nameTxtBx.getText().equals("") ||
            priceTxtBx.getText().equals("") ||
            stockTxtBx.getText().equals(""))
            {
                //display Message//
                infoBox("Please complete all fields adding an item.","ITEM ERROR");
            }
         
            
            else
            {
                
                
                if(validateLength(0,20,nameTxtBx.getText()) == true  || validateLength(0,20,varTxtBx.getText()) == true)
                {
                    //create db//
                    DbManager db = new DbManager();

                    try{
                        //pull double from input//
                        Double price = Double.parseDouble(priceTxtBx.getText());
                        try{
                            //pull int from input//
                            int stock = Integer.parseInt(stockTxtBx.getText());

                            //check category//
                            if(clothing)
                            {                    
                                //create clothing//
                                Clothing clothing = new Clothing(Integer.parseInt(idTxtBx.getText()), nameTxtBx.getText(), price, stock, varTxtBx.getText());
                                //db update method//
                                db.updateClothingItem(clothing);
                                //Display message//
                                infoBox("Item has been updated!","ITEM AMENDED");
                            }
                            
                            else
                            {
                                try{
                                    //pull int from input//
                                    int size = Integer.parseInt(varTxtBx.getText());
                                    //Create footwear//
                                    Footwear ft = new Footwear(Integer.parseInt(idTxtBx.getText()), nameTxtBx.getText(), price, stock, size);
                                    //db update method//
                                    db.updateFootwearItem(ft);
                                    //display message//
                                    infoBox("Item has been updated!","ITEM AMENDED");
                                } catch(Exception e){
                                    // Display message
                                    infoBox("Please only enter a numeric value for the item size!","INPUT ERROR");
                                }

                            }
                        }catch (Exception e){
                            // Display message
                            infoBox("Please only enter a numeric value for a stock level!","INPUT ERROR");
                        }
                    }catch (Exception e) {
                        // Display message
                        infoBox("Please only enter a numeric value for the item price!","INPUT ERROR");
                    }
                } 
              
                else
                {
                    // Display message
                    infoBox("Please ensure that the following collumns do not excede the maximum number of characters\n Name max: 20\nMeasurement max: 20","INPUT ERROR");
                }
            }
        }
    }//GEN-LAST:event_submitBtnActionPerformed

    
    /**
     * A method for input validation//
     * @param min - integer
     * @param max - integer
     * @param input - string
     * @return - returns boolean value//
     */
    public boolean validateLength(int min, int max, String input)
    {
        if(input.length() <= max && input.length() >= min)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    
    /**
     * pass inputs for products//
     */
    private void passInputs() 
    {
        //set id //
        idTxtBx.setText("" + prod.getProductID());
        idTxtBx.setEnabled(false);
        //set name//
        nameTxtBx.setText(prod.getProductName());
        //set price//
        priceTxtBx.setText("" + String.format("%.2f", prod.getPrice()));
        //set stock level//
        stockTxtBx.setText("" + prod.getStockLevel());
        
        if(clothing)
        {
            //create clothing - cast to product//
            Clothing c = (Clothing)prod;
            varTxtBx.setText(c.getMeasurement());
        }
        //if footwear
        else
        {
            //cast product to footwear subclass
            Footwear f = (Footwear)prod;
           
            
            varLbl.setText("SIZE:");
            varTxtBx.setText("" + f.getSize());
        }
    }
    
    
    /**
     * Method for messages//
     * @param infoMessage 
     * @param titleBar 
     */
    public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditProduct().setVisible(true);
            }
        });
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JLabel idLbl;
    private javax.swing.JTextField idTxtBx;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTxtBx;
    private javax.swing.JLabel priceLbl;
    private javax.swing.JTextField priceTxtBx;
    private javax.swing.JLabel stockLbl;
    private javax.swing.JTextField stockTxtBx;
    private javax.swing.JButton submitBtn;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JLabel varLbl;
    private javax.swing.JTextField varTxtBx;
    // End of variables declaration//GEN-END:variables
}
