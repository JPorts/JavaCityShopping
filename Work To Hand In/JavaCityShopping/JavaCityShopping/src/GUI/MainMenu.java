/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import DataModels.Customer;

/*
 * @author Jordan Porter
 * Class for main menu page
 */
public class MainMenu extends javax.swing.JFrame {

    //global variable holding a logged in user
    Customer cust;


    /**
     * constructor
     */
    public MainMenu() {
        initComponents();
    }
    

    // constructor//
    public MainMenu(Customer cust){
        initComponents();
        this.cust = cust;
    }
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuLbl = new javax.swing.JLabel();
        customerLoginBtn = new javax.swing.JButton();
        staffLoginBtn = new javax.swing.JButton();
        viewProductBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        menuLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuLbl.setText("MAIN MENU");

        customerLoginBtn.setText("CUSTOMER LOGIN");
        customerLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerLoginBtnActionPerformed(evt);
            }
        });

        staffLoginBtn.setText("STAFF LOGIN");
        staffLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffLoginBtnActionPerformed(evt);
            }
        });

        viewProductBtn.setText("VIEW PRODUCTS");
        viewProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProductBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewProductBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(staffLoginBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(customerLoginBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(menuLbl)
                .addGap(18, 18, 18)
                .addComponent(customerLoginBtn)
                .addGap(18, 18, 18)
                .addComponent(staffLoginBtn)
                .addGap(18, 18, 18)
                .addComponent(viewProductBtn)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    /**
     staff login button
     * @param evt 
     */
    private void staffLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffLoginBtnActionPerformed
        //Create staff
        StaffLogin stafflogin = new StaffLogin();
        //dispoose of current form//
        this.dispose();
        //sets form to visible//
        stafflogin.setVisible(true);
    }//GEN-LAST:event_staffLoginBtnActionPerformed

    
    /**
Customer Log In 
* @param evt 
     */
    private void customerLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerLoginBtnActionPerformed
        //if customer is currently logged in
        if (cust != null)
        {
            //error message
            menuLbl.setText("Please log out of account!");
        }
        //if no logged in customer
        else
        {
            //creates new instance of our log in page
            CustomerLogin login = new CustomerLogin();
            ///closes current form
            this.dispose();
            //sets new form to visible
            login.setVisible(true);
        }
    }//GEN-LAST:event_customerLoginBtnActionPerformed

    
    /**
     *products page event
     * @param evt 
     */
    private void viewProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProductBtnActionPerformed
        //if customer has values//
        if (cust != null)
        {
            //creates products for customer//
            ViewProducts viewProducts = new ViewProducts(cust);
            //dispose of current form//
            this.dispose();
            //sets form to visible//
            viewProducts.setVisible(true);
        }
        else
        {
            //Create product page//
            ViewProducts vp = new ViewProducts(cust);
            //dispose of current form//
            this.dispose();
            //Set form to visible//
            vp.setVisible(true);
        }
    }//GEN-LAST:event_viewProductBtnActionPerformed

    
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton customerLoginBtn;
    private javax.swing.JLabel menuLbl;
    private javax.swing.JButton staffLoginBtn;
    private javax.swing.JButton viewProductBtn;
    // End of variables declaration//GEN-END:variables
}
