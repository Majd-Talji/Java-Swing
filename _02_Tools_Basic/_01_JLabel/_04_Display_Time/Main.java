package _02_Tools_Basic._01_JLabel._04_Display_Time;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main implements Runnable {

    static JLabel timeLabel = new JLabel();

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss: a");
            timeLabel.setText(sdf.format(date));
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                timeLabel.setText(e.getMessage());
                timeLabel.setForeground(Color.red);
            }
        }
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Display Time");
        frame.setSize(350, 70);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        Font newFont = new Font("Arial", Font.BOLD, 20);

        timeLabel.setFont(newFont);
        timeLabel.setForeground(Color.blue);

        frame.add(timeLabel);

        frame.setVisible(true);

        Thread t = new Thread(new Main());
        t.start();

    }

}
