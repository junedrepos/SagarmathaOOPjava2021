package np.edu.scst.gui;

import java.awt.FlowLayout;
import javax.swing.*;

public class Components extends JFrame{
    Components(){
        //Labels
        JLabel jLabel = new JLabel("Hello world from label");
        JLabel jLabel2 = new JLabel("Hello world from label 2. How are you?");
        
        //TextField
        JTextField jTextField = new JTextField("Some Pretext",20);
        //password field
        JPasswordField jPasswordField = new JPasswordField(20);
        //JCheckbox
        JCheckBox jCheckBox = new JCheckBox("BCA");
        JCheckBox jCheckBox2 = new JCheckBox("CSIT");
        JCheckBox jCheckBox3 = new JCheckBox("BBA");
        //JRadioButton
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        JRadioButton other = new JRadioButton("Other");
        ButtonGroup gender = new ButtonGroup();
        gender.add(male); 
        gender.add(female);
        gender.add(other);
        //combo box
        String[] countries = {"Nepal","India","China"};
        JComboBox jComboBox = new JComboBox(countries);
        //list
        JList jList = new JList(countries);
        //JTextArea
        JTextArea jTextArea = new JTextArea(2,20);
        //Button
        JButton jButton = new JButton("Click me");
        //table
        String[ ] heading = {"Id","Name","Subject"};
        String[ ][ ] body = {
                                            {"1","Ram","Java"},
                                            {"2","Shyam","Web tech"},
                                            {"3","Sita","Java"},
                                            {"4","Laxman","Probab"},
                                        };
         JTable jTable = new JTable(body,heading); 
         JScrollPane jScrollPane = new JScrollPane(jTable);
         jScrollPane.setVerticalScrollBarPolicy(22);
         jScrollPane.setHorizontalScrollBarPolicy(32);
        //adding of components
        add(jLabel);
        add(jLabel2);
        add(jTextField);
        add(jPasswordField);
        add(jCheckBox);
        add(jCheckBox2);
        add(jCheckBox3);
        add(male);
        add(female);
        add(other);
        add(jComboBox);
        add(jList);
        add(jTextArea);
        add(jButton);
        add(jScrollPane);
        
        setLayout(new FlowLayout());
        
        setTitle("Components");
        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(2);
    
    }
    public static void main(String[] args) {
        new Components();
    }
}
