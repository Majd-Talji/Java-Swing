package _02_Tools_Basic._07_JRadioButton._02_Font_Foreground;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ButtonGroup;
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
        
        JRadioButton radioButton_1 = new JRadioButton("Red", true);
        JRadioButton radioButton_2 = new JRadioButton("Blue");
        JRadioButton radioButton_3 = new JRadioButton("Gray");
        
        ButtonGroup group = new ButtonGroup();
        group.add(radioButton_1);
        group.add(radioButton_2);
        group.add(radioButton_3);
        
        Font newFont = new Font("Arial", Font.BOLD, 16);
        
        radioButton_1.setBounds(40, 40, 100, 30);
        radioButton_1.setFont(newFont);
        radioButton_1.setForeground(Color.red);
        
        radioButton_2.setBounds(40, 70, 100, 30);
        radioButton_2.setFont(newFont);
        radioButton_2.setForeground(Color.blue);
        
        radioButton_3.setBounds(40, 100, 100, 30);
        radioButton_3.setFont(newFont);
        radioButton_3.setForeground(Color.gray);
        
        frame.add(radioButton_1);
        frame.add(radioButton_2);
        frame.add(radioButton_3);
        
        frame.setVisible(true);
        
    }
    
}
