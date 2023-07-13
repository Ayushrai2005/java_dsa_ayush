
import java.util.*;

public class deci {
    public static void dectobin(int n){
        int pow = 0 ;
        int binnum = 0 ; 
        int mynum = n ;
        while(n>0){

            int rem = n% 2 ;
            binnum = binnum + (rem * (int)Math.pow(10 , pow ));
            pow ++ ;
            n /= 2 ; 
        }

        System.out.println("binary form of " + mynum + " =" + binnum);
    }

    public static void main(String[] args) {
        System.out.println("Enter the number you want to convert :");
        Scanner scnr = new Scanner(System.in); 

        int n = scnr.nextInt();
        dectobin(n);
    scnr.close();
    }
    
}
