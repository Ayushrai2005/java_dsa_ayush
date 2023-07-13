import java.util.*;

public class cndition_9 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
         System.out.println(" Enter No 1  :  ");
        int a = scnr.nextInt();
        System.out.println(" Enter No 2 :  ");
        int b= scnr.nextInt();
        System.out.println(" Enter Operation :  ");
        char operator = scnr.next().charAt(0);


        switch(operator){

            case '+' : System.out.println(a+b);
                        break;
            case '-' : System.out.println(a-b);
                         break;
            case '*' : System.out.println(a*b);
                        break;
            case '/' : System.out.println(a/b);
                   break;
            case '%'  : System.out.println(a%b);
                     break;
           default : System.out.println("wrong operator");
        }





     scnr.close() ;
    }
}
