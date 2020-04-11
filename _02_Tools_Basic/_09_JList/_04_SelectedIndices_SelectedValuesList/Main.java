package _02_Tools_Basic._09_JList._04_SelectedIndices_SelectedValuesList;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {

    static JFrame frame = new JFrame("JList Demo");
    static DefaultListModel model = new DefaultListModel();
    static JList list = new JList(model);
    static JScrollPane listScrollPane = new JScrollPane(list);
    static JButton viewSelected = new JButton("View Selected");
    static JLabel totalSelected = new JLabel();
    static JLabel selectedItems = new JLabel();

    public static void main(String[] args) {

        listScrollPane.setBounds(20, 40, 100, 230);
        viewSelected.setBounds(140, 40, 150, 30);
        totalSelected.setBounds(140, 80, 340, 30);
        selectedItems.setBounds(140, 120, 340, 30);

        model.addElement("Red");
        model.addElement("Blue");
        model.addElement("Green");
        model.addElement("Yellow");
        model.addElement("Orage");
        model.addElement("Brown");
        model.addElement("Pink");
        model.addElement("Purple");
        model.addElement("Gray");
        model.addElement("Black");
        model.addElement("White");

        frame.add(listScrollPane);
        frame.add(viewSelected);
        frame.add(totalSelected);
        frame.add(selectedItems);

        frame.setSize(550, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

        viewSelected.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                totalSelected.setText("Total Selected: " + list.getSelectedIndices().length);
                selectedItems.setText("Selected Items: " + list.getSelectedValuesList());
            }
        });

    }

}
