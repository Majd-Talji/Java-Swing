package _02_Tools_Basic._21_JSplitPane._04_add_new_Component;

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

        JSplitPane sp1 = new JSplitPane();
        sp1.setOrientation(JSplitPane.VERTICAL_SPLIT);
        sp1.setDividerLocation(200);
        sp1.setContinuousLayout(true);

        JSplitPane sp2 = new JSplitPane();
        sp2.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
        sp2.setDividerLocation(130);
        sp2.setContinuousLayout(true);

        sp1.setTopComponent(sp2);

        frame.add(sp1);
        frame.setVisible(true);

    }

}
