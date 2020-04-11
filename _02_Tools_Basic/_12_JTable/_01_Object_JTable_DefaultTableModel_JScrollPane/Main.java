package _02_Tools_Basic._12_JTable._01_Object_JTable_DefaultTableModel_JScrollPane;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("JTable Demo");
        frame.setSize(500, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        String columns[] = {"ID", "First Name", "Last Name"};
        String data[][] = {
            {"1", "Majd", "Talji"},
            {"2", "Ahmad", "Mousally"},
            {"3", "Hala", "Hassan"},
            {"4", "Rim", "Al Mousandes"},
            {"5", "Said", "Al Kurdy"},
            {"6", "Adbulah", "Saadi"},
            {"7", "Ibrahim", "Marhaba"},
            {"8", "Omar", "El Koussa"},
            {"9", "Riad", "Asaad"},
            {"10", "Rawan", "Hoblos"},
        };

        DefaultTableModel model = new DefaultTableModel();
        model.setDataVector(data, columns);
        JTable table = new JTable(model);
        JScrollPane tableScrollPane = new JScrollPane(table);

        tableScrollPane.setBounds(60, 40, 370, 140);

        frame.add(tableScrollPane);

        frame.setVisible(true);

    }

}
