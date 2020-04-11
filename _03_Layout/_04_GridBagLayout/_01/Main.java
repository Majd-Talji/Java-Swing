package _03_Layout._04_GridBagLayout._01;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("GridBagLayout Demo");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());

        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton b10 = new JButton("10");

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.fill = GridBagConstraints.BOTH;

        gbc.weightx = 1;
        gbc.weighty = 1;

        frame.add(b1, gbc);
        frame.add(b2, gbc);
        frame.add(b3, gbc);

        gbc.gridwidth = GridBagConstraints.REMAINDER;
        frame.add(b4, gbc);

        frame.add(b5, gbc);

        gbc.gridwidth = GridBagConstraints.RELATIVE;
        frame.add(b6, gbc);

        gbc.gridwidth = GridBagConstraints.REMAINDER;
        frame.add(b7, gbc);

        gbc.gridwidth = 1;
        gbc.gridheight = 2;
        frame.add(b8, gbc);

        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.gridheight = 1;
        frame.add(b9, gbc);
        
        frame.add(b10, gbc);        

        frame.setVisible(true);

    }

}
