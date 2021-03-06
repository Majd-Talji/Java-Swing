package _02_Tools_Basic._10_JSpinner._02_Event_Change_Value;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    static JFrame frame = new JFrame("JSpinner Demo");
    static JSpinner spinner = new JSpinner();
    static JLabel label = new JLabel("Value: 0");
    
    public static void main(String[] args) {
        
        spinner.setBounds(100, 40, 100, 30);
        label.setBounds(100, 80, 100, 30);
        
        frame.add(spinner);
        frame.add(label);
        
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        
        spinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                label.setText("Value: " + spinner.getValue());
            }
        });
        
    }
    
}
