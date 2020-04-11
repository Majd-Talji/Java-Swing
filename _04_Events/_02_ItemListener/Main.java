package _04_Events._02_ItemListener;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("ItemListener Demo");
        JCheckBox checkBox = new JCheckBox("Click Me");
        JLabel label = new JLabel("Check Box");
        
        checkBox.setBounds(90, 40, 100, 30);
        
        label.setBounds(40, 70, 200, 30);
        label.setText("Check Box is not checked");

        frame.add(checkBox);
        frame.add(label);
        
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        
        checkBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (checkBox.isSelected()) {
                    label.setText("Check Box is checked");
                } else {
                    label.setText("Check Box is not checked");
                }
            }
        });
        
    }
    
}
