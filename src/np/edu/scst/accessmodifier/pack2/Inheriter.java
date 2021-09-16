package np.edu.scst.accessmodifier.pack2;
import np.edu.scst.accessmodifier.pack1.SameClass;
public class Inheriter extends SameClass {
    public static void main(String[] args) {
        SameClass sc = new SameClass();
        System.out.println(sc.varPublic);
    Inheriter i = new Inheriter();
        System.out.println(i.varProtected);
//        System.out.println(i.varDefault);
//        System.out.println(i.varPrivate);
    
    }
}
