package _02_Tools_Basic._03_JTextField._02_Font_Foreground;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("JTextField demo");
        
        JTextField textField_1 = new JTextField("Red Text");
        JTextField textField_2 = new JTextField("Blue Text");
        JTextField textField_3 = new JTextField("Gray Text");
        
        Font newFont = new Font("Arial", Font.BOLD, 16);
        
        textField_1.setBounds(40, 40, 200, 30);
        textField_2.setBounds(40, 80, 200, 30);
        textField_3.setBounds(40, 120, 200, 30);
        
        textField_1.setFont(newFont);
        textField_2.setFont(newFont);
        textField_3.setFont(newFont);
        
        textField_1.setForeground(Color.red);
        textField_2.setForeground(Color.blue);
        textField_3.setForeground(Color.gray);
        
        frame.add(textField_1);
        frame.add(textField_2);
        frame.add(textField_3);
        
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        
    }
    
}
