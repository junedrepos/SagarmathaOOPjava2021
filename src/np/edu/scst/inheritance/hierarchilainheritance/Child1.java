package np.edu.scst.inheritance.hierarchilainheritance;

public class Child1 extends Parent{
    int childProperty1 = 30000;
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        System.out.println(c1.parentProperty);
        System.out.println(c1.childProperty1);
    }
}
