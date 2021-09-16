package np.edu.scst.control.conditional;

public class SwitchCase {
    public static void main(String[] args) {
        int dayOfWeek=10;
        switch(dayOfWeek){
            case 1: {
                System.out.println("today is sunday");
                break;
            }
            case 2: {
                System.out.println("today is monday");
                 break;
            }
            case 3: {
                System.out.println("today is tuesday");
                 break;
            }
            case 4: {
                System.out.println("today is wednesday");
                 break;
            }
            case 5: {
                System.out.println("today is thursday");
                 break;
            }
            case 6: {
                System.out.println("today is friday");
                 break;
            }
            case 7: {
                System.out.println("today is saturday");
                 break;
            }
            default:{
                System.out.println("unrecognized day of the week");
            }
                
        }
    }
}
