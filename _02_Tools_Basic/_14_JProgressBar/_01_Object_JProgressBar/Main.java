package _02_Tools_Basic._14_JProgressBar._01_Object_JProgressBar;

import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("JProgressBar Demo");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        JProgressBar pd = new JProgressBar(0, 1000);
        pd.setValue(250);
        pd.setStringPainted(true);
        pd.setBounds(70, 40, 140, 30);
        
        frame.add(pd);
        frame.setVisible(true);
        
    }
    
}
