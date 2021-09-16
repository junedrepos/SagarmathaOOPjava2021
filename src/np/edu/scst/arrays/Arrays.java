package np.edu.scst.arrays;

public class Arrays {
    //psvm
    public static void main(String[] args) {
        int c[] = {1,2,3,4};//array of size 4
        String[] str = {"Ram","Shyam","Hari","Laxman"};//array of size 4
                            //   0              1               2           3
//         for(         String              i          :     str          ){
//            System.out.println(i);
//         }   
         
//        System.out.println(str[3]);
//        str[3]="Bharat";
//        System.out.println(str[3]);
//       
//        //array.length= returns size of the array
//        for(int i = 0; i<str.length;i++){
//            System.out.println(str[i]);
//        }
        //foreach loop
        //for(datatypeOfArray variable   : arrayName){}
        
       // Datatype[] variable = new Datattype[size];
        String[]       arr         = new String[5];
        System.out.println("default values");
        for(String var : arr ){
            System.out.println(var);
        } 
        arr[3]="Ram";
        System.out.println("after adding some values");
        for(String var : arr ){
            System.out.println(var);
        }        
        
    }
}
