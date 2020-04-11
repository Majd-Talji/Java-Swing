package _02_Tools_Basic._08_JComboBox._03_Font_Foreground;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("JComboBox Demo");
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        String[] items = {"Java", "PHP", "C", "C++", "HTML"};
        
        JComboBox comboBox = new JComboBox(items);
        comboBox.setBounds(90, 40, 100, 30);
        
        Font newFont = new Font("Arial", Font.BOLD, 16);
        
        comboBox.setFont(newFont);
        comboBox.setForeground(Color.cyan);
        comboBox.setBackground(Color.gray);
        
        frame.add(comboBox);
        
        frame.setVisible(true);
        
    }
    
}
