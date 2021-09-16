package np.edu.scst.classnobject;

public class Factory {
    public static void main(String[] args) {
        //ClassName  objectName  = new ClassName();
          Mobile           nokia             = new Mobile(2,4500,"Goodone","3310",true);
              
          System.out.println("Mobile specs: ");
          System.out.println("ram: "+nokia.ram );
          System.out.println("model: "+nokia.model );
          System.out.println("battery: "+nokia.battery );
          System.out.println("Is wifi enabled: "+nokia.isWifi );
          nokia.call();
          nokia.playGame();
           
          Mobile samsung = new Mobile(3,5000,"best","x1",true);
         System.out.println("Ram: "+ samsung.ram);
          System.out.println("Is wifi enabled: "+samsung.isWifi);
          samsung.call();
          
          
          
    }
}
