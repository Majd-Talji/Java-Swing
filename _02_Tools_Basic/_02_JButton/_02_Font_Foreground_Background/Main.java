package _02_Tools_Basic._02_JButton._02_Font_Foreground_Background;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("JButton demo");
        
        JButton button_1 = new JButton("Button 1");
        JButton button_2 = new JButton("Button 2");
        JButton button_3 = new JButton("Button 3");
        
        Font newFont = new Font("Arial", Font.BOLD, 16);
        
        button_1.setFont(newFont);
        button_1.setForeground(Color.cyan);
        button_1.setBackground(Color.darkGray);
        
        button_2.setFont(newFont);
        button_2.setForeground(Color.red);
        button_2.setBackground(Color.darkGray);
        
        button_3.setFont(newFont);
        button_3.setForeground(Color.orange);
        button_3.setBackground(Color.darkGray);
        
        frame.add(button_1);
        frame.add(button_2);
        frame.add(button_3);
        
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        
    }
    
}
