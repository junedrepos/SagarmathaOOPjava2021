package np.edu.scst.classnobject.thissuper;

public class Child extends Parent{
    int instanceVar = 10;
            
    public Child(){
        super();
        System.out.println("Hello, I am child parameter less constructor");
        this.instanceMethod();
    }
    public Child(int i){
        this();
        System.out.println("Hello, I am child parameterized constructor, my parameter value is: "+i);
        System.out.println(this.parentProperty);
    }
    
    public void instanceMethod(){
        System.out.println("I am an instance method");
        System.out.println(this.instanceVar);
    }
    
    public static void main(String[] args) {
        Child c = new Child(10);
        
    }
}
