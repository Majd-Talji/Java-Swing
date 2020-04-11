package _02_Tools_Basic._21_JSplitPane._03_Vertical_JSplitPane;

import javax.swing.JFrame;
import javax.swing.JSplitPane;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("JSplitPane Demo");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JSplitPane splitPane = new JSplitPane();
        splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
        splitPane.setDividerLocation(130);
        splitPane.setDividerSize(9);
        splitPane.setOneTouchExpandable(true);
        splitPane.setContinuousLayout(true);

        frame.add(splitPane);
        frame.setVisible(true);

    }

}
