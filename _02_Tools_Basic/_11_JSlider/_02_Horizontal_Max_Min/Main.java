package _02_Tools_Basic._11_JSlider._02_Horizontal_Max_Min;

import javax.swing.JFrame;
import javax.swing.JSlider;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("JSlider Demo");
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 20, 10);
        slider.setMinorTickSpacing(1);
        slider.setMajorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        
        slider.setBounds(40, 80, 200, 50);
        
        frame.add(slider);
        
        frame.setVisible(true);        
        
    }
    
}
