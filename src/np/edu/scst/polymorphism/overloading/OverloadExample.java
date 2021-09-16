package np.edu.scst.polymorphism.overloading;

public class OverloadExample {
    public OverloadExample(){
        System.out.println("I am paremeterless");
    }
    
    public OverloadExample(int i){
        System.out.println("I have parameteres");
    }
    
    public  void area(float radius){
        System.out.println("The area of the circle is: "+(Math.PI*radius*radius));
    }
    
    public  void area(float length, float breadth){
        System.out.println("The area of the rectangle is: "+(length * breadth));
    }
    
    public static void main(String[] args) {
       OverloadExample obj = new OverloadExample();
        obj.area(10.0f);
        obj.area(10.0f,20.0f);
    }
}
