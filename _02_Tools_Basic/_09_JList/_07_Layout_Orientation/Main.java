package _02_Tools_Basic._09_JList._07_Layout_Orientation;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("JList Demo");
        frame.setSize(530, 280);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        DefaultListModel model = new DefaultListModel();
        
        model.addElement("Mouhamad");
        model.addElement("Ahmad");
        model.addElement("Salem");
        model.addElement("Khaled");
        model.addElement("Omar");
        model.addElement("Said");
        model.addElement("Moumen");
        model.addElement("Moustafa");
        model.addElement("Nidal");
        model.addElement("Samir");
        model.addElement("Mahmoud");
        model.addElement("Riad");
        model.addElement("Raja");
        model.addElement("Ziad");
        model.addElement("Fouad");
        model.addElement("Mounir");
        model.addElement("Wassim");
        model.addElement("Majd");
        model.addElement("Mansour");
        model.addElement("Ali");
        model.addElement("Yahya");
        model.addElement("Jamal");
        model.addElement("Kassem");
        
        JList list_1 = new JList(model);
        JList list_2 = new JList(model);
        JList list_3 = new JList(model);
        
        list_1.setLayoutOrientation(JList.VERTICAL);
        list_2.setLayoutOrientation(JList.VERTICAL_WRAP);
        list_3.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        
        JScrollPane listScrollPane1 = new JScrollPane(list_1);
        JScrollPane listScrollPane2 = new JScrollPane(list_2);
        JScrollPane listScrollPane3 = new JScrollPane(list_3);
        
        listScrollPane1.setBounds(40, 40, 100, 150);
        listScrollPane2.setBounds(200, 40, 100, 150);
        listScrollPane3.setBounds(360, 40, 120, 150);
        
        frame.add(listScrollPane1);
        frame.add(listScrollPane2);
        frame.add(listScrollPane3);
        
        frame.setVisible(true);
        
    }
    
}
