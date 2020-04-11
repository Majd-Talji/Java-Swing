package _02_Tools_Basic._11_JSlider._04_Events_Change_Value;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {

    static JFrame frame = new JFrame("JSlider Demo");
    static JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 20, 10);
    static JLabel label = new JLabel("Selected Value");
    static JTextField textField = new JTextField();

    public static void main(String[] args) {

        textField.setText(String.valueOf(slider.getValue()));

        slider.setMinorTickSpacing(1);
        slider.setMajorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        slider.setBounds(40, 50, 200, 50);
        label.setBounds(80, 130, 100, 30);
        textField.setBounds(175, 134, 20, 22);

        frame.add(slider);
        frame.add(label);
        frame.add(textField);

        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                textField.setText(String.valueOf(slider.getValue()));
            }
        });

    }

}
