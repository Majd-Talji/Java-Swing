package _02_Tools_Basic._03_JTextField._01_Object_JTextField;

import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("JTextField demo");
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        JTextField textField = new JTextField("Enter any thing");
        textField.setBounds(40, 40, 200, 30);
        
        frame.add(textField);
        
        frame.setVisible(true);
        
    }
    
}
