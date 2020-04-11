package _04_Events._07_WindowListener;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("WindowListener Demo");

        frame.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                JOptionPane.showMessageDialog(frame, "Event: window Opened");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                JOptionPane.showMessageDialog(frame, "Event: window Closing");
            }

            @Override
            public void windowClosed(WindowEvent e) {
                JOptionPane.showMessageDialog(frame, "Event: window Closed");
            }

            @Override
            public void windowIconified(WindowEvent e) {
                JOptionPane.showMessageDialog(frame, "Event: window Iconified");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                JOptionPane.showMessageDialog(frame, "Event: window Deiconified");
            }

            @Override
            public void windowActivated(WindowEvent e) {
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
            }
        });

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

}
