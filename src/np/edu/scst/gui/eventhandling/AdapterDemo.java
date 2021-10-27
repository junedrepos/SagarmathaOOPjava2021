package np.edu.scst.gui.eventhandling;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class AdapterDemo extends JFrame{

    public AdapterDemo() {
        JButton jButton = new JButton("Click me");        
        jButton.addMouseListener(new MouseAdapter() {
        @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse is Clicked");
            }
        });
        add(jButton);
        
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(500,500);
        setTitle("Adapter Class Event");
        setDefaultCloseOperation(2);
    }
    public static void main(String[] args) {
        new AdapterDemo();
    }
}
