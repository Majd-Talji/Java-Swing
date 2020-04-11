package _01_Basis_From;

import javax.swing.JFrame;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class _02_JFrame_Extends extends JFrame{

    public _02_JFrame_Extends() {
        this.setSize(500, 400);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        
        new _02_JFrame_Extends();
        
    }
    
}
