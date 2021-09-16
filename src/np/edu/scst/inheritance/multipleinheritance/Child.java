package np.edu.scst.inheritance.multipleinheritance;

public class Child extends Parent1, Parent2{
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println(c.eyeColor);
    }
}
