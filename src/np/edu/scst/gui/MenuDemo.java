package np.edu.scst.gui;
import javax.swing.*;

public class MenuDemo extends JFrame{
    MenuDemo(){
        JMenuBar jMenuBar = new JMenuBar();
        
        JMenu fileMenu = new JMenu("File");
        JMenu viewMenu = new JMenu("View");
        JMenu saveAsMenu = new JMenu("Save as");
        
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem txtItem = new JMenuItem("txt");
        JMenuItem pdfItem = new JMenuItem("pdf");
        //add menu items txt and pdf to saveas
        saveAsMenu.add(txtItem);
        saveAsMenu.add(pdfItem);
        //add menu saveas and menuitems open and save
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(saveAsMenu);
        //add menu file and view to the menubar
        jMenuBar.add(fileMenu);
        jMenuBar.add(viewMenu);
        //add menubar to the frame
        add(jMenuBar);
        
        setVisible(true);
        setTitle("Menu Demo");
        setSize(500,500);
        setDefaultCloseOperation(2);
    }
        public static void main(String[] args) {
        new MenuDemo();
    }
}
