package _02_Tools_Basic._13_JTree._01_Object_JTree_DefaultMutableTreeNode_JScrollPane;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("JTree Demo");
        frame.setSize(350, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout());

        DefaultMutableTreeNode menu = new DefaultMutableTreeNode("Menu");
        DefaultMutableTreeNode food = new DefaultMutableTreeNode("Food");
        DefaultMutableTreeNode drink = new DefaultMutableTreeNode("drink");
        DefaultMutableTreeNode pizza = new DefaultMutableTreeNode("pizza");
        DefaultMutableTreeNode hotDogs = new DefaultMutableTreeNode("hotDogs");
        DefaultMutableTreeNode chicken = new DefaultMutableTreeNode("chicken");
        DefaultMutableTreeNode hamburger = new DefaultMutableTreeNode("hamburger");
        DefaultMutableTreeNode pepsi = new DefaultMutableTreeNode("pepsi");
        DefaultMutableTreeNode cola = new DefaultMutableTreeNode("cola");
        DefaultMutableTreeNode rani = new DefaultMutableTreeNode("rani");
        DefaultMutableTreeNode water = new DefaultMutableTreeNode("water");
        
        menu.add(food);
        menu.add(drink);
        food.add(pizza);
        food.add(hotDogs);
        food.add(chicken);
        drink.add(pepsi);
        drink.add(cola);
        drink.add(rani);
        drink.add(water);
        
        JTree tree = new JTree(menu);
        
        tree.setToggleClickCount(1);
        tree.setEditable(true);
        
        JScrollPane treeScrollPane = new JScrollPane(tree);
        frame.add(treeScrollPane);
        frame.setVisible(true);

    }

}
