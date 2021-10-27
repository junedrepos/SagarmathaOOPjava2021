package np.edu.scst.gui.eventhandling;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class ActionDemo extends JFrame implements ActionListener{
    ActionDemo(){
        JButton jButton = new JButton("Click me");
        
        jButton.addActionListener(this);
        
        add(jButton);
        
        setVisible(true);
        setSize(500,500);
        setTitle("Action Event Demo");
        setDefaultCloseOperation(2);
    }
    public static void main(String[] args) {
        new ActionDemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("I have been clicked");
    }
}
