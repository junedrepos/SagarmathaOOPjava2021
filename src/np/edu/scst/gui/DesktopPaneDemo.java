package np.edu.scst.gui;
import java.awt.Color;
import javax.swing.*;
public class DesktopPaneDemo extends JFrame {
    public DesktopPaneDemo()  {
        JDesktopPane jDesktopPane = new JDesktopPane();
        jDesktopPane.setBackground(Color.blue);
        
        JInternalFrame app1 = new JInternalFrame("Application 1", true, true, true);
        JInternalFrame app2 = new JInternalFrame("Application 2", true, true, true);
        JInternalFrame app3 = new JInternalFrame("Application 3", true, true, true);
        
        JLabel jLabel1 = new JLabel("I am Jlabel of app 1");
        JLabel jLabel2 = new JLabel("I am Jlabel of app 2");
        JLabel jLabel3 = new JLabel("I am Jlabel of app 3");
        
        app1.add(jLabel1);
        app2.add(jLabel2);
        app3.add(jLabel3);
        
        app1.setVisible(true);
        app2.setVisible(true);
        app3.setVisible(true);
        
        app1.setSize(100, 100);
        app2.setSize(100, 100);
        app3.setSize(100, 100);
        
        jDesktopPane.add(app1);
        jDesktopPane.add(app2);
        jDesktopPane.add(app3);
        
        add(jDesktopPane);
        
        setVisible(true);
        setSize(1000,500);
        setTitle("Desktop Pane Demo");
        setDefaultCloseOperation(2);
    }
    public static void main(String[] args) {
        new DesktopPaneDemo();
    }
}
