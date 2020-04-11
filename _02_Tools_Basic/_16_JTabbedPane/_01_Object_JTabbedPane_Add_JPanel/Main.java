package _02_Tools_Basic._16_JTabbedPane._01_Object_JTabbedPane_Add_JPanel;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("JTabbedPane Demo");
        frame.setSize(320, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        JPanel panel_1 = new JPanel();
        JPanel panel_2 = new JPanel();
        JPanel panel_3 = new JPanel();
        
        panel_1.setBackground(Color.white);
        panel_2.setBackground(Color.cyan);
        panel_3.setBackground(Color.yellow);
        
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setBounds(50, 30, 200, 200);
        
        tabbedPane.addTab("Tab 1", panel_1);
        tabbedPane.addTab("Tab 2", panel_2);
        tabbedPane.addTab("Tab 3", panel_3);
        
        frame.add(tabbedPane);
        
        frame.setVisible(true);
        
    }
    
}
