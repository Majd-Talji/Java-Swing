package _04_Events._04_MouseListener;

import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("MouseListener Demo");
        JLabel mousePosition = new JLabel("Mouse Position");
        JLabel mouseStatus = new JLabel("Mouse Status");

        frame.add(mousePosition);
        frame.add(mouseStatus);

        frame.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mousePosition.setText("Mouse Position: (" + e.getX() + ", " + e.getY() + ")");
                mouseStatus.setText("Mouse Status: Mouse Clicked");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                mouseStatus.setText("Mouse Status: Mouse Pressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                mouseStatus.setText("Mouse Status: Mouse Released");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                mouseStatus.setText("Mouse Status: Mouse Entered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                mouseStatus.setText("Mouse Status: Mouse Exited");
            }
        });

        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(2, 1));
        frame.setVisible(true);

    }

}
