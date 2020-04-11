package _02_Tools_Basic._23_JMenuBar._02_Object_JMenuItem_addSeparator_Events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("JMenuBar Demo");
        frame.setSize(500, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        JMenu help = new JMenu("Help");

        JMenuItem newFile = new JMenuItem("New");
        JMenuItem open = new JMenuItem("Open");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem exit = new JMenuItem("Exit");
        JMenuItem undo = new JMenuItem("Undo");
        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");
        JMenuItem select = new JMenuItem("Select All");
        JMenuItem about = new JMenuItem("About");
        JMenuItem report = new JMenuItem("Report Issue");

        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(help);

        file.add(newFile);
        file.add(open);
        file.add(save);
        file.addSeparator();
        file.add(exit);

        edit.add(undo);
        edit.addSeparator();
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.addSeparator();
        edit.add(select);

        help.add(about);
        help.add(report);

        frame.setJMenuBar(menuBar);

        frame.setVisible(true);

        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == newFile) {

                } else if (e.getSource() == open) {

                } else if (e.getSource() == save) {

                } else if (e.getSource() == exit) {

                } else if (e.getSource() == undo) {

                } else if (e.getSource() == cut) {

                } else if (e.getSource() == copy) {

                } else if (e.getSource() == paste) {

                } else if (e.getSource() == select) {

                } else if (e.getSource() == about) {

                } else if (e.getSource() == report) {

                }
            }
        };
        
        newFile.addActionListener(al);
        open.addActionListener(al);
        save.addActionListener(al);
        exit.addActionListener(al);
        undo.addActionListener(al);
        copy.addActionListener(al);
        cut.addActionListener(al);
        paste.addActionListener(al);
        select.addActionListener(al);
        about.addActionListener(al);
        report.addActionListener(al);

    }

}
