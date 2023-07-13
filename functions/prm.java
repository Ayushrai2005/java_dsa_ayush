
import java.util.*;

public class prm {

    // public static boolean isprime(int n) {

    // boolean isprime = true;
    // for (int i = 2; i <= n - 1; i++) {

    // if (n % i == 0)
    // isprime = false;
    // break;

    // }
    // return isprime;



    public static boolean isprime(int n) {
        if (n==2){
            return true ; 
        }

        boolean isprime = true;
        for (int i = 2; i <=Math.sqrt(n) ; i++ ) {

            if (n % i == 0){
            return false;
            }
        }
        return isprime ;
    }

    public static void primesinrange(int n) {

        for(int i = 2; i<=n ; i++ ){
            if (isprime(i)){
                System.out.print( " " + i);
            }
        }
        System.out.println();
        
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("ENter your Number : ");
        int n = scnr.nextInt();

        primesinrange(n);
        scnr.close();
    }

}
