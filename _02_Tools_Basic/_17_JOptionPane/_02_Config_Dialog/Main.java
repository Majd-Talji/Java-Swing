package _02_Tools_Basic._17_JOptionPane._02_Config_Dialog;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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

        JButton btn1 = new JButton("Delete your history");
        JButton btn2 = new JButton("Do you like programming");
        JButton btn3 = new JButton("Exit");
        JLabel label = new JLabel("Here we display user interactions");

        btn1.setBounds(95, 20, 200, 30);
        btn2.setBounds(95, 60, 200, 30);
        btn3.setBounds(95, 100, 200, 30);
        label.setBounds(95, 150, 200, 30);

        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(label);

        frame.setVisible(true);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int result = JOptionPane.showConfirmDialog(frame,
                        "You are going to delete you history.\nAre you sure?",
                        "Delete History",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.WARNING_MESSAGE);

                switch (result) {
                    case JOptionPane.YES_OPTION:
                        label.setText("User click: Yes");
                        break;
                    case JOptionPane.NO_OPTION:
                        label.setText("User click: No");
                        break;
                    case JOptionPane.CANCEL_OPTION:
                        label.setText("User click: Cancel");
                        break;
                    case JOptionPane.CLOSED_OPTION:
                        label.setText("User click: Close");
                        break;
                }

            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int result = JOptionPane.showConfirmDialog(frame, "Do you like programming?", "Quesition", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                switch (result) {
                    case JOptionPane.YES_OPTION:
                        label.setText("User click: Yes");
                        break;
                    case JOptionPane.NO_OPTION:
                        label.setText("User click: No");
                        break;
                    case JOptionPane.CLOSED_OPTION:
                        label.setText("User click: Close");
                        break;
                }
                
            }
        });

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int result = JOptionPane.showConfirmDialog(frame, "Close The program now?", "Warning", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);

                switch (result) {
                    case JOptionPane.OK_OPTION:
                        System.exit(0);
                        break;
                    case JOptionPane.CANCEL_OPTION:
                        label.setText("User click: Cancel");
                        break;
                    case JOptionPane.CLOSED_OPTION:
                        label.setText("User click: Close");
                        break;
                }
                
            }
        });

    }

}
