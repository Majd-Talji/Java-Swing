package _03_Layout._05_CardLayout._02_Next_Item;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("CardLayout Demo");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        CardLayout card = new CardLayout(20, 20);
        Container container = frame.getContentPane();
        container.setLayout(card);

        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.next(container);
            }
        };
        
        b1.addActionListener(al);
        b2.addActionListener(al);
        b3.addActionListener(al);
        
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);

        frame.setVisible(true);

    }

}
