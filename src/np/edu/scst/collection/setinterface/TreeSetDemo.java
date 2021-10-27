package np.edu.scst.collection.setinterface;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        //syntax
        //TreeSet<ClassName> objectName = new TreeSet();
        TreeSet<String> tSet = new TreeSet();
        tSet.add("Ram");
        tSet.add("Shyam");
        tSet.add("Sita");
        tSet.add("Laxman");
        System.out.println(tSet);
        tSet.add("Ram");
        System.out.println(tSet);
        //for (Classname  var: object)
        for(String var: tSet){
            System.out.println(var);
        }
        //tree set sorts the elements
        
        
        
    }
}
