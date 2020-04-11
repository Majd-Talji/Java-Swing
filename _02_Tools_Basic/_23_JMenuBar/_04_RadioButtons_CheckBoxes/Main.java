package _02_Tools_Basic._23_JMenuBar._04_RadioButtons_CheckBoxes;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("JMenuBar Demo");
        frame.setSize(500, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();

        JMenu menu = new JMenu("Menu");

        JCheckBoxMenuItem connect = new JCheckBoxMenuItem("Connect");
        JCheckBoxMenuItem recieveNotifications = new JCheckBoxMenuItem("Recieve Notifications");

        JRadioButtonMenuItem isAvailable = new JRadioButtonMenuItem("Available");
        JRadioButtonMenuItem isBusy = new JRadioButtonMenuItem("Busy");
        JRadioButtonMenuItem isAway = new JRadioButtonMenuItem("Away");

        JMenuItem exit = new JMenuItem("Exit");

        ButtonGroup group = new ButtonGroup();

        group.add(isAvailable);
        group.add(isBusy);
        group.add(isAway);
        
        connect.setSelected(true);
        isAvailable.setSelected(true);

        menuBar.add(menu);

        menu.add(connect);
        menu.add(recieveNotifications);
        menu.addSeparator();
        menu.add(isAvailable);
        menu.add(isBusy);
        menu.add(isAway);
        menu.addSeparator();
        menu.add(exit);

        frame.setJMenuBar(menuBar);

        frame.setVisible(true);

    }

}
