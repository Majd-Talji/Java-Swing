package _02_Tools_Basic._05_JTextArea._04_getText;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {

    static JFrame frame = new JFrame("JTextArea demo");
    static JTextArea textArea = new JTextArea();
    static JScrollPane scrollPane = new JScrollPane(textArea);
    static JLabel label = new JLabel("Enter any thing");
    static JLabel labelResult = new JLabel();
    static JButton button = new JButton("Get Text");

    public static void main(String[] args) {

        label.setBounds(40, 40, 100, 100);
        scrollPane.setBounds(150, 40, 200, 100);
        button.setBounds(40, 160, 85, 30);
        labelResult.setBounds(40, 200, 340, 30);
        
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        
        frame.add(label);
        frame.add(scrollPane);
        frame.add(button);
        frame.add(labelResult);
        
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelResult.setText(textArea.getText());
            }
        });
        
    }

}
