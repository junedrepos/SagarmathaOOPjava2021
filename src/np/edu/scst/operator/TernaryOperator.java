package np.edu.scst.operator;

public class TernaryOperator {
    public static void main(String[] args) {
        int i=5,j=10;
        //                 (condition)? if true: if false;
        int greatest=  (i>j)?   i   :    j   ;
        System.out.println("the greatest number is "+greatest);
    }
}
