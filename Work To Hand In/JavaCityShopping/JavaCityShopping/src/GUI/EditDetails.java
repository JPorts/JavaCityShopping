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
 * Class for the  Edit Details View 
 */
public class EditDetails extends javax.swing.JFrame {

    //global variable to store current customer//
    Customer customer;
    

    public EditDetails() {
        initComponents();
    }


    public EditDetails(Customer customer) {
        initComponents();
        this.customer = customer;
        userNameTxtBx.setText(customer.getUsername());
        userNameTxtBx.enable(false);
        passwordTxtBx.setText(customer.getPassword());
        firstNameTxtBx.setText(customer.getFirstName());
        lastNameTxtBx.setText(customer.getLastName());
        houseNumTxtBx.setText(customer.getAddressLine1());
        streetTxtBx.setText(customer.getAddressLine2());
        townTxtBx.setText(customer.getTown());
        postcodeTxtBx.setText(customer.getPostcode());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLbl = new javax.swing.JLabel();
        userNameTxtBx = new javax.swing.JTextField();
        userNameLbl = new javax.swing.JLabel();
        passwordTxtBx = new javax.swing.JTextField();
        passwordLbl = new javax.swing.JLabel();
        firstNameTxtBx = new javax.swing.JTextField();
        firstNameLbl = new javax.swing.JLabel();
        lastNameTxtBx = new javax.swing.JTextField();
        lastNameLbl = new javax.swing.JLabel();
        houseNumTxtBx = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        streetTxtBx = new javax.swing.JTextField();
        townLbl = new javax.swing.JLabel();
        townTxtBx = new javax.swing.JTextField();
        postcodeLbl = new javax.swing.JLabel();
        postcodeTxtBx = new javax.swing.JTextField();
        addTitleLbl = new javax.swing.JLabel();
        houseNumLbl = new javax.swing.JLabel();
        submitBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        backToLoginBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText("Edit Details");

        userNameLbl.setText("Username:");

        passwordLbl.setText("Password:");

        firstNameLbl.setText("First Name:");

        lastNameLbl.setText("Last Name:");

        jLabel2.setText("Street:");

        townLbl.setText("Town:");

        postcodeLbl.setText("Postcode:");

        addTitleLbl.setText("ADDRESS");

        houseNumLbl.setText("House/Flat Number:");

        submitBtn.setText("SUBMIT");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        clearBtn.setText("CLEAR");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        backToLoginBtn.setText("RETURN TO CUSTOMER HOME");
        backToLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToLoginBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(postcodeTxtBx)
                                    .addComponent(townTxtBx)
                                    .addComponent(streetTxtBx)
                                    .addComponent(houseNumTxtBx)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(houseNumLbl)
                                    .addComponent(townLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(postcodeLbl)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(81, 81, 81)
                                        .addComponent(addTitleLbl))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lastNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lastNameTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(firstNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(firstNameTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(passwordLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(passwordTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(userNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(userNameTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(clearBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(submitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 87, Short.MAX_VALUE)
                .addComponent(backToLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLbl)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameLbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameLbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameLbl))
                .addGap(18, 18, 18)
                .addComponent(addTitleLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(houseNumLbl)
                    .addComponent(houseNumTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(streetTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(townLbl)
                    .addComponent(townTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(postcodeLbl)
                    .addComponent(postcodeTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(submitBtn)
                .addGap(18, 18, 18)
                .addComponent(clearBtn)
                .addGap(18, 18, 18)
                .addComponent(backToLoginBtn)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    /**
     * submit button
     * @param evt 
     */
    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        //decllares a customer variable to store info//
        Customer newCustomerInfo;
        
        //creates an instance of  dbmanager//
        DbManager db = new DbManager();

        //if input length is invlalid//
        if(validateLength(0,30,userNameTxtBx.getText()) == false  || validateLength(5,20,passwordTxtBx.getText()) == false || validateLength(0,20,firstNameTxtBx.getText()) == false || validateLength(0,20,lastNameTxtBx.getText()) == false || validateLength(0,50,houseNumTxtBx.getText()) == false || validateLength(0,50,streetTxtBx.getText()) == false || validateLength(0,20,townTxtBx.getText()) == false || validateLength(0,10,postcodeTxtBx.getText()) == false)
        {
            //error message dialog box//
            messageBox("Please ensure that the following collumns do not excede the maximum number of characters\n","Validation Error");
        }
        //if all inputs are valid // 
        else
        {
        //pass user input to constructor//
        newCustomerInfo = new Customer(customer.getUserID(), userNameTxtBx.getText(), passwordTxtBx.getText(), firstNameTxtBx.getText(), lastNameTxtBx.getText(), houseNumTxtBx.getText(), streetTxtBx.getText(), townTxtBx.getText(), postcodeTxtBx.getText(), true);     
        //update customer//
        db.updateCustomer(customer, newCustomerInfo);

        //message displayed//
        titleLbl.setText("User Updated");
        //assign new details to customer // 
        customer = newCustomerInfo;
       
        }
    }//GEN-LAST:event_submitBtnActionPerformed

    
    /**
     * clear button
     * @param evt 
     */
    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        //all feilds cleared//
        titleLbl.setText("EDIT MY DETAILS");
        userNameTxtBx.setText(customer.getUsername());
        passwordTxtBx.setText("");
        firstNameTxtBx.setText("");
        lastNameTxtBx.setText("");
        houseNumTxtBx.setText("");
        streetTxtBx.setText("");
        townTxtBx.setText("");
        postcodeTxtBx.setText("");
    }//GEN-LAST:event_clearBtnActionPerformed

    
    /**
     *  back button
     * @param evt 
     */
    private void backToLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToLoginBtnActionPerformed
     
        CustomerHome home = new CustomerHome(customer);
        //dispose current form//
        this.dispose();
        //sets form to visible//
        home.setVisible(true);
    }//GEN-LAST:event_backToLoginBtnActionPerformed


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
     * Message box
     * @param infoMessage
     * @param titleBar 
     */
    public static void messageBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new EditDetails().setVisible(true);
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addTitleLbl;
    private javax.swing.JButton backToLoginBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JLabel firstNameLbl;
    private javax.swing.JTextField firstNameTxtBx;
    private javax.swing.JLabel houseNumLbl;
    private javax.swing.JTextField houseNumTxtBx;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lastNameLbl;
    private javax.swing.JTextField lastNameTxtBx;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JTextField passwordTxtBx;
    private javax.swing.JLabel postcodeLbl;
    private javax.swing.JTextField postcodeTxtBx;
    private javax.swing.JTextField streetTxtBx;
    private javax.swing.JButton submitBtn;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JLabel townLbl;
    private javax.swing.JTextField townTxtBx;
    private javax.swing.JLabel userNameLbl;
    private javax.swing.JTextField userNameTxtBx;
    // End of variables declaration//GEN-END:variables
}
