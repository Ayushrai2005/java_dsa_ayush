import java.util.Scanner;

public class update_bit {

    public static int setIthBit(int n, int i) {

        int bitmask = 1 << i;
        return n | bitmask;

    }

    public static int clearIthBit(int n, int i) {

        int bitmask = ~(1 << i);
        return n & bitmask;

    }

    public static int updateiIthBit(int n, int i, int newBit) {

        // if (newBit == 0) {
        // return clearIthBit(n, i);

        // } else {
        // return setIthBit(n, i);
        // }

        n = clearIthBit(n, i);
        int bitmask = newBit << i;
        return n | bitmask;

    }

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter your no to change");

        int n = scnr.nextInt();
        System.out.println("Enter ith Bit you wnt to change");
        int i = scnr.nextInt();

        System.out.println("Enter the value 0 or 1 : ");
        int v = scnr.nextInt();

        System.out.println(updateiIthBit(n, i, v));
        scnr.close();
    }
}
