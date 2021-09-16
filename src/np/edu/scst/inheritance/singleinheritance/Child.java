package np.edu.scst.inheritance.singleinheritance;

public class Child extends Parent{
    int childProperty = 100000;
    //
      public static void main(String[] args) {
        Child c = new Child();
          System.out.println(c.eyeColor);
          System.out.println(c.property);
          System.out.println(c.childProperty);
          c.car();
          
          Parent p = new Parent();
          System.out.println(p.eyeColor);
        // System.out.println(p.childProperty);
         // throw error coz parent cannot inherit property of child
    }
}
