package advance_pattern;

import java.util.*;

public class floyd_tri {
    public static void Floyd(int n) {

        int counter = 1;
        // outer loop
        for (int i = 1; i <= n; i++) {
            // how many times will counter printed
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter your number of lines:  ");
        int n = scnr.nextInt();
        Floyd(n);

        scnr.close();
    }

}
