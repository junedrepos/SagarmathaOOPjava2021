package np.edu.scst.gui;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFirstGUIApp extends JFrame{
    MyFirstGUIApp(){
        
        JPanel jPanel = new JPanel();
        jPanel.setBackground(Color.red);
        
        add(jPanel);
        
        setTitle("My first swing app");// set the title of the swing app
        setVisible(true);//make the application visible
                                                        //2
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//when we press close it terminates the application
        setSize(500,500);//set the window size to 500 by 500
    }
    public static void main(String[] args) {
        MyFirstGUIApp obj = new MyFirstGUIApp();
    }
}
