package np.edu.scst.inheritance.hierarchilainheritance;

public class Child2 extends Parent{
    int childProperty2 = 50000;
    public static void main(String[] args) {
        Child2 c2 = new Child2();
        System.out.println(c2.parentProperty);
        System.out.println(c2.childProperty2);
//        System.out.println(c2.childProperty1);
    }
}
