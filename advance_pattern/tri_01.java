package advance_pattern;

import java.util.*;

public class tri_01 {

    public static void tri__01(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {

            // no of digits on the line
            for (int j = 1; j <= i; j++) {

                if ((i + j) % 2 == 0) {
                    System.out.print("1");

                } else {

                    System.out.print("0");
                }

            }

            System.out.println();

        }

    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter your number of lines:  ");
        int n = scnr.nextInt();

        tri__01(n);
        scnr.close();
    }
}