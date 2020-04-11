package _02_Tools_Basic._21_JSplitPane._02_TouchExpandable;

import javax.swing.JFrame;
import javax.swing.JSplitPane;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("JSplitPane Demo");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JSplitPane splitPane = new JSplitPane();
        splitPane.setDividerLocation(184);
        splitPane.setDividerSize(9);
        splitPane.setOneTouchExpandable(true);
        splitPane.setContinuousLayout(true);
        
        frame.add(splitPane);
        frame.setVisible(true);
        
    }
    
}
