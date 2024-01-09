import java.util.Scanner;

public class i_thBit {

    public static int getIthbit(int n, int i) {

        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            return 0;

        } else {
            return 1;
        }

    }

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter your no to check");

        int n = scnr.nextInt();
        System.out.println("Enter ith Bit you wnt ");
        int i = scnr.nextInt();

       

        System.out.println(getIthbit(n, i));

    }

}
