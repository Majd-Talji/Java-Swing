package _02_Tools_Basic._12_JTable._02_Add_Remove_Item;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {

    static JFrame frame = new JFrame("JTable Demo");
    static JLabel label_1 = new JLabel("ID");
    static JLabel label_2 = new JLabel("Name");
    static JLabel label_3 = new JLabel("Phone");
    static JTextField textField_1 = new JTextField();
    static JTextField textField_2 = new JTextField();
    static JTextField textField_3 = new JTextField();
    static JButton btn_add = new JButton("Add");
    static JButton btn_clear = new JButton("Clear");
    static JButton btn_delete = new JButton("Delete Selected");
    static JButton btn_deleteAll = new JButton("Delete All");
    static DefaultTableModel model = new DefaultTableModel();
    static JTable table = new JTable(model);
    static JScrollPane tableScrollPane = new JScrollPane(table);

    public static void main(String[] args) {

        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("Phone");

        label_1.setBounds(40, 50, 50, 20);
        label_2.setBounds(40, 90, 50, 20);
        label_3.setBounds(40, 130, 50, 20);
        textField_1.setBounds(100, 50, 120, 20);
        textField_2.setBounds(100, 90, 120, 20);
        textField_3.setBounds(100, 130, 120, 20);
        btn_add.setBounds(150, 180, 70, 30);
        btn_clear.setBounds(70, 180, 70, 30);
        btn_delete.setBounds(315, 250, 140, 30);
        btn_deleteAll.setBounds(470, 250, 140, 30);
        tableScrollPane.setBounds(280, 50, 370, 160);

        frame.add(label_1);
        frame.add(label_2);
        frame.add(label_3);
        frame.add(textField_1);
        frame.add(textField_2);
        frame.add(textField_3);
        frame.add(btn_add);
        frame.add(btn_clear);
        frame.add(btn_delete);
        frame.add(btn_deleteAll);
        frame.add(tableScrollPane);

        frame.setSize(750, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

        btn_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if (!textField_1.getText().equals("") && !textField_2.getText().equals("") && !textField_2.getText().equals("")) {
                    
                    String id = textField_1.getText();
                    String name = textField_2.getText();
                    String phone = textField_3.getText();
                    
                    String[] userInfo = {id, name, phone};
                    model.addRow(userInfo);

                }
                
            }
        });

        btn_clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textField_1.setText(null);
                textField_2.setText(null);
                textField_3.setText(null);

            }
        });

        btn_delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if (table.getSelectedRowCount() > 0) {
                    
                    int[] selectedIndices = table.getSelectedRows();
                    
                    for (int i = selectedIndices.length - 1; i >= 0 ; i--) {
                        model.removeRow(selectedIndices[i]);
                    }
                    
                }
                
            }
        });

        btn_deleteAll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                model.setRowCount(0);
                
            }
        });

    }

}
