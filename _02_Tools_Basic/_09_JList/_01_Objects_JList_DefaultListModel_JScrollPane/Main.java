package _02_Tools_Basic._09_JList._01_Objects_JList_DefaultListModel_JScrollPane;

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
        frame.setSize(320, 360);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        DefaultListModel model = new DefaultListModel();
        JList list = new JList(model);
        JScrollPane listScrollPane = new JScrollPane(list);
        
        listScrollPane.setBounds(100, 40, 100, 230);
        
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
        
        frame.setVisible(true);
        
    }
    
}
