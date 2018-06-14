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
import static GUI.CustomerHome.messageBox;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Jordan Porter  
 */
public class StaffViewProducts extends javax.swing.JFrame {

    //global variable sotring current staff member // 
    Staff staff;
    
    
    /**
     * Creates new form StaffViewProducts with constructor//
     */
    public StaffViewProducts() {
        initComponents();
        staff = new Staff();
        fillCategoryList();
    }
    
     /**
     * Creates new form StaffViewProducts from constructor
     * @param staff - parameter holding our logged in staff member
     */
    public StaffViewProducts(Staff staff)
    {
        initComponents();
        this.staff = staff;
        fillCategoryList();
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backBtn = new javax.swing.JButton();
        titleLbl = new javax.swing.JLabel();
        catLbl = new javax.swing.JLabel();
        prdLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        catList = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        proList = new javax.swing.JList<>();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 600));

        backBtn.setText("RETURN TO STAFF HOME");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText("EDIT PRODUCTS");

        catLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        catLbl.setText("CATEGORY");

        prdLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prdLbl.setText("PRODUCT");

        catList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                catListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(catList);

        jScrollPane2.setViewportView(proList);

        editBtn.setText("EDIT PRODUCT");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("DELETE PRODUCT");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        addBtn.setText("ADD A NEW PRODUCT");
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
                    .addComponent(addBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(catLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(prdLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prdLbl)
                    .addComponent(catLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editBtn)
                    .addComponent(deleteBtn))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    /**
     * event is triggered when category valueon list is selected 
     * @param evt 
     */
    private void catListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_catListValueChanged
        
        //if list box selection equals clothing
        if(catList.getSelectedValue().equals("Clothing"))
        {
            //Create the db manager, clothing HashMap and list model//
            DbManager db = new DbManager();
            DefaultListModel dlm = new DefaultListModel();
            HashMap<Integer, Clothing> clothing;    
            
            clothing = db.loadAllClothing();         
            
            if(!clothing.isEmpty())
            {
                clothing.values().forEach((c) -> {
                    dlm.addElement(c);
                });    
            }
                
                
            //passed the list model to the list for display
            proList.setModel(dlm);
            
        }
        
        //if list box selection equals footwear
        if(catList.getSelectedValue().equals("Footwear"))
        {
            DbManager db = new DbManager();
            DefaultListModel dlm = new DefaultListModel();
            HashMap<Integer, Footwear> footwear;
            
            footwear = db.loadAllFootwear();
            
            if(!footwear.isEmpty())
            {
                footwear.values().forEach((c) -> {
                    dlm.addElement(c);
                });
            }
            
            proList.setModel(dlm);  
            
        }
      
    }//GEN-LAST:event_catListValueChanged

    
    /**
     * add product button 
     * @param evt 
     */
    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        AddProduct ap = new AddProduct(staff);
        this.dispose();
        ap.setVisible(true);
    }//GEN-LAST:event_addBtnActionPerformed

    
    /**
     *  back button
     * @param evt 
     */
    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        StaffHome sh = new StaffHome(staff);
        //closes existing form
        this.dispose();
        //sets new form to visible
        sh.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    
    /**
     *  delete button
     * @param evt 
     */
    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
               
        int o = JOptionPane.showConfirmDialog(null, "This action will delete this product from your shop\nDo you wish to continue?","DELETE PRODUCT",JOptionPane.YES_NO_OPTION);
       
        DbManager db = new DbManager();
        if(o == 0)
        {
            DefaultListModel dlm = (DefaultListModel)proList.getModel();
            int index = proList.getSelectedIndex();
            
            Product p = (Product)dlm.getElementAt(index);
                dlm.remove(index);

                titleLbl.setText("Item Deleted!");

                db.deleteProduct(p);

                
                messageBox("This item has been deleted!\nClose to continue.","PRODUCT DELETE");

                proList.setModel(dlm);
             
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    
    /**
     * edit button
     * @param evt 
     */
    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed

        //create list  model//
        DefaultListModel dlm = (DefaultListModel)proList.getModel();

        //mapping index to int variable//
        int index = proList.getSelectedIndex();

        Product p = (Product)dlm.getElementAt(index);

        //checking category//
        boolean cloth = p instanceof Clothing;

        //edit product//
        EditProduct ep = new EditProduct(p, staff, cloth);
        //close form//
        this.dispose();
        //set form to visible//
        ep.setVisible(true);

    }//GEN-LAST:event_editBtnActionPerformed

    

    
    
    
    /**
     * fill category list box
     */
    private void fillCategoryList()
    {
        //sets row count to 2 to allow for 2 categories//
        catList.setVisibleRowCount(2);
        
        //allow only one selection//
        catList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        //  default list model//
        DefaultListModel dlm = new DefaultListModel();
        
        //adds  categories to list model//
        dlm.addElement("Clothing");
        dlm.addElement("Footwear");
        
        catList.setModel(dlm);
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
            java.util.logging.Logger.getLogger(StaffViewProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffViewProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffViewProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffViewProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new StaffViewProducts().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel catLbl;
    private javax.swing.JList<String> catList;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel prdLbl;
    private javax.swing.JList<String> proList;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
