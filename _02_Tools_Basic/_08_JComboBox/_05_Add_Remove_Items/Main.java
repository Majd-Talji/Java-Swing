package _02_Tools_Basic._08_JComboBox._05_Add_Remove_Items;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {

    static JFrame frame = new JFrame("JComboBox Demo");
    static JComboBox comboBox = new JComboBox();
    static JButton addButton = new JButton("Add Item");
    static JButton removeButton = new JButton("Remove Selected Item");
    static JButton removeAllButton = new JButton("Remove All Items");
    static JLabel counterLabel = new JLabel("Total items = 0");
    static JTextField textField = new JTextField();

    public static void main(String[] args) {

        textField.setBounds(40, 40, 110, 30);
        addButton.setBounds(170, 40, 120, 30);
        removeButton.setBounds(40, 80, 250, 30);
        removeAllButton.setBounds(40, 120, 250, 30);
        comboBox.setBounds(310, 40, 140, 30);
        counterLabel.setBounds(310, 80, 140, 30);

        frame.add(textField);
        frame.add(addButton);
        frame.add(removeAllButton);
        frame.add(removeButton);
        frame.add(comboBox);
        frame.add(counterLabel);

        frame.setSize(500, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!textField.getText().equals("")) {
                    comboBox.addItem(textField.getText());
                    counterLabel.setText("Total Items = " + comboBox.getItemCount());
                    textField.setText(null);
                }
            }
        });

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comboBox.getItemCount() > 0) {
                    comboBox.removeItemAt(comboBox.getSelectedIndex());
                    counterLabel.setText("Total Items = " + comboBox.getItemCount());
                }
            }
        });

        removeAllButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comboBox.removeAllItems();
                counterLabel.setText("Total Items = " + comboBox.getItemCount());
            }
        });

    }

}
