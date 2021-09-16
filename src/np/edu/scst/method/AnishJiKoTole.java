package np.edu.scst.method;
import np.edu.scst.gau.*;
public class AnishJiKoTole {
    //psvm tab
   
    public static void cook(){
        System.out.println("khana pakaucha");
        System.out.println("khana pakyo");
        System.out.println("khana serve");
    }
    
    public static int electrician(int money){
        int serviceCharge = 300;
        System.out.println("maile bijuli banae batti aayo");
        if(money>serviceCharge){
            return  (money- serviceCharge);
        }else{
            return 0;
        }
    }
     public static void main(String[] args) {
        System.out.println("bhok lagyo");
        Tole2.garderner();
        G1.guest();
        cook();
        System.out.println(" class sakkiyo ek chin game kehlchu");
        System.out.println("battai chaina. Mistiri bolau");
        int wallet = electrician(500);
        System.out.println("mummy, electrician returned NRs. "+wallet);
        System.out.println("played games");
        System.out.println("bhok lagyo");
        cook();
        System.out.println("good night");
    }
}
