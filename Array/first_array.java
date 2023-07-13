
import java.util.*;

public class first_array {

    public static void main(String[] args) {

        int marks[] = new int[10];
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter Your physics marks");
        marks[0] = scnr.nextInt();
        System.out.println("Enter Your chemistry marks");
        marks[1] = scnr.nextInt();
        System.out.println("Enter Your mathematics marks");
        marks[2] = scnr.nextInt();

        System.out.println(" Your Marks in physics  :" + marks[0]);
        System.out.println("  Your Marks in chemistry :" + marks[1]);
        System.out.println("  Your Marks in MAthematics :" + marks[2]);

        System.out.println("percentage " + (marks[0] + marks[1] + marks[2]) / 3 + "%");

        // code to get lenght of an arrray
        System.out.println("length of an array = " + marks.length);

        scnr.close();
    }
}