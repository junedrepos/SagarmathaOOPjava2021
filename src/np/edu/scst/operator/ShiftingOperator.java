package np.edu.scst.operator;

public class ShiftingOperator {
    //psvm + tab
    public static void main(String[] args) {
        int i =10;
        int j = -20;
        System.out.println(i>>2);// 2
        int result = i>>2;
        System.out.println(i>>3);// works on 10 results in 2
        i = i>>2; //i = 2
        System.out.println(i>>2);// 2 shift output
        System.out.println(j>>1);
        // i = 10     | 0 0 0 0 1 0 1 0| >>2  ====  | 0 0 0 0 0 0 1 0|1 0   >2
        //
        System.out.println(40>>1);//division by 2  >20
        System.out.println(40>>4);// division by 2 four times | 20   | 10  |  5 | 2
        System.out.println(-20>>1);//-10 
        System.out.println(40>>>1);//20
        System.out.println(-40>>>1);
        System.out.println((float)(200000.0/2000000.0*100)+" % complete");
        System.out.println(45<<2);//mulitply by 2 2 times
        System.out.println(-27<<1);//multiply by 2 1 times
        //assignment operator
        i = i+2;
        i += 2;//i=i+2
        i -= 2;//i = i-2
        i=i<<2;// i<<=2
        i<<=2;
    }
}
