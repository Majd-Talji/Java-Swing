package _02_Tools_Basic._20_JFileChooser._03_Filter_File;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("JFileChooser Demo");
        frame.setSize(520, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem open = new JMenuItem("Open File");
        
        menuBar.add(file);
        file.add(open);
        
        JTextArea textArea = new JTextArea();
        JScrollPane textAreaScrollPane = new JScrollPane(textArea);
        
        frame.setJMenuBar(menuBar);
        frame.add(textAreaScrollPane);
        
        JFileChooser chooser = new JFileChooser("C:\\MyFiles");
        
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text or Java Files", "txt", "java");
        chooser.setFileFilter(filter);
        
        frame.setVisible(true);
        
        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                int returnedValue = chooser.showOpenDialog(frame);
                
                if (returnedValue == JFileChooser.APPROVE_OPTION) {
                    
                    File selectedFile = chooser.getSelectedFile();
                    String filePath = selectedFile.getPath();
                    
                    try {
                        
                        BufferedReader br = new BufferedReader(new FileReader(filePath));
                        String line = "";
                        String text = "";
                        
                        while ((line = br.readLine()) != null) {                            
                            text += line + "\n";
                        }
                        
                        textArea.setText(text);
                        br.close();
                        
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    
                }
                
            }
        });
        
    }
    
}
