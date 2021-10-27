package np.edu.scst.gui.applet;
import java.applet.*;
import java.awt.Graphics;
import java.awt.*;
import java.awt.event.*;
public class Addition extends Applet{
   @Override
   public void init(){
        TextField no1 =  new TextField(20);
        TextField no2 =  new TextField(20);
        Button btn = new Button("Add");
        Label label = new Label("Result is:                                                     ");
        
        btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               int i = Integer.valueOf(no1.getText());
               int j = Integer.valueOf(no2.getText());
               int sum = i+j;
               label.setText("The sum of your addition is: "+sum);
            }
        });
        
        add(no1);
        add(no2);
        add(btn);
        add(label);
   }
}
