package _04_Events._09_Components_Synchronized._01_solution_not_extends;

import javax.swing.SwingUtilities;
/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Basis {
    
    private static void createAndShowGUI() {
        
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }
    
}
