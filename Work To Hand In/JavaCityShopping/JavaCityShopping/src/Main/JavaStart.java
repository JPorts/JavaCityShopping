/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import GUI.*;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


/**
 *
 * @author JP
 */
public class JavaStart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            // select Look and Feel for the application theme // 
            UIManager.setLookAndFeel("com.jtattoo.plaf.fast.FastLookAndFeel");
            
        }
        catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
        }

        MainMenu menu = new MainMenu();
        menu.setVisible(true);
    }
    
}
