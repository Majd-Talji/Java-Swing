package _02_Tools_Basic._02_JButton._04_Click_Button;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {

    static JFrame frame = new JFrame("JButton demo");
    static JButton plus_button = new JButton("+1");
    static JButton minus_button = new JButton("-1");
    static JLabel label = new JLabel("0");

    static int counter = 0;

    public static void main(String[] args) {

        plus_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("" + (++counter));
            }
        });
        
        minus_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("" + (--counter));
            }
        });
        
        frame.add(minus_button);
        frame.add(label);
        frame.add(plus_button);
        
        frame.setSize(300, 80);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);

    }

}
