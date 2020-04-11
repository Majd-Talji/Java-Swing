package _02_Tools_Basic._06_JCheckBox._04_Show_Password;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    static JFrame frame = new JFrame("JCheckBox Demo");
    static JLabel label = new JLabel("Password");
    static JPasswordField password = new JPasswordField();
    static JCheckBox checkBox = new JCheckBox("Show Characters");
    
    public static void main(String[] args) {
        
        label.setBounds(40, 40, 100, 30);
        password.setBounds(120, 40, 130, 30);
        checkBox.setBounds(270, 40, 150, 30);
        
        password.setEchoChar('*');
        
        frame.add(label);
        frame.add(password);
        frame.add(checkBox);
        
        frame.setSize(440, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        
        checkBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (checkBox.isSelected()) {
                    password.setEchoChar('\0');
                } else {
                    password.setEchoChar('*');
                }
            }
        });
        
    }
    
}
