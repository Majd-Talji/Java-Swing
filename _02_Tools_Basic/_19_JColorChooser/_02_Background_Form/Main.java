package _02_Tools_Basic._19_JColorChooser._02_Background_Form;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("JColorChooser Demo");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        JButton button = new JButton("Change background color");
        button.setBounds(90, 70, 200, 30);
        
        frame.add(button);
        
        frame.setVisible(true);
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                Color c = JColorChooser.showDialog(frame, "Color Picker", frame.getContentPane().getBackground());
                
                if (c != null) {
                    frame.getContentPane().setBackground(c);
                }
                
            }
        });

    }

}
