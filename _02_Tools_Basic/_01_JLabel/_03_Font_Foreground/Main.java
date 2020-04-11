package _02_Tools_Basic._01_JLabel._03_Font_Foreground;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("JLabel demo");
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        
        Font newFont = new Font("Arial", Font.BOLD, 18);
        
        JLabel label_1 = new JLabel("label 1");
        label_1.setFont(newFont);
        
        JLabel label_2 = new JLabel("label 2");
        label_2.setFont(newFont);
        
        JLabel label_3 = new JLabel("label 3");
        label_3.setFont(newFont);
        
        label_1.setForeground(Color.blue);
        label_2.setForeground(Color.red);
        label_3.setForeground(Color.gray);
        
        frame.add(label_1);
        frame.add(label_2);
        frame.add(label_3);
        
        frame.setVisible(true);
        
    }
    
}
