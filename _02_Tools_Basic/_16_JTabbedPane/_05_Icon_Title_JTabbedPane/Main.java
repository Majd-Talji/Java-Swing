package _02_Tools_Basic._16_JTabbedPane._05_Icon_Title_JTabbedPane;

import java.awt.Color;
import java.net.URL;
import javax.swing.ImageIcon;
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
        
        URL imgUrl = Main.class.getResource("tab-icon.png");
        ImageIcon icon = new ImageIcon(imgUrl);

        tabbedPane.addTab("Tab 1", icon, panel_1);
        tabbedPane.addTab("Tab 2", icon, panel_2);
        tabbedPane.addTab("Tab 3", icon, panel_3);
        tabbedPane.addTab("Tab 4", icon, panel_4);
        tabbedPane.addTab("Tab 5", icon, panel_5);

        frame.add(tabbedPane);

        frame.setVisible(true);

    }

}
