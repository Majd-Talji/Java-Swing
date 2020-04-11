package _04_Events._06_FocusListener;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("FocusListener Demo");
        JLabel nameLabel = new JLabel("Name");
        JLabel passLabel = new JLabel("Password");
        JTextField nameField = new JTextField();
        JPasswordField passField = new JPasswordField();

        nameLabel.setBounds(30, 50, 60, 25);
        nameField.setBounds(100, 50, 150, 25);
        passLabel.setBounds(30, 90, 60, 25);
        passField.setBounds(100, 90, 150, 25);

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(passField);
        frame.add(passLabel);

        FocusListener f1 = new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                e.getComponent().setBackground(Color.yellow);
            }

            @Override
            public void focusLost(FocusEvent e) {
                e.getComponent().setBackground(Color.white);
            }
        };

        nameField.addFocusListener(f1);
        passField.addFocusListener(f1);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

    }

}
