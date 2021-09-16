package np.edu.scst.inheritance.multilevelinheritance;

public class Child extends Parent{
    int childProperty = 50000;
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println(c.grandProperty);
        System.out.println(c.parentProperty);
        System.out.println(c.childProperty);
    }
    
}
