package _02_Tools_Basic._06_JCheckBox._03_Selected;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {

    static JFrame frame = new JFrame("JCheckBox Demo");
    static JCheckBox checkBox = new JCheckBox("Check Box");
    static JLabel label = new JLabel();

    public static void main(String[] args) {

        checkBox.setBounds(40, 40, 100, 30);

        label.setBounds(40, 70, 200, 30);
        label.setText("Check Box is not checked");

        frame.add(checkBox);
        frame.add(label);

        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

        checkBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (checkBox.isSelected()) {
                    label.setText("Check Box is checked");
                } else {
                    label.setText("Check Box is not checked");
                }
            }
        });

    }

}
