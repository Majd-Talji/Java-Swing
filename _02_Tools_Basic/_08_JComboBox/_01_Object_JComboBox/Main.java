package _02_Tools_Basic._08_JComboBox._01_Object_JComboBox;

import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("JComboBox Demo");
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JComboBox comboBox = new JComboBox();
        comboBox.setBounds(90, 40, 100, 30);

        frame.add(comboBox);

        frame.setVisible(true);

    }

}
