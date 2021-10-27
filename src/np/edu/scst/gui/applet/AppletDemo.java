package np.edu.scst.gui.applet;

import java.applet.Applet;
import java.awt.Graphics;

public class AppletDemo extends Applet{
    @Override
    public void init(){
        System.out.println("Init phase");
    }
    @Override
    public void start(){
        System.out.println("Start phase");
    }
    @Override
    public void paint(Graphics g){
        System.out.println("Paint phase");
        g.drawRect(10, 10, 40, 50);
//        for (int i = 0; i < 10; i++) {
//            g.drawOval(10, 10, i*10, i*10);
//            try{Thread.sleep(1000);}catch(Exception e){}
//        }
    }
    @Override
    public void stop(){
        System.out.println("stop phase");
    }
    @Override
    public void destroy(){
        System.out.println("destroy phase");
    }
}
