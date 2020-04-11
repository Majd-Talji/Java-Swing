package _02_Tools_Basic._18_JDialog._01_Custom_Dialog;

import java.awt.Dialog;
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
        
        JFrame frame = new JFrame("JDialog Demo");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        JButton button = new JButton("Open Dialog");
        button.setBounds(40, 80, 130, 30);
        frame.add(button);
        
        CustomDialog dialog = new CustomDialog(frame);
        
        frame.setVisible(true);
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                dialog.show();
                
            }
        });
        
    }
    
}
