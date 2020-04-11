package _02_Tools_Basic._12_JTable._05_Selection_Mode;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {

    static JFrame frame = new JFrame("JTable Demo");
    static DefaultTableModel model = new DefaultTableModel();
    static JTable table = new JTable(model);
    static JScrollPane tableScrollPane = new JScrollPane(table);
    static JLabel label_1 = new JLabel("Selection Mode");
    static JRadioButton radioButton_mode_1 = new JRadioButton("Multiple Selection", true);
    static JRadioButton radioButton_mode_2 = new JRadioButton("Interval Selection");
    static JRadioButton radioButton_mode_3 = new JRadioButton("Single Selection");
    static JLabel label_2 = new JLabel("Selection Option");
    static JRadioButton radioButton_option_1 = new JRadioButton("Row Selection", true);
    static JRadioButton radioButton_option_2 = new JRadioButton("Column Selection");
    static JRadioButton radioButton_option_3 = new JRadioButton("Cell Selection");

    public static void main(String[] args) {

        String columns[] = {"ID", "First Name", "Last Name", "Phone"};
        String data[][] = {
            {"1", "Majd", "Talji", "70123456"},
            {"2", "Ahmad", "Mousally", "076454532"},
            {"3", "Hala", "Hassan", "03555124"},
            {"4", "Rim", "Al Mousandes", "01321123"},
            {"5", "Said", "Al Kurdy", "07445599"},
            {"6", "Adbulah", "Saadi", "71001234"},
            {"7", "Ibrahim", "Marhaba", "04555666"},
            {"8", "Omar", "El Koussa", "0157894"},
            {"9", "Riad", "Asaad", "76887123"},
            {"10", "Rawan", "Hoblos", "01200500"},
            {"11", "Naya", "Asmar", "03654123"},
            {"12", "Mahmoud", "Mawwas", "70040300"},
            {"13", "Elena", "Shbib", "71199113"},};
        model.setDataVector(data, columns);

        ButtonGroup group_1 = new ButtonGroup();
        group_1.add(radioButton_mode_1);
        group_1.add(radioButton_mode_2);
        group_1.add(radioButton_mode_3);

        ButtonGroup group_2 = new ButtonGroup();
        group_2.add(radioButton_option_1);
        group_2.add(radioButton_option_2);
        group_2.add(radioButton_option_3);

        tableScrollPane.setBounds(0, 0, 585, 200);
        label_1.setBounds(20, 220, 150, 20);
        label_2.setBounds(220, 220, 150, 20);
        radioButton_mode_1.setBounds(20, 250, 150, 20);
        radioButton_mode_2.setBounds(20, 280, 150, 20);
        radioButton_mode_3.setBounds(20, 310, 150, 20);
        radioButton_option_1.setBounds(200, 250, 150, 20);
        radioButton_option_2.setBounds(200, 280, 150, 20);
        radioButton_option_3.setBounds(200, 310, 150, 20);

        frame.add(tableScrollPane);
        frame.add(label_1);
        frame.add(label_2);
        frame.add(radioButton_mode_1);
        frame.add(radioButton_mode_2);
        frame.add(radioButton_mode_3);
        frame.add(radioButton_option_1);
        frame.add(radioButton_option_2);
        frame.add(radioButton_option_3);

        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

        radioButton_mode_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
                
            }
        });

        radioButton_mode_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                table.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
                
            }
        });

        radioButton_mode_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                
            }
        });

        radioButton_option_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                table.setRowSelectionAllowed(true);
                table.setColumnSelectionAllowed(false);
                
            }
        });

        radioButton_option_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                table.setRowSelectionAllowed(true);
                table.setColumnSelectionAllowed(false);
                
            }
        });

        radioButton_option_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                table.setRowSelectionAllowed(false);
                table.setColumnSelectionAllowed(true);
                
            }
        });

        radioButton_option_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                table.setCellSelectionEnabled(true);
                
            }
        });

    }

}
