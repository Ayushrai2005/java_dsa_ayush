import java.util.Scanner;

public class last_bit {
    public static int clearIBits(int n , int i){

        int bitmask = (~0)<<i ;
        return n & bitmask ;
    }

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter your no to check");

        int n = scnr.nextInt();
        System.out.println("Enter last ith Bit you wnt ");
        int i = scnr.nextInt();

        System.out.println(clearIBits(n, i));
    }
}