package _02_Tools_Basic._16_JTabbedPane._06_Close_Button;

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
        frame.setSize(420, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JPanel panel_1 = new JPanel();
        JPanel panel_2 = new JPanel();
        JPanel panel_3 = new JPanel();
        JPanel panel_4 = new JPanel();
        JPanel panel_5 = new JPanel();

        panel_1.setBackground(Color.white);
        panel_2.setBackground(Color.cyan);
        panel_3.setBackground(Color.yellow);
        panel_4.setBackground(Color.green);
        panel_5.setBackground(Color.red);

        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP, JTabbedPane.SCROLL_TAB_LAYOUT);
        tabbedPane.setBounds(50, 30, 300, 200);

        tabbedPane.addTab("Tab 1", panel_1);
        tabbedPane.addTab("Tab 2", panel_2);
        tabbedPane.addTab("Tab 3", panel_3);
        tabbedPane.addTab("Tab 4", panel_4);
        tabbedPane.addTab("Tab 5", panel_5);
        
        for (int i = 0; i < tabbedPane.getTabCount(); i++) {
            tabbedPane.setTabComponentAt(i, new SpecialTab(tabbedPane));
        }

        frame.add(tabbedPane);

        frame.setVisible(true);
        
    }
    
}
