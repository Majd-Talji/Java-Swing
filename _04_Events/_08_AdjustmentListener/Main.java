package _04_Events._08_AdjustmentListener;

import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("AdjustmentListener Demo");
        JScrollBar scrollBar = new JScrollBar();
        JLabel label = new JLabel("Adjustment Value: 50");
        
        label.setBounds(90, 90, 150, 30);
        scrollBar.setBounds(40, 30, 30, 150);

        frame.add(scrollBar);
        frame.add(label);
        
        scrollBar.setMinimum(1);
        scrollBar.setMaximum(101);
        scrollBar.setValue(50);
        scrollBar.setVisibleAmount(1);

        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        
        scrollBar.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                label.setText("Adjustment Value: " + scrollBar.getValue());
            }
        });

    }

}
