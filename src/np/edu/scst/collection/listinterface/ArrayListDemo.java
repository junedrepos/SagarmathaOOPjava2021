package np.edu.scst.collection.listinterface;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        Student s1 = new Student(1,"Ram","BCA");
        Student s2 = new Student(2,"Bharat","BCA");
        Student s3 = new Student(3,"Laxman","BCA");
        Student s4 = new Student(4,"Satrughan","BCA");
        //ArrayList<Classname> objName = new ArrayList();
        ArrayList<Student> arr = new ArrayList();//initialization of arrayList
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        arr.add(s4);
          for(Student                                    var                  :  arr ){
              System.out.println(var);
          }
        
        
    }
}

class Student{
    int id;
    String name;
    String program;
    
    public Student(int id, String name, String program){
        this.id = id;
        this.name = name;
        this.program = program;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", program=" + program + '}';
    }
    
}