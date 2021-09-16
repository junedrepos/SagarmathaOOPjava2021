package np.edu.scst.operator;

public class LogicalOperator {
    //psvm
    public static void main(String[] args) {
       boolean isSunny=true;
       boolean isRainy=false;
       boolean isWindy = true;
       if(isSunny || isRainy){// or either one condition needs to be true
           System.out.println("take umbrella");
       }else if(isRainy && isWindy){// compulsarilty both needs to be true 
           System.out.println("take raincoat");
       }else if(!isSunny){// not flips the result
           System.out.println("take boot");
       }
       
    }
}
