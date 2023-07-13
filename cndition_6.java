
import java.util.*;

public class cndition_6 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter A : ");
        int a = scnr.nextInt();
        System.out.println("Enter B : ");
        int b = scnr.nextInt();
        System.out.println("Enter C : ");
        int c = scnr.nextInt();

        if (a > b && a > c) {
            System.out.println("A is greater ");

        }

        else if (b > c) {
            System.out.println("B is greater");

        } else {
            System.out.println("C is greater");
        }

        scnr.close();
    }

}
