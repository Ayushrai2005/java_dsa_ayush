import java.util.*;

public class oddEven {

    public static void odd_even(int n) {
        int bitmask = 1;

        if ((n & bitmask) == 0) {
            // even no
            System.out.println( n + "  Is an Even no ");
        } else {
            System.out.println(n + " Is an Odd no");
        }

    }

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter your no to check");
        int n = scnr.nextInt();
        odd_even(n);

        System.out.println();

        scnr.close();
    }
}