package np.edu.scst.operator;

public class BitwiseOperator {
    public static void main(String[] args) {
        byte i = 10;
        byte j = 20;
        
        System.out.println(i & j);// first converts to binary; perform bitwise operation bit by bit; convert result  to decimal
        System.out.println(i | j);
                System.out.println(i ^ j);
        System.out.println(~i);// -(i+1)
        System.out.println(~4050);//-4051
        

        
    }
}
