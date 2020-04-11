package _02_Tools_Basic._02_JButton._03_ImageIcon_Bounds;

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("JButton demo");
        
        JButton button_1 = new JButton("Start", new ImageIcon(Main.class.getResource("start-26.png")));
        
        JButton button_2 = new JButton(new ImageIcon(Main.class.getResource("settings-64.png")));
     
        button_1.setBounds(45, 30, 160, 50);
        
        button_2.setBounds(45, 100, 160, 50);
        
        frame.add(button_1);
        frame.add(button_2);
        
        frame.setSize(270, 215);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setLayout(null);
        
        frame.setVisible(true);
        
    }
    
}
