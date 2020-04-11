package _02_Tools_Basic._23_JMenuBar._05_Add_Menu_in_Menu;

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
        JMenu subJMenu = new JMenu("Sub Menu");
        
        JMenuItem item1 = new JMenuItem("Item 1");
        JMenuItem item2 = new JMenuItem("Item 2");
        JMenuItem item3 = new JMenuItem("Item 3");
        JMenuItem item4 = new JMenuItem("Item 4");
        JMenuItem item5 = new JMenuItem("Item 5");
        JMenuItem item6 = new JMenuItem("Item 6");
        JMenuItem item7 = new JMenuItem("Item 7");
        JMenuItem item8 = new JMenuItem("Item 8");
        JMenuItem item9 = new JMenuItem("Item 9");
                
        menuBar.add(menu);

        menu.add(item1);
        menu.add(item2);
        menu.add(item3);
        
        menu.add(subJMenu);
        
        subJMenu.add(item4);
        subJMenu.add(item5);
        subJMenu.add(item6);
        subJMenu.add(item7);
        subJMenu.add(item8);
        subJMenu.add(item9);
        
        frame.setJMenuBar(menuBar);
        
        frame.setVisible(true);
        
    }    
    
}
