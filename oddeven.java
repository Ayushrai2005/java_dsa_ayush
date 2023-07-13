import java.util.*;

public class oddeven {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int integer = scnr.nextInt();
        int evenSum = 0;
        int oddSum = 0;
        while (integer > 0) {
            int ld = integer % 10;
            if (ld % 2 == 0) {
                evenSum += ld; //evenSum = evenSum + ld;
            } else {
                oddSum += ld; //oddSum = oddSum + ld;
            }
            integer = integer / 10;
        }
        System.out.println("Even Sum is: " + evenSum);
        System.out.println("Odd Sum is: " + oddSum);
    }

}
        // int number;
        // int choice;
        // int evensum = 0;
        // int oddsum = 0;

        // Scanner scnr = new Scanner(System.in);
        // do {
        //     System.out.println("enter your number");
        //     number = scnr.nextInt();

        //     if (number % 2 == 0) {
        //         evensum += number;
        //     } else {
        //         oddsum += number;
        //     }

        //     System.out.println("Do you want to continue press 1 else press 2 for no ");

        //     choice = scnr.nextInt();

        // }

        // while (choice == 1);
        
        //     System.out.println("Sum of even Numbers " + evensum);
        //     System.err.println("Sum of odd Numebrs " + oddsum);

        //     scnr.close();
        
