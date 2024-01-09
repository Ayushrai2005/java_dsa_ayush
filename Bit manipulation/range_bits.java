import java.util.Scanner;

public class range_bits {
    public static int clearIBits(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        int bitmask = a | b;
        return n & bitmask;

    }

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter your no to check");

        int n = scnr.nextInt();
        System.out.println("Enter thr star6ing index to clear :");
        int i = scnr.nextInt();

        System.out.println("Enter the ending index to clear : ");
        int j = scnr.nextInt();

        System.out.println(clearIBits(n, i, j));

    }
}