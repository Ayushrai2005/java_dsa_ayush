import java.util.*;

public class cndition_8 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("enter your marks");

        int marks = scnr.nextInt();
        String result = (marks > 33) ? "You are pass" : "You are fail";

        System.out.println(result);

        scnr.close();

    }
}
