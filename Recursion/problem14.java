import java.util.*;

public class problem14 {

    public static void printBinStrings(int n, int lastPlace, String str) {
        // base case
        if (n == 0) {
            System.out.println(str);
            return;
        }
        // lkaam
        printBinStrings(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            printBinStrings(n - 1, 1, str + "1");
        }

    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("ENter no of Terms n : ");
        int n = scnr.nextInt();

        System.out.println("Total no of combinations are : ");

        printBinStrings(n, 0, "");

    }
}