package _02_Tools_Basic._19_JColorChooser._01_Object;

import java.awt.Color;
import javax.swing.JColorChooser;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {

    public static void main(String[] args) {

        Color c = JColorChooser.showDialog(null, "Color Picker", Color.red);

        System.out.println(c);

    }

}
