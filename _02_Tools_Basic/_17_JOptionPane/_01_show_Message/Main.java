package _02_Tools_Basic._17_JOptionPane._01_show_Message;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("JOptionPane Demo");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JButton btn1 = new JButton("Display Plain Dialog");
        JButton btn2 = new JButton("Display Information Dialog");
        JButton btn3 = new JButton("Display Warning Dialog");
        JButton btn4 = new JButton("Display Error Dialog");
        JButton btn5 = new JButton("Display Question Dialog");

        btn1.setBounds(95, 10, 200, 30);
        btn2.setBounds(95, 50, 200, 30);
        btn3.setBounds(95, 90, 200, 30);
        btn4.setBounds(95, 130, 200, 30);
        btn5.setBounds(95, 170, 200, 30);

        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);
        frame.add(btn5);

        frame.setVisible(true);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(frame, "This is a plain message", "Plain Message", JOptionPane.PLAIN_MESSAGE);

            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(frame, "This is an information message", "Information Message", JOptionPane.INFORMATION_MESSAGE);

            }
        });

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(frame, "This is waring message", "Waring Message", JOptionPane.WARNING_MESSAGE);

            }
        });

        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(frame, "This is an error message", "Error Message", JOptionPane.ERROR_MESSAGE);

            }
        });

        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(frame, "This is a question message", "Quesition Message", JOptionPane.QUESTION_MESSAGE);

            }
        });

    }

}
