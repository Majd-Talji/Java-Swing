package _02_Tools_Basic._10_JSpinner._05_Time_Spinner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    static JFrame frame = new JFrame("JSpinner Demo");
    static JLabel label = new JLabel("Enter Time: ");
    static JSpinner hours = new JSpinner(new SpinnerNumberModel(1, 1, 12, 1));
    static SpinnerNumberModel model = new SpinnerNumberModel(0, 0, 59, 1);
    static JSpinner minutes = new JSpinner(new SpinnerNumberModel(0, 0, 59, 1));
    static JSpinner seconds = new JSpinner(new SpinnerNumberModel(0, 0, 59, 1));
    static JSpinner amOrPm = new JSpinner(new SpinnerListModel(new String[]{"AM", "PM"}));
    static JButton btn = new JButton("Display Time");
    static JLabel enteredTime = new JLabel();
    
    public static void main(String[] args) {
        
        label.setBounds(40, 40, 100, 22);
        hours.setBounds(130, 40, 36, 22);
        minutes.setBounds(180, 40, 36, 22);
        seconds.setBounds(230, 40, 36, 22);
        amOrPm.setBounds(280, 40, 36, 22);
        btn.setBounds(40, 100, 110, 30);
        enteredTime.setBounds(170, 100, 200, 30);
        
        frame.add(label);
        frame.add(hours);
        frame.add(minutes);
        frame.add(seconds);
        frame.add(amOrPm);
        frame.add(btn);
        frame.add(enteredTime);
        
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enteredTime.setText(hours.getValue() + ":" + minutes.getValue() + ":" + seconds.getValue() + " " + amOrPm.getValue());
            }
        });
        
    }
    
}
