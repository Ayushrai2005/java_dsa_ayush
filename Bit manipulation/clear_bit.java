
import java.util.*;

public class clear_bit {

    public static int clearIthBit(int n, int i) {

        int bitmask = ~(1<<i);
        return n & bitmask;

    }

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter your no to change");

        int n = scnr.nextInt();
        System.out.println("Enter ith Bit you wnt to change");
        int i = scnr.nextInt();

        System.out.println(clearIthBit(n, i));

    }

}
