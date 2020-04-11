package _02_Tools_Basic._16_JTabbedPane._06_Close_Button;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.plaf.basic.BasicButtonUI;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class SpecialTab extends JPanel{
    
    private final JTabbedPane tabbedPane;

    public SpecialTab(final JTabbedPane tabbedPane) {
        
        super(new FlowLayout(FlowLayout.LEFT, 0, 0));
        
        if (tabbedPane == null) {
            throw new NullPointerException("TabbedPane is null");
        }
        
        this.tabbedPane = tabbedPane;
        
        setOpaque(false);
        
        JLabel label = new JLabel() {
            
            @Override
            public String getText() {
                int i = tabbedPane.indexOfTabComponent(SpecialTab.this);
                
                if (i != -1) {
                    return tabbedPane.getTitleAt(i);
                }
                
                return null;
                
            }
            
        };

        add(label);
        
        label.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));        
        
        JButton button = new CloseButton();        
        add(button);
        
        setBorder(BorderFactory.createEmptyBorder(3, 0, 0, 0));
        
    }
    
    private class CloseButton extends JButton implements ActionListener{

        public CloseButton() {
            
            int size = 15;
            setPreferredSize(new Dimension(size, size));
            setText("X");
            setForeground(Color.white);
            setToolTipText("Close This Tab");
            
            setBackground(new Color(254, 46, 46));
            setContentAreaFilled(true);
            
            setFocusable(false);
            setBorder(BorderFactory.createEtchedBorder());
            setBorderPainted(true);
            
            setUI(new BasicButtonUI());
            
            addActionListener(this);
            
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            int i = tabbedPane.indexOfTabComponent(SpecialTab.this);
            if (i != -1) {
                tabbedPane.remove(i);
            }
        }

        @Override
        public void updateUI() {
        }
        
    }    
    
}
