package np.edu.scst.gui.eventhandling;
import javax.swing.*;
import java.awt.event.*;
public class ActionDemoShort extends JFrame{
    ActionDemoShort(){
        JButton jButton = new JButton("Click me");
        jButton.addActionListener(new ActionListener(){
           @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("I have been clicked");
            }
        });
     
        add(jButton);
        
        setVisible(true);
        setSize(500,500);
        setTitle("Action Event Demo with Short method");
        setDefaultCloseOperation(2);
    }
    public static void main(String[] args) {
        new ActionDemoShort();
    }

}
