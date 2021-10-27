package np.edu.scst.collection.listinterface;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void listPrinter(List<String> a){
        System.out.println(a);
    }
    public static void main(String[] args) {
        LinkedList<String> lList = new LinkedList();
     lList.add("Ram");//0
     lList.add("Shyam");//1
     lList.add("hari");//2
     lList.add("Sita");//3
     lList.add("Ram");//4
        listPrinter(lList);
        ArrayList<String>              aList     = new ArrayList();
     aList.add("Ram");//0
     aList.add("Shyam");//1
     aList.add("hari");//2
     aList.add("Sita");//3
     aList.add("Ram");//4
        listPrinter(aList);
    }
}
