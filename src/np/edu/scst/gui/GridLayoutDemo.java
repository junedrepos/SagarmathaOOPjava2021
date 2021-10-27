package np.edu.scst.gui;
import java.awt.GridLayout;
import javax.swing.*;

public class GridLayoutDemo extends JFrame{
    GridLayoutDemo(){
        JLabel jLabel1 = new JLabel("1");
        JLabel jLabel2 = new JLabel("2");
        JLabel jLabel3 = new JLabel("3");
        JLabel jLabel4 = new JLabel("4");
        JLabel jLabel5 = new JLabel("5");
        JLabel jLabel6 = new JLabel("6");
        
        setLayout(new GridLayout(3,2));
        
        add(jLabel1);
        add(jLabel2);
        add(jLabel3);
        add(jLabel4);
        add(jLabel5);
        add(jLabel6);
        
        setTitle("Components");
        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(2);
    
    }
    public static void main(String[] args) {
        new GridLayoutDemo();
    }
}
