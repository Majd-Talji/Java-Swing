package _02_Tools_Basic._11_JSlider._01_Object_JSlider;

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
        
        JSlider slider = new JSlider();
        slider.setBounds(40, 80, 200, 50);
        
        frame.add(slider);
        
        frame.setVisible(true);
        
    }
    
}
