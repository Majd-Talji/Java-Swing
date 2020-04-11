package _02_Tools_Basic._09_JList._05_ListSelectionModel_Single_Selection;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    static JFrame frame = new JFrame("JList Demo");
    
    static JLabel label_1 = new JLabel("Select Language");
    
    static DefaultListModel model_1 = new DefaultListModel();
    static JList list_1 = new JList(model_1);
    static JScrollPane listScrollPane_1 = new JScrollPane(list_1);
    
    static JLabel label_2 = new JLabel("Select Level");
    
    static DefaultListModel model_2 = new DefaultListModel();
    static JList list_2 = new JList(model_2);
    static JScrollPane listScrollPane_2 = new JScrollPane(list_2);
    
    static JButton btn = new JButton("View Selected");
    static JLabel label_3 = new JLabel("", JLabel.CENTER);
    
    public static void main(String[] args) {
        
        label_1.setBounds(50, 25, 100, 30);
        listScrollPane_1.setBounds(50, 60, 100, 93);
        label_2.setBounds(190, 25, 100, 30);
        listScrollPane_2.setBounds(190, 60, 100, 93);
        btn.setBounds(100, 200, 130, 30);
        label_3.setBounds(0, 250, 350, 30);
        
        model_1.addElement("Java");
        model_1.addElement("C");
        model_1.addElement("C++");
        model_1.addElement("C#");
        model_1.addElement("VB");
        
        model_2.addElement("101");
        model_2.addElement("102");
        model_2.addElement("103");
        
        list_1.setSelectedIndex(0);
        list_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        list_2.setSelectedIndex(0);
        list_2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        frame.add(label_1);
        frame.add(listScrollPane_1);
        frame.add(label_2);
        frame.add(listScrollPane_2);
        frame.add(btn);
        frame.add(label_3);
        
        frame.setSize(350, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label_3.setText("You Select:  " + list_1.getSelectedValue() + " [ " + list_2.getSelectedValue() + " ]");
            }
        });
        
    }
    
}
