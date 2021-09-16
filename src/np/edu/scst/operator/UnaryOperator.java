package np.edu.scst.operator;

public class UnaryOperator {
    //psvm tab
    public static void main(String[] args) {
        int i = 10;
        System.out.println(i++);//keep 10 i will change after this expression
        //i=11
        
        System.out.println(i++);//keep 11 i will chage after this expression
        //i=12
        System.out.println(i--);//keep 12 i will chage after this expression
        //i=11
        System.out.println(++i);//i will change immediately i am 12 now
        
        int j = i++       +2 +    i;
        
        System.out.println(j);
        
        System.out.println(i);
        
    }
}
