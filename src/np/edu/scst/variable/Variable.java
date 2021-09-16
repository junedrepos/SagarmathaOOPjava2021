package np.edu.scst.variable;

//import java.lang.*;
//java.lang package is imported by default
// * = import everything withing the same level

public class Variable {
    //psvm press-tab
    public static void main(String[] args) {
//        sout press-tab
//        System.out.println("I am a variable");
//        // shift +f6
//        // datatype      variable       =  value/literal
//           int                    number     =    10;
//           int  i, j,  k =0;
//           System.out.println(k);
//           int byte=10;
//       
// datatype      variable       =  value/literal
    byte b = 1;
    short s = 2;
    int i = 1234;
    // use letter 'l' L at the last of long
    long l = 145264646l;    
    float f = 1234.567f;
    //java assumes all decimal points as double
    double d = 1234567.789;
    //single quote single character
    char c= 'a';
    boolean condition =  true; //true |false
    boolean isRainy = true;
    if(isRainy){
        System.out.println("take umbrella");
    }else{
        System.out.println("buy an icecream");
    }
    // String is class type; it starts with capital S, it must have double quotes 
    String str = "this is a normal string text";
           System.out.println("byte data type is "+ b);
           System.out.println("short data type is " + s);
           System.out.println("int data type is "+i);
           System.out.println("long byte data type is "+l);
           System.out.println("float data type is "+f);// ctrl + shift + down arrow
           System.out.println("double data type is "+d);
           System.out.println("char data type is "+c);
           System.out.println("boolean data type is "+bool);
           System.out.println("String data type is "+str);
           
        
    }
}
