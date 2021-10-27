package np.edu.scst.gui;
import javax.swing.*;

public class DialogboxesDemo {
    public static void main(String[] args) {
        //message dialog box
        JOptionPane.showMessageDialog(null, "Hello world from dialog box");
        //input dialog box
        String name = JOptionPane.showInputDialog(null, "Please enter your name");
        System.out.println(name);
        //confirm dialog
        int yesNo = JOptionPane.showConfirmDialog(null, "Do you really want to exit");
        System.out.println(yesNo);
    }
}
