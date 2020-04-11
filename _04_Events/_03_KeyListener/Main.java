package _04_Events._03_KeyListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("KeyListener Demo");
        JTextField textField = new JTextField();
        JLabel label = new JLabel("Enter any thing");
        JLabel labelResult = new JLabel();
        JButton button = new JButton("Get text");

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

        textField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    labelResult.setText(textField.getText());
                    System.out.println("KeyListener");
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });

    }

}
