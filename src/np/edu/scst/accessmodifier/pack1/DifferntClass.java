package np.edu.scst.accessmodifier.pack1;

public class DifferntClass {
    public static void main(String[] args) {
       SameClass sc = new SameClass();
        System.out.println(sc.varPublic);
        System.out.println(sc.varDefault);
        System.out.println(sc.varProtected);
//        System.out.println(sc.varPrivate); 
        System.out.println(sc.getPrivateVariable());
//        System.out.println(sc.money);
        System.out.println(sc.balanceCheck());
    }
}
