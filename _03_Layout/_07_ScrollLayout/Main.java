package _03_Layout._07_ScrollLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Scroll Layout Demo");
        
        JLabel label = new JLabel();
        
        label.setIcon(new ImageIcon(Main.class.getResource("white-cat.png")));
        
        JScrollPane scrollPane = new JScrollPane(label);
        
        frame.add(scrollPane);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        
    }
    
}
