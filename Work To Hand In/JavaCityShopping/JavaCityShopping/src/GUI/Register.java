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
 * =
 * @author Jordan Porter
 * Class for registering a customer//
 */
public class Register extends javax.swing.JFrame {

   
 
    
    /**
     * Creates  Register by initialising components //
     */
    public Register() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLbl = new javax.swing.JLabel();
        userNameLbl = new javax.swing.JLabel();
        userNameTxtBx = new javax.swing.JTextField();
        passwordLbl = new javax.swing.JLabel();
        passwordTxtBx = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        firstNameTxtBx = new javax.swing.JTextField();
        lastNameLbl = new javax.swing.JLabel();
        lastNameTxtBx = new javax.swing.JTextField();
        addTitleLbl = new javax.swing.JLabel();
        houseNumLbl = new javax.swing.JLabel();
        houseNumTxtBx = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        streetTxtBx = new javax.swing.JTextField();
        townLbl = new javax.swing.JLabel();
        townTxtBx = new javax.swing.JTextField();
        postcodeLbl = new javax.swing.JLabel();
        postcodeTxtBx = new javax.swing.JTextField();
        submitBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        backToLoginBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 600));

        titleLbl.setText("Register New Customer");

        userNameLbl.setText("USERNAME:");

        passwordLbl.setText("PASSWORD:");

        jLabel1.setText("FIRST NAME:");

        lastNameLbl.setText("LAST NAME:");

        addTitleLbl.setText("ADDRESS");

        houseNumLbl.setText("House/Flat Number:");

        jLabel2.setText("Street:");

        townLbl.setText("Town:");

        postcodeLbl.setText("Postcode:");

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

        backToLoginBtn.setText("RETURN TO CUSTOMER LOGIN");
        backToLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToLoginBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(titleLbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(passwordLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(passwordTxtBx))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(userNameLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(userNameTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(lastNameLbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(postcodeTxtBx)
                                    .addComponent(townTxtBx)
                                    .addComponent(streetTxtBx)
                                    .addComponent(houseNumTxtBx)
                                    .addComponent(firstNameTxtBx)
                                    .addComponent(lastNameTxtBx)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(houseNumLbl)
                            .addComponent(townLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(postcodeLbl)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(addTitleLbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(submitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clearBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(backToLoginBtn)))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLbl)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userNameLbl)
                    .addComponent(userNameTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLbl)
                    .addComponent(passwordTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(firstNameTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameLbl)
                    .addComponent(lastNameTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(28, 28, 28)
                .addComponent(submitBtn)
                .addGap(18, 18, 18)
                .addComponent(clearBtn)
                .addGap(18, 18, 18)
                .addComponent(backToLoginBtn)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    /**
       //submit button//
     * @param evt 
     */
    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        
        Customer newCustomer;
        //creates new Db//
        DbManager db = new DbManager();
        
        if(validateLength(0,30,userNameTxtBx.getText()) == false  || validateLength(5,20,passwordTxtBx.getText()) == false || validateLength(0,20,firstNameTxtBx.getText()) == false || validateLength(0,20,lastNameTxtBx.getText()) == false || validateLength(0,50,houseNumTxtBx.getText()) == false || validateLength(0,50,streetTxtBx.getText()) == false || validateLength(0,20,townTxtBx.getText()) == false || validateLength(0,10,postcodeTxtBx.getText()) == false)
        {
            //error pop up messge displayed
            messageBox("Please ensure that the following collumns do not excede the maximum number of characters\nFirst Name max: 20\nLast Name max: 20\nHouse/Flat Number max: 50\nStreet max: 50\nTown max: 20\nPostcode max: 10\n\nYour Password should be between 5 and 20 characters","INPUT ERROR");
        }
        //if all feilds meet required length
        else
        {
            //if the username is not already taken
            if(db.findCustomer(userNameTxtBx.getText())== null)
            {
                // create new customer // 
                newCustomer = new Customer(db.getNextUserID(), userNameTxtBx.getText().toLowerCase(), passwordTxtBx.getText(), firstNameTxtBx.getText(), lastNameTxtBx.getText(), houseNumTxtBx.getText(), streetTxtBx.getText(), townTxtBx.getText(), postcodeTxtBx.getText(), true);
                //calls save method to add customer to database
                db.saveCustomer(newCustomer);
                //cofirmation displayed
                titleLbl.setText("Registered");
            }
            //if username has been taken //
            else
            {
                //error message displayed
                titleLbl.setText("username already taken!");
            }
        }
    }//GEN-LAST:event_submitBtnActionPerformed

   
    
    
    
    /**
     * Clears all input fields
     * @param evt 
     */
    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        titleLbl.setText("Register New Customer");
        userNameTxtBx.setText("");
        passwordTxtBx.setText("");
        firstNameTxtBx.setText("");
        lastNameTxtBx.setText("");
        houseNumTxtBx.setText("");
        streetTxtBx.setText("");
        townTxtBx.setText("");
        postcodeTxtBx.setText("");
    }//GEN-LAST:event_clearBtnActionPerformed

    
    
    
    
    /**
     * Back Button
     * @param evt 
     */
    private void backToLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToLoginBtnActionPerformed
       
            //creates new login form//
            CustomerLogin login = new CustomerLogin();
            //dispose existing form//
            this.dispose();
            //set form to visible//
            login.setVisible(true);
            
      
    }//GEN-LAST:event_backToLoginBtnActionPerformed

    
    
    
    /**
     * @param min
     * @param max
     * @param input 
     * @return - returns true if string is the correct length
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

    
    
    
    
    public static void messageBox(String infoMessage, String titleBar)
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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addTitleLbl;
    private javax.swing.JButton backToLoginBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JTextField firstNameTxtBx;
    private javax.swing.JLabel houseNumLbl;
    private javax.swing.JTextField houseNumTxtBx;
    private javax.swing.JLabel jLabel1;
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
