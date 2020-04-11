package _02_Tools_Basic._05_JTextArea._02_Font_Foreground;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("JTextArea demo");
        
        JTextArea textArea = new JTextArea();
        
        Font newFont = new Font("Arial", Font.BOLD, 16);
        
        textArea.setBounds(40, 40, 200, 100);
        textArea.setFont(newFont);
        textArea.setForeground(Color.blue);
        textArea.setText("Blue\nText\nArea");
        
        frame.add(textArea);
        
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        
    }
    
}
