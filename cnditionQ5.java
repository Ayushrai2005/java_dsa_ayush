
import java.util.*;
//code to check leap year or not 

public class cnditionQ5 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter year to check");
        int year = scnr.nextInt();

        if (year % 4 == 0 && (year % 100 != 0 || (year % 100 == 0 && year % 400 == 0))) {
            System.out.println("this is leap year ");
        } else {
            System.out.println("this is not a leap year ");
        }

        scnr.close();

    }
}