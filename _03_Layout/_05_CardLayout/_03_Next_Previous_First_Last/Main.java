package _03_Layout._05_CardLayout._03_Next_Previous_First_Last;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("CardLayout Demo");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());

        JPanel panel_L = new JPanel();
        JPanel panel_R = new JPanel();

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.fill = GridBagConstraints.BOTH;

        gbc.weightx = 1;
        gbc.weighty = 1;

        frame.add(panel_L, gbc);

        gbc.weightx = 10;
        frame.add(panel_R, gbc);

        panel_L.setLayout(new GridLayout(4, 1));

        JButton next = new JButton("Next");
        JButton previous = new JButton("Previous");
        JButton first = new JButton("First");
        JButton last = new JButton("Last");

        panel_L.add(next);
        panel_L.add(previous);
        panel_L.add(first);
        panel_L.add(last);

        CardLayout card = new CardLayout();
        Container container = panel_R;
        container.setLayout(card);

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();

        p1.setBackground(Color.white);
        p2.setBackground(Color.yellow);
        p3.setBackground(Color.cyan);
        p4.setBackground(Color.green);

        p1.add(new JLabel("Panel 1"));
        p2.add(new JLabel("Panel 2"));
        p3.add(new JLabel("Panel 3"));
        p4.add(new JLabel("Panel 4"));

        panel_R.add(p1);
        panel_R.add(p2);
        panel_R.add(p3);
        panel_R.add(p4);
        
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.next(container);
            }
        });

        previous.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.previous(container);
            }
        });
        
        first.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.first(container);
            }
        });
        
        last.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.last(container);
            }
        });

        frame.setVisible(true);

    }

}
