//java collection framework stack
import java.util.* ;

public class stackJCF{



    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);


        System.out.println("Index of Entered no is -> " + s.indexOf(3)); 

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
        System.out.println(s.indexOf(3)); 


    }
}