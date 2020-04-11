package _02_Tools_Basic._03_JTextField._04_Sum_Numbers;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {

    static JLabel label_plus = new JLabel("+");
    static JLabel label_result = new JLabel();
    static JFrame frame = new JFrame("JTextField demo");
    static JTextField textField_1 = new JTextField();
    static JTextField textField_2 = new JTextField();
    static JButton button = new JButton("=");

    public static void main(String[] args) {

        label_plus.setBounds(135, 40, 50, 30);
        label_result.setBounds(340, 40, 80, 30);
        textField_1.setBounds(40, 40, 80, 30);
        textField_2.setBounds(160, 40, 80, 30);
        button.setBounds(270, 40, 50, 30);
        
        frame.add(label_plus);
        frame.add(label_result);
        frame.add(textField_1);
        frame.add(textField_2);
        frame.add(button);
        
        frame.setSize(500, 140);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num_1 = Double.valueOf(textField_1.getText());
                    double num_2 = Double.valueOf(textField_2.getText());
                    
                    label_result.setForeground(Color.black);
                    label_result.setText("" + (num_1 + num_2));
                } catch (Exception ex) {
                    label_result.setForeground(Color.red);
                    label_result.setText("Input Error");
                }
            }
        });

    }

}
