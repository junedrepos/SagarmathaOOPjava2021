package np.edu.scst.gui.eventhandling;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MouseEventDemo extends JFrame{

    public MouseEventDemo() {
        JButton jButton = new JButton("Click me");        
        jButton.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse is Clicked");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Mouse is Pressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("Mouse is Released");
             }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Mouse is Entered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Mouse is Exited");
            }
        
        
        });
        add(jButton);
        
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(500,500);
        setTitle("Mouse Event");
        setDefaultCloseOperation(2);
    }
    public static void main(String[] args) {
        new MouseEventDemo();
    }
    
}
