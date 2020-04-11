package _02_Tools_Basic._21_JSplitPane._05_Set_Items_in_JSplitPane;

import java.io.File;
import java.net.URL;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {

    static JFrame frame = new JFrame("JSplitPant Demo");
    static JLabel picture = new JLabel();
    static DefaultListModel model = new DefaultListModel();
    static JList list = new JList(model);

    public static void main(String[] args) {

        frame.setSize(500, 320);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JScrollPane listScrollPane = new JScrollPane(list);
        JScrollPane pictureScrollPane = new JScrollPane(picture);

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, listScrollPane, pictureScrollPane);

        splitPane.setDividerLocation(150);
        splitPane.setOneTouchExpandable(true);
        splitPane.setContinuousLayout(true);

        try {

            URL urlFolder = Main.class.getResource("images");
            File rootFile = new File(urlFolder.getPath());
            String[] paths = rootFile.list();
            for (String path : paths) {
                model.addElement(path);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No Image found!", "Error", JOptionPane.ERROR_MESSAGE);
        }

        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setSelectedIndex(0);

        picture.setHorizontalAlignment(JLabel.CENTER);
        picture.setIcon(new ImageIcon(Main.class.getResource("images/" + list.getSelectedValue())));

        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                picture.setIcon(new ImageIcon(Main.class.getResource("images/" + list.getSelectedValue())));
            }
        });

        frame.add(splitPane);

        frame.setVisible(true);

    }

}
