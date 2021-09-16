package np.edu.scst.control.loop;

public class BreakContinue {
    public static void main(String[] args) {
         //stop the loop when 7 comes
//        for(int i=0; i<=10;i++){
//             if(i==7){
//                System.out.println("7 has come");
//                break;
//            }
//            System.out.println(i);
//           
//        }
//print only the odd numbers
        for(int i=1;i<20;i++){
            if(i%2==0){
                continue;
            }
            System.out.println(i);
            
        }
    }
}
