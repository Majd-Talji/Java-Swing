package _02_Tools_Basic._23_JMenuBar._01_Object_JMenuBar_JMenu;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

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
        
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        JMenu help = new JMenu("Help");
        
        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(help);
        
        frame.setJMenuBar(menuBar);
        
        frame.setVisible(true);
        
    }    
    
}
