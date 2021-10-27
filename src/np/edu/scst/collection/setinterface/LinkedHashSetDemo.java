package np.edu.scst.collection.setinterface;
import java.util.Collections;
import java.util.LinkedHashSet;
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet();
        lhs.add("Ram");
        lhs.add("Shyam");
        lhs.add("Sita");
        lhs.add("Hari");
        System.out.println(lhs);
        lhs.add("Ram");
        System.out.println(lhs);
        lhs.remove("Shyam");
        System.out.println(lhs);
        
//        Collections.sort(;
        
        //stores the element in the normal sequence
        

        
    }
}
