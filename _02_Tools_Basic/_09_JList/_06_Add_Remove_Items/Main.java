package _02_Tools_Basic._09_JList._06_Add_Remove_Items;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {

    static JFrame frame = new JFrame("JList Demo");
    static DefaultListModel model = new DefaultListModel();
    static JList list = new JList(model);
    static JLabel label = new JLabel("Enter Item");
    static JScrollPane listScrollPane = new JScrollPane(list);
    static JTextField textField = new JTextField();
    static JButton addButton = new JButton("Add Item");
    static JButton removeButton = new JButton("Remove");
    static JButton removeAllButton = new JButton("Remove All");
    static JLabel totalLabel = new JLabel("Total Items: 0");
    static int itemsNumber = 0;

    public static void main(String[] args) {

        label.setBounds(20, 80, 70, 30);
        textField.setBounds(100, 80, 100, 30);
        listScrollPane.setBounds(350, 40, 150, 180);
        addButton.setBounds(220, 80, 100, 30);
        removeButton.setBounds(220, 120, 100, 30);
        removeAllButton.setBounds(220, 160, 100, 30);
        totalLabel.setBounds(350, 230, 100, 30);

        frame.add(label);
        frame.add(textField);
        frame.add(listScrollPane);
        frame.add(addButton);
        frame.add(removeButton);
        frame.add(removeAllButton);
        frame.add(totalLabel);

        frame.setSize(550, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!textField.getText().equals("")) {
                    model.addElement(textField.getText());
                    itemsNumber++;
                    totalLabel.setText("Total Items: " + itemsNumber); // model.getSize() = itemsNumber
                    textField.setText(null);
                }
            }
        });

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (list.getSelectedIndex() != -1) {

                    int[] selectedIndices = list.getSelectedIndices();

                    for (int i = selectedIndices.length - 1; i >= 0; i--) {
                        model.removeElementAt(selectedIndices[i]);
                        itemsNumber--; // model.getSize()
                    }

                    totalLabel.setText("Total Items: " + itemsNumber); // model.getSize() = itemsNumber

                }

            }
        });

        removeAllButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                model.removeAllElements();
                itemsNumber = 0;
                totalLabel.setText("Total Items: " + itemsNumber); // model.getSize() = itemsNumber

            }
        });

    }

}
