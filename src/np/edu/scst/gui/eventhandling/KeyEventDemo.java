package np.edu.scst.gui.eventhandling;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class KeyEventDemo extends JFrame{

    public KeyEventDemo(){
        JTextField jTextField = new JTextField(20);
        jTextField.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("a key was keytyped");
              }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("a key is being pressed");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("a key is released");
            }
        
        });
        
        
        add(jTextField);
        
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(500,500);
        setTitle("Key Event");
        setDefaultCloseOperation(2);
    }
    public static void main(String[] args) {
        new KeyEventDemo();
    }
}
