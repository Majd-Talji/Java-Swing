package _02_Tools_Basic._23_JMenuBar._03_setIcon_JMenuItem;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

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
        
        JMenuItem newFile = new JMenuItem("New", new ImageIcon(Main.class.getResource("images/new-file-icon.png")));
        JMenuItem open = new JMenuItem("Open", new ImageIcon(Main.class.getResource("images/open-icon.png")));
        JMenuItem save = new JMenuItem("Save", new ImageIcon(Main.class.getResource("images/save-icon.png")));
        JMenuItem exit = new JMenuItem("Exit", new ImageIcon(Main.class.getResource("images/exit-icon.png")));
        
        menuBar.add(menu);

        menu.add(newFile);
        menu.add(open);
        menu.add(save);
        menu.addSeparator();
        menu.add(exit);
        
        frame.setJMenuBar(menuBar);
        
        frame.setVisible(true);
        
    }    
    
}
