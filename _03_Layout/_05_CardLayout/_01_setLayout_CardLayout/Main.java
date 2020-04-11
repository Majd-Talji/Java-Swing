package _03_Layout._05_CardLayout._01_setLayout_CardLayout;

import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("CardLayout Demo");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new CardLayout(20, 20));

        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);

        frame.setVisible(true);

    }

}
