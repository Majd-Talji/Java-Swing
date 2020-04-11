package _02_Tools_Basic._20_JFileChooser._01_Object_File_Chooser_Dialog;

import javax.swing.JFileChooser;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {

    public static void main(String[] args) {

        JFileChooser chooser = new JFileChooser();

        int returnedValue = chooser.showSaveDialog(null);

        if (returnedValue == JFileChooser.APPROVE_OPTION) {
            System.out.println("APPROVE_OPTION");
        } else {
            System.out.println(returnedValue);
        }

    }

}
