package _02_Tools_Basic._18_JDialog._01_Custom_Dialog;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class CustomDialog {
    
    private JDialog dialog;
    private final JLabel label;
    private final JButton button;

    public CustomDialog(JFrame f) {
        
        dialog = new JDialog(f);
        label = new JLabel("This is a custom dialog");
        button = new JButton("Close");
        
        label.setBounds(40, 50, 150, 30);
        button.setBounds(210, 50, 70, 30);
        
        dialog.setLocationRelativeTo(f);
        dialog.setLayout(null);
        dialog.setSize(340, 170);
        dialog.setTitle("Custom Dialog");
        dialog.setModal(false);
        
        dialog.add(label);
        dialog.add(button);
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                dialog.setVisible(false);
                
            }
        });
        
    }

    public void show() {
        
        dialog.setVisible(true);
        
    }

    public void hide() {
        
        dialog.setVisible(false);
        
    }

}
