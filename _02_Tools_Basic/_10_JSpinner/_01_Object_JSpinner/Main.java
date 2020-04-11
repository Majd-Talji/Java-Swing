package _02_Tools_Basic._10_JSpinner._01_Object_JSpinner;

import javax.swing.JFrame;
import javax.swing.JSpinner;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("JSpinner Demo");
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        JSpinner spinner = new JSpinner();
        spinner.setBounds(100, 40, 100, 35);
        
        frame.add(spinner);
        
        frame.setVisible(true);
        
    }
    
}
