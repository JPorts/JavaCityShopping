/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import DataModels.Customer;
import DataModels.DbManager;
import javax.swing.JOptionPane;

/**
 
 * @author Jordan Porter
 * Class Customer Home page.
 */
public class CustomerHome extends javax.swing.JFrame {


    
    //global variable for current customer//
    Customer customer;

  
    //Constructor//
    public CustomerHome() {
        initComponents();
    }
    
    
    /**
     * @param customer - Current customer
     */
    public CustomerHome(Customer customer) {
        initComponents();
        this.customer = customer;
        welcomeLbl.setText(this.customer.displayGreeting());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomeLbl = new javax.swing.JLabel();
        browseBtn = new javax.swing.JButton();
        viewOrdersBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        unregBn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 600));

        welcomeLbl.setText("Welcome");

        browseBtn.setText("BROWSE PRODUCTS");
        browseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseBtnActionPerformed(evt);
            }
        });

        viewOrdersBtn.setText("VIEW MY ORDERS");
        viewOrdersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewOrdersBtnActionPerformed(evt);
            }
        });

        editBtn.setText("EDIT DETAILS");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        unregBn.setText("UNREGISTER FROM SHOP");
        unregBn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unregBnActionPerformed(evt);
            }
        });

        logoutBtn.setText("LOG OUT");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(welcomeLbl)
                .addContainerGap(174, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(logoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                    .addComponent(browseBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewOrdersBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(unregBn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE))
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcomeLbl)
                .addGap(18, 18, 18)
                .addComponent(browseBtn)
                .addGap(18, 18, 18)
                .addComponent(viewOrdersBtn)
                .addGap(18, 18, 18)
                .addComponent(editBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(unregBn)
                .addGap(18, 18, 18)
                .addComponent(logoutBtn)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    /**
     * on click for edit button
     * @param evt 
     */
    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
   
        EditDetails editDetails = new EditDetails();
        //closes current form//
        this.dispose();
        //sets new form to visible//
        editDetails.setVisible(true);
    }//GEN-LAST:event_editBtnActionPerformed

    
    /**
     * Unregister Button
     * @param evt 
     */
    private void unregBnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unregBnActionPerformed
        
        //Display message//
        int i = JOptionPane.showConfirmDialog(null, "This will permanently delete your account.\nDo you wish to continue?","DELETE",JOptionPane.YES_NO_OPTION);
                
        //if yes is selected//
        if(i == 0)
        {
          
            welcomeLbl.setText("You heve been de-registered!");
            
            //create db//
            DbManager db = new DbManager();
            //Delete customer passing current instsnce//
            db.deleteCustomer(customer);

            //display message//
            messageBox("Your profile has been deleted.\nClose this window to continue.","USER DELETED");

            
            MainMenu menu = new MainMenu();
            //dispose form//
            this.dispose();
            
            //  set visible//
            menu.setVisible(true);
        }
    }//GEN-LAST:event_unregBnActionPerformed

    
    /**
     * Browse button
     * @param evt 
     */
    private void browseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseBtnActionPerformed
       
        //Method to go to View Products page//
        ViewProducts viewProducts = new ViewProducts(customer);
        this.dispose();
        viewProducts.setVisible(true);
    }//GEN-LAST:event_browseBtnActionPerformed

    
    /**
     *  log out button
     * @param evt 
     */
    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        //set customet to null//
        customer = null;
        
        //display message and navigate to main menu//
        messageBox("You are now logged out.\nClose this window to return to the main menu.","USER STATUS");
        MainMenu mnu = new MainMenu(customer);
        this.dispose();
        mnu.setVisible(true);
    }//GEN-LAST:event_logoutBtnActionPerformed

    
 //UNIMPLEMENTED// 
    private void viewOrdersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewOrdersBtnActionPerformed
      
    }//GEN-LAST:event_viewOrdersBtnActionPerformed

    
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
            java.util.logging.Logger.getLogger(CustomerHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerHome().setVisible(true);
            }
        });
    }

    
 
    public static void messageBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "Message: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton unregBn;
    private javax.swing.JButton viewOrdersBtn;
    private javax.swing.JLabel welcomeLbl;
    // End of variables declaration//GEN-END:variables
}
