package np.edu.scst.collection.stacks;
import java.util.Stack;
public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack();
        stack.push("Ram");
        stack.push("Shyam");
        stack.push("Hari");
        stack.push("Sita");
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
//        for(String var: stack){//do no use foreach for stack in exam
//            System.out.println(var);
//     }
    }
}
