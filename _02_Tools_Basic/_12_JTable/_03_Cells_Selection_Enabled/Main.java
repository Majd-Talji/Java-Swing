package _02_Tools_Basic._12_JTable._03_Cells_Selection_Enabled;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {

    static JFrame frame = new JFrame("JTable Demo");
    static DefaultTableModel model = new DefaultTableModel();
    static JTable table = new JTable(model);
    static JScrollPane tableScrollPane = new JScrollPane(table);
    static JButton button = new JButton("Display Selected Cells");
    static JTextArea textArea = new JTextArea();
    static JScrollPane textAreaScrollPane = new JScrollPane(textArea);

    public static void main(String[] args) {

        String columns[] = {"ID", "First Name", "Last Name", "Phone"};
        String data[][] = {
            {"1", "Majd", "Talji", "70123456"},
            {"2", "Ahmad", "Mousally", "076454532"},
            {"3", "Hala", "Hassan", "03555124"},
            {"4", "Rim", "Al Mousandes", "01321123"},
            {"5", "Said", "Al Kurdy", "07445599"},
            {"6", "Adbulah", "Saadi", "71001234"},
            {"7", "Ibrahim", "Marhaba", "04555666"},
            {"8", "Omar", "El Koussa", "0157894"},
            {"9", "Riad", "Asaad", "76887123"},
            {"10", "Rawan", "Hoblos", "01200500"},
            {"11", "Naya", "Asmar", "03654123"},
            {"12", "Mahmoud", "Mawwas", "70040300"},
            {"13", "Elena", "Shbib", "71199113"},
        };
        model.setDataVector(data, columns);

        table.setCellSelectionEnabled(true);
        
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        
        tableScrollPane.setBounds(0, 0, 585, 200);
        button.setBounds(20, 220, 200, 20);
        textAreaScrollPane.setBounds(20, 260, 353, 80);
        
        frame.add(tableScrollPane);
        frame.add(button);
        frame.add(textAreaScrollPane);
        
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                textArea.setText(null);
                
                for (int i = 0; i < table.getRowCount(); i++) {
                    
                    for (int j = 0; j < table.getColumnCount(); j++) {
                        
                        if (table.isCellSelected(i, j)) {
                            textArea.append((String)table.getValueAt(i, j) + " + ");
                        }
                        
                    }
                    
                }
                
            }
        });

    }

}
