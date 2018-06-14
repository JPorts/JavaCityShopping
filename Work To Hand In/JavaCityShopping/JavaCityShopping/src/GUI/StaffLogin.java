/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DataModels.Staff;
import DataModels.DbManager;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 * @author Jordan Porter
 */

public class StaffLogin extends javax.swing.JFrame {

    
    
    //global variable Storing current staff//
    Staff staff;
    
    
    /**
     * initialises components
     */
    public StaffLogin() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLbl = new javax.swing.JLabel();
        userNameLbl = new javax.swing.JLabel();
        userNameTxtBx = new javax.swing.JTextField();
        passwordLbl = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        passwordTxtBx = new javax.swing.JPasswordField();
        mainMenuBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText("STAFF LOGIN");

        userNameLbl.setText("USERNAME:");

        passwordLbl.setText("PASSWORD:");

        loginBtn.setText("LOGIN");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        mainMenuBtn.setText("RETURN TO MAIN MENU");
        mainMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenuBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(loginBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(mainMenuBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
                                .addGap(0, 96, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userNameLbl)
                            .addComponent(passwordLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordTxtBx)
                            .addComponent(userNameTxtBx))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(titleLbl)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameLbl)
                    .addComponent(userNameTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLbl)
                    .addComponent(passwordTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(loginBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mainMenuBtn)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    /**
     * Back to Main Menu 
     * @param evt 
     */
    private void mainMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuBtnActionPerformed
            //creates instance of  main menu//
            MainMenu menu = new MainMenu();
            //disposes of current form//
            this.dispose();
            //sets Menu  to visible//
            menu.setVisible(true);
    }//GEN-LAST:event_mainMenuBtnActionPerformed

    
    /**
     *  Login button
     * @param evt 
     */
    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        
        //create instance of db//
        DbManager db = new DbManager();
        
        
        //assigns the input to string //
        String inputUsername = userNameTxtBx.getText();
       
        //creates staff member instance passing user input in to db manager class
        Staff myStaff = db.findStaff(inputUsername);
        //if no staff meember returned
        if (myStaff == null)
        {
            //error message displayed
            titleLbl.setText("Username or Password incorrect!");
        }
       
        else
        {
            
            char[] passwordInput = passwordTxtBx.getPassword();
            
            char[] validPassword = myStaff.getPassword().toCharArray();
            
            boolean correctPass = Arrays.equals(passwordInput, validPassword);

            
            //if password matches//
            if (correctPass)
            {
                   //assign staff member to global staff//
                    staff = myStaff;
                    
                    //show dialog box message// 
                    messageBox("You are now logged in", "LOGGED IN");
                    
                    //create instance of staff home form with current staff member//
                    StaffHome home = new StaffHome(staff);
                    
                    this.dispose();
                   
                    home.setVisible(true);

            }
            
           
            else
            {
                //error message displayed//
                titleLbl.setText("Username or Password incorrect!");
            }
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    
    
    
    
    
    /**
     * Message Box Method
     * @param infoMessage 
     * @param titleBar 
     */   
    public static void messageBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "Message Box: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
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
            java.util.logging.Logger.getLogger(StaffLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton loginBtn;
    private javax.swing.JButton mainMenuBtn;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JPasswordField passwordTxtBx;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JLabel userNameLbl;
    private javax.swing.JTextField userNameTxtBx;
    // End of variables declaration//GEN-END:variables
}
