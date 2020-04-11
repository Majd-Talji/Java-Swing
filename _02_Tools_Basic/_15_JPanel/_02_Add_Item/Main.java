package _02_Tools_Basic._15_JPanel._02_Add_Item;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("JPanel Demo");
        frame.setSize(300, 240);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(Color.gray);
        panel.setBounds(50, 50, 180, 110);

        frame.add(panel);

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");

        button1.setBackground(Color.orange);
        button2.setBackground(Color.yellow);
        button3.setBackground(Color.green);
        button4.setBackground(Color.pink);

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);

        frame.setVisible(true);

    }

}
