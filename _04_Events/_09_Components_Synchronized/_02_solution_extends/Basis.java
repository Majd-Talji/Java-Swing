package _04_Events._09_Components_Synchronized._02_solution_extends;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Basis extends JFrame{
    
    public Basis() {
        createAndShowGUI();
    }
    
    private void createAndShowGUI() {
        
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Basis();
            }
        });
    }
    
}
