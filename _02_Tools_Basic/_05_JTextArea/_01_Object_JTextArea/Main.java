package _02_Tools_Basic._05_JTextArea._01_Object_JTextArea;

import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("JTextArea demo");
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        JTextArea textArea = new JTextArea();
        textArea.setBounds(40, 40, 200, 100);
        
        frame.add(textArea);
        
        frame.setVisible(true);
        
    }
    
}
