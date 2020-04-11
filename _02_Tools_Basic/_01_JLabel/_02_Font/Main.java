package _02_Tools_Basic._01_JLabel._02_Font;

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
        
        Font newFont = new Font("Serif", Font.BOLD, 25);
        
        JLabel label = new JLabel("Welcome to Swing");
        label.setFont(newFont);
        
        frame.add(label);
        
        frame.setVisible(true);
        
    }
    
}
