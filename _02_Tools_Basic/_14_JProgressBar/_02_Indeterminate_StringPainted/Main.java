package _02_Tools_Basic._14_JProgressBar._02_Indeterminate_StringPainted;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

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
        
        JProgressBar pb = new JProgressBar();
        pb.setString("Please Wait");
        pb.setIndeterminate(true);
        pb.setStringPainted(true);
        pb.setBorderPainted(false);
        pb.setBounds(70, 40, 140, 30);
        
        frame.add(pb);
        frame.setVisible(true);        
        
    }
    
}
