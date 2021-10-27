package np.edu.scst.gui.eventhandling;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Addition extends JFrame{
    Addition(){
        JTextField field1 = new JTextField(20);
        JTextField field2 = new JTextField(20);
        JButton jButton = new JButton("Add");
        JLabel result = new JLabel("Result is: ");
//        field1.setBounds(WIDTH, WIDTH, WIDTH, HEIGHT);
        jButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int a = Integer.valueOf(field1.getText());
                String anotherNo = field2.getText();
                int b = Integer.valueOf(anotherNo);
                int sum = a+b;
                System.out.println(sum);
                result.setText("Result is: "+sum);
            }
        });
        
        add(field1);
        add(field2);
        add(jButton);
        add(result);
        
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(500,500);
        setTitle("Addition");
        setDefaultCloseOperation(2);
    }
    public static void main(String[] args) {
        new Addition();
    }
}
