package _02_Tools_Basic._08_JComboBox._02_Items_In_JComboBox;

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

        String[] items = {"Java", "PHP", "C", "C++", "HTML"};
        
        JComboBox comboBox = new JComboBox(items);
        comboBox.setBounds(90, 40, 100, 30);
        
        frame.add(comboBox);

        frame.setVisible(true);

    }

}
