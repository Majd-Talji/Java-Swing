package _02_Tools_Basic._05_JTextArea._05_Length_LineCount;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {

    static JFrame frame = new JFrame("JTextArea demo");
    static JTextArea textArea = new JTextArea();
    static JScrollPane scrollPane = new JScrollPane(textArea);
    static JLabel chars = new JLabel("Chars: 0");
    static JLabel lines = new JLabel("Lines: 0");

    public static void main(String[] args) {

        scrollPane.setBounds(40, 40, 310, 150);

        chars.setBounds(40, 210, 70, 30);
        lines.setBounds(160, 210, 70, 30);
        
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        
        frame.add(chars);
        frame.add(scrollPane);
        frame.add(lines);
        
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        
        textArea.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                chars.setText("Chars: " + textArea.getText().length());
                lines.setText("Lines: " + textArea.getLineCount());
            }

            @Override
            public void keyPressed(KeyEvent e) {
                chars.setText("Chars: " + textArea.getText().length());
                lines.setText("Lines: " + textArea.getLineCount());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                chars.setText("Chars: " + textArea.getText().length());
                lines.setText("Lines: " + textArea.getLineCount());
            }
        });
        
    }

}
