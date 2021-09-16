package np.edu.scst.classnobject;

public class Mobile {// PascalCase
    //properties
    int ram;
    int battery;
    String processor;
    String model;
    boolean isWifi = true;
//    use PascalCase for: Class name, Project Name, Enum
//     use CamelCase: variableName, MethodName
//             lowercase: package name
//                     CAPITALCASE: CONSTANT
//    public Mobile(){} default constructor
    //constructor
    public Mobile(){  // parameterless constructor
        System.out.println("A mobile is created");
    }
    //constructor overloading
    //parametarized constructor
    public Mobile(int ram, int battery, String processor, String model, boolean isWifi){
        this.ram = ram;
        this.battery = battery;
        this.processor = processor;
        this.model= model;
        this.isWifi = isWifi;
    }
    
    
    
    //methods
    public void call(){
        System.out.println("tring tring " +model);
    }
    public void playGame(){
        System.out.println("playing");
    }
//    Create a class by modelling any real world 
//            entity of your choice. 
//    And create its 2 objects and initialize it.
    
}
