package _02_Tools_Basic._14_JProgressBar._03_Increment_Value_Thread;

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

        JProgressBar pb = new JProgressBar(0, 1000);
        pb.setStringPainted(true);
        pb.setBounds(70, 40, 140, 30);

        frame.add(pb);
        frame.setVisible(true);
        frame.setEnabled(false);
        
        int currentValue = pb.getValue();
        
        while (currentValue < pb.getMaximum()) {   
            
            try {
                
                Thread.sleep(100);
                
            } catch (Exception e) {
            }
            
            currentValue += 10;
            pb.setValue(currentValue);
            
        }

        frame.setEnabled(true);

    }

}
