package _02_Tools_Basic._08_JComboBox._04_Selected_Item;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {

    static JFrame frame = new JFrame("JComboBox Demo");
    static String[] items = {"Java", "PHP", "C", "C++", "HTML"};
    static JComboBox comboBox = new JComboBox(items);
    static JButton button = new JButton("View Selected Item");
    static JLabel label = new JLabel();

    public static void main(String[] args) {
        
        comboBox.setBounds(40, 40, 100, 30);
        button.setBounds(160, 40, 150, 30);
        label.setBounds(40, 80, 200, 30);
        
        frame.add(comboBox);
        frame.add(button);
        frame.add(label);
        
        frame.setSize(360, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("You select: " + comboBox.getSelectedItem());
            }
        });

    }

}
