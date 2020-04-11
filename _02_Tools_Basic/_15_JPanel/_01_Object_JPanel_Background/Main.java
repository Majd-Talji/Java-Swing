package _02_Tools_Basic._15_JPanel._01_Object_JPanel_Background;

import java.awt.Color;
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

        frame.setVisible(true);

    }

}
