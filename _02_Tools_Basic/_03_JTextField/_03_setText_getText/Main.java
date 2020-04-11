package _02_Tools_Basic._03_JTextField._03_setText_getText;

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
    
    static JFrame frame = new  JFrame("JTextField demo");
    static JTextField textField = new JTextField();
    static JLabel label = new JLabel("Enter any thing");
    static JLabel labelResult = new JLabel();
    static JButton button = new JButton("Get text");
    
    public static void main(String[] args) {
        
        label.setBounds(40, 40, 100, 30);
        textField.setBounds(150, 40, 150, 30);
        button.setBounds(40, 120, 80, 30);
        labelResult.setBounds(150, 120, 150, 30);
        
        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.add(labelResult);
        
        frame.setSize(360, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelResult.setText(textField.getText());
            }
        });
        
    }
    
}
