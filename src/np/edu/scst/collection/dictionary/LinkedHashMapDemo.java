package np.edu.scst.collection.dictionary;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> lhm = new LinkedHashMap();
                                //   key       value
                                // word       meaning
        lhm.put(101,"Ram");
        lhm.put(102,"Shyam");
        lhm.put(103,"Hari");
        lhm.put(104,"Sita");
                                        //returns value of key 3
        System.out.println(lhm.get(103));//Hari
        
        for(Integer key: lhm.keySet()){
            System.out.println(key+"  :  "+lhm.get(key));
        }
        lhm.put(103, "Laxman");//overwrite
        for(String value: lhm.values()){
            System.out.println(value);
        }
        
        LinkedHashMap<String,String> lhm2 = new LinkedHashMap();
        lhm2.put("apple", "a type of fruit");
        lhm2.put("ball", "a type of toy");
        lhm2.put("cat", "a type of furball animal");
        System.out.println(lhm2);
        //linked hash map doesnot sorts
        //tree map sorts on the basis of key data
        //hash map appears to sort, sorts according to ASCII or Unicode encoding based on key data
    }
}
