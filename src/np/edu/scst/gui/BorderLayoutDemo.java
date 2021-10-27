package np.edu.scst.gui;
import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo extends JFrame{
    BorderLayoutDemo(){ 
        JButton north = new JButton("North");
        JButton south = new JButton("South");
        JButton west = new JButton("West");
        JButton east = new JButton("East");
        JButton center = new JButton("center");
        
        setLayout(new BorderLayout());
        
        add(BorderLayout.NORTH,north);
        add(BorderLayout.SOUTH,south);
        add(BorderLayout.WEST,west);
        add(BorderLayout.EAST,east);
        add(BorderLayout.CENTER,center);
        
        setTitle("Components");
        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(2);
    
    }
    public static void main(String[] args) {
        new BorderLayoutDemo();
    }
}
