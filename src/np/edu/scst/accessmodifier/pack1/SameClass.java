package np.edu.scst.accessmodifier.pack1;

public class SameClass {
    public int varPublic=10;
    int varDefault = 20;
    protected int varProtected = 30;
    private float varPrivate = 40;
    private double money=1000.000;
    
    public int getPrivateVariable(){
        return (int) varPrivate;
    }
    
    public double balanceCheck(){
        return money;
    }
    
    public static void main(String[] args) {
        SameClass sc = new SameClass();
        System.out.println(sc.varPublic);
        System.out.println(sc.varDefault);
        System.out.println(sc.varProtected);
        System.out.println(sc.varPrivate);
    }
    
}
