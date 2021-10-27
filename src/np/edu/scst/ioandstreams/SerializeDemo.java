package np.edu.scst.ioandstreams;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeDemo {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        //serialization step
//        Player p = new Player(1,"Ram",7);
//        p.level= 11;
//        FileOutputStream fos = new FileOutputStream("progress.txt");
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        oos.writeObject(p);
//        oos.close();
//        fos.close();
//deserialization step
        FileInputStream fis = new FileInputStream("progress.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Player p2 = (Player) ois.readObject();
        System.out.println(p2.id);
        System.out.println(p2.name);
        System.out.println(p2.level);
//        Number
    }
}

class Player implements Serializable{
    int id;
    String name;
    int level;

    public Player(int id, String name, int level) {
        this.id = id;
        this.name = name;
        this.level = level;
    }
    
}