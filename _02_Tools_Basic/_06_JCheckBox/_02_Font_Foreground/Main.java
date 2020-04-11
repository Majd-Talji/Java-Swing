package _02_Tools_Basic._06_JCheckBox._02_Font_Foreground;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("JCheckBox demo");
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JCheckBox checkBox_1 = new JCheckBox("Red", true);
        JCheckBox checkBox_2 = new JCheckBox("Blue");
        JCheckBox checkBox_3 = new JCheckBox("Gray");
        
        Font newFont = new Font("Arial", Font.BOLD, 16);
        
        checkBox_1.setFont(newFont);
        checkBox_1.setForeground(Color.red);
        checkBox_1.setBounds(40, 40, 100, 30);
        
        checkBox_2.setFont(newFont);
        checkBox_2.setForeground(Color.blue);
        checkBox_2.setBounds(40, 70, 100, 30);
        
        checkBox_3.setFont(newFont);
        checkBox_3.setForeground(Color.gray);
        checkBox_3.setBounds(40, 100, 100, 30);
        
        frame.add(checkBox_1);
        frame.add(checkBox_2);
        frame.add(checkBox_3);
        
        frame.setVisible(true);

    }

}
