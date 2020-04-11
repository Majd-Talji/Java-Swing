package _02_Tools_Basic._14_JProgressBar._04_Password_Strength;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("JProgressBar Demo");

        JLabel label_1 = new JLabel("Password");
        JLabel label_2 = new JLabel("Strength");
        JPasswordField password = new JPasswordField();
        JProgressBar progress = new JProgressBar(0, 10);

        label_1.setBounds(20, 20, 60, 30);
        password.setBounds(90, 20, 140, 30);
        label_2.setBounds(20, 60, 60, 30);
        progress.setBounds(90, 68, 140, 15);

        frame.add(label_1);
        frame.add(password);
        frame.add(label_2);
        frame.add(progress);

        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

        password.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {

                int passLength = password.getPassword().length;
                progress.setValue(passLength);

                if (passLength < 5) {

                    progress.setForeground(Color.red);

                } else if (passLength >= 5 && passLength < 10) {

                    progress.setForeground(Color.yellow);

                } else if (passLength >= 10) {

                    progress.setForeground(Color.green);

                }

            }
        });

    }

}
