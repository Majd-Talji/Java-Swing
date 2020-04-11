package _02_Tools_Basic._07_JRadioButton._01_Object_JRadioButton;

import javax.swing.JFrame;
import javax.swing.JRadioButton;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("JRadioButton demo");
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        JRadioButton radioButton = new JRadioButton("Radio Button", true);
        
        radioButton.setBounds(40, 40, 100, 30);
        
        frame.add(radioButton);
        
        frame.setVisible(true);
        
    }
    
}
