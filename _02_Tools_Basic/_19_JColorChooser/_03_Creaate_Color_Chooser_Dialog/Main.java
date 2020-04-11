package _02_Tools_Basic._19_JColorChooser._03_Creaate_Color_Chooser_Dialog;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

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

        JColorChooser colorChooser = new JColorChooser();

        colorChooser.setColor(0, 51, 255);

        JLabel previewLabel = new JLabel("Selected Color");
        previewLabel.setFont(new Font("Serif", Font.BOLD, 34));
        previewLabel.setSize(previewLabel.getPreferredSize());

        colorChooser.setPreviewPanel(previewLabel);

        ActionListener okActionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame.getContentPane().setBackground(colorChooser.getColor());

            }
        };

        ActionListener cancelActionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };

        JDialog dialog = JColorChooser.createDialog(frame,
                "Color",
                false,
                colorChooser,
                okActionListener, cancelActionListener);

        frame.setVisible(true);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                dialog.setVisible(true);

            }
        });

    }

}
