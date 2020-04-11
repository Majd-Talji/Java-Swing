package _02_Tools_Basic._06_JCheckBox._01_Object_JCheckBox;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("JCheckBox demo");
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        JCheckBox checkBox = new JCheckBox("Check Box", true);
        checkBox.setBounds(40, 40, 100, 30);
        
        frame.add(checkBox);
        
        frame.setVisible(true);
        
    }
    
}
