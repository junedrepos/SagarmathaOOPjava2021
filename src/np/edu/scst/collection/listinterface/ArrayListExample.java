package np.edu.scst.collection.listinterface;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
    //ArrayList<Classname> objName = new ArrayList();
     ArrayList<String>              aList     = new ArrayList();
     ArrayList<Integer> numList = new ArrayList();
     aList.add("Ram");//0
     aList.add("Shyam");//1
     aList.add("hari");//2
     aList.add("Sita");//3
     aList.add("Ram");//4
      //System.out.println(aList); //[Ram, Shyam, hari, Sita, Ram]
//        System.out.println(aList.get(1)); //Shyam
        // for(ClassType/VariableType variableName : objectName)
        System.out.println("before adding");  
        System.out.println(aList);
        aList.add(3,"Ravi");
        System.out.println("after adding");  
        System.out.println(aList);
        aList.remove(3);
        System.out.println("after removing");  
        System.out.println(aList);
        Collections.sort(aList);
        System.out.println("after sorting");
        System.out.println(aList);
        
    }
}
