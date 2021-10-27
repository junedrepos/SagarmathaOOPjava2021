package np.edu.scst.collection.vectors;
import java.util.Vector;
public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> vector = new Vector();
        vector.add("Ram");
        vector.add("Sita");
        vector.add("Hari");
        vector.add("Ram");
        System.out.println(vector);
        System.out.println(vector.get(0));
        
        
        
    }
}
