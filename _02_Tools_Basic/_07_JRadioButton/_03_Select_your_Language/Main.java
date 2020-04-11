package _02_Tools_Basic._07_JRadioButton._03_Select_your_Language;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    static JFrame frame = new JFrame("JRadioButton Demo");
    static JLabel label = new JLabel("Select your language");
    static JRadioButton radioButton_1 = new JRadioButton("Arabic", true);
    static JRadioButton radioButton_2 = new JRadioButton("Englich");
    static JRadioButton radioButton_3 = new JRadioButton("German");
    static JLabel labelResult = new JLabel();
    static JButton button = new JButton("View selected choice");
    
    public static void main(String[] args) {
        
        ButtonGroup group = new ButtonGroup();
        group.add(radioButton_1);
        group.add(radioButton_2);
        group.add(radioButton_3);
        
        label.setBounds(40, 10, 150, 30);
        radioButton_1.setBounds(40, 40, 100, 30);
        radioButton_2.setBounds(40, 70, 100, 30);
        radioButton_3.setBounds(40, 100, 100, 30);
        button.setBounds(40, 150, 170, 30);
        labelResult.setBounds(40, 190, 180, 30);
        
        frame.add(label);
        frame.add(radioButton_1);
        frame.add(radioButton_2);
        frame.add(radioButton_3);
        frame.add(button);
        frame.add(labelResult);
        
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (radioButton_1.isSelected()) {
                    labelResult.setText("You language is: " + radioButton_1.getText());
                } else if (radioButton_2.isSelected()) {
                    labelResult.setText("You language is: " + radioButton_2.getText());
                } else if (radioButton_3.isSelected()) {
                    labelResult.setText("You language is: " + radioButton_3.getText());
                }
            }
        });
        
    }
    
}
