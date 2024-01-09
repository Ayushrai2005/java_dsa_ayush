import java.util.Scanner;

public class powerORnot {
    
    public static boolean ispowerofTwo(int n){

        return (n&(n-1)) == 0 ;

        
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter your no to check");

        int n = scnr.nextInt();
        
        System.out.println(ispowerofTwo(n));
    }

}
