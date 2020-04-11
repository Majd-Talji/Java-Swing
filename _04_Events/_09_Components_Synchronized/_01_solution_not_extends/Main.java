package _04_Events._09_Components_Synchronized._01_solution_not_extends;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    private static void createAndShowGUI() {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300, 200);
        f.setLayout(new FlowLayout());
        
        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        
        f.add(b1);
        f.add(b2);
        
        f.setVisible(true);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }
    
}
