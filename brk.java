import java.util.*;
public class brk {
    //implementation of break ...
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        

        do{
            System.out.println("Enter Your Number : ");
            int n = scnr.nextInt();
            if(n%10==0){
            break;
        }
            System.out.println(n);
        }while(true );

    }
}  
