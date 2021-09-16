package np.edu.scst.control.conditional;

public class IfElse {
    
    public static void main(String[] args) {
        boolean isRainy= false;
                System.out.println("lets go out to walk");
        if(isRainy){
            System.out.println("take umbrella");
        }
        System.out.println("nice walk");
        
        int i=5,j=10,k=15;
        
        int greatest=0;
        if(i>j){
            greatest=i;
        }        else{
            greatest=j;
        }
        System.out.println("the greatest number is"+greatest);
        
        if(i>j && i>k){
            System.out.println("the greatest number is "+i);
        }else if(j>k && j>i){
            System.out.println("the greatest number is "+j);
        }else{
            System.out.println("the greatest number is "+k);
        }
        
        //use nested if-else blocks to find the greatest number among these 3; i,j,k
        if(i>j){
            if(i>k){
                System.out.println("the greatest number is "+i);
            }else{
            System.out.println("the greetest number is "+k);
            }
        }else if(j>k){
            if(j>i){
                System.out.println("the greatest number is"+j);
            }else{
                System.out.println("the greatest number is"+i);
            }
        }
        //durgasoft
        //naveen reddy || telusko learning
    }
}
