package _02_Tools_Basic._04_JPasswordField._01_Object_JPasswordField;

import javax.swing.JFrame;
import javax.swing.JPasswordField;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("JPasswordField demo");
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(40, 40, 200, 30);
        
        frame.add(passwordField);
        
        frame.setVisible(true);
        
    }
    
}
