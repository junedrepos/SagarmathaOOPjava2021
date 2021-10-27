package np.edu.scst.collection.dictionary;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
public class TableDemo {
    public static void main(String[] args) {
        Dictionary<String, String> dict = new Hashtable();
//        Hashtable<Integer, String> htable = new Hashtable();
        dict.put("apple", "a type of fruit");
        dict.put("ball", "a type of toy");
        dict.put("cat", "a type of furball animal");
        
        System.out.println(dict.get("apple"));
//        Enumeration<String> enumeration = dict.keys();
//        while(enumeration.hasMoreElements()){
//            String word = enumeration.nextElement();
//            System.out.println(word+"  :   "+dict.get(word ));
//        }
       
        
        
    }
}
