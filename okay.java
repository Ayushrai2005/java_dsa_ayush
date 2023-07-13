import java.util.*;

public class okay {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter your word to print");
        String a = scnr.nextLine();

        System.out.println("Enter your range");
        int n = scnr.nextInt();
        long sr = 1;
        long i;

        for (i = 0; i < n; i++) {
            System.out.println(sr++ + ") " + a);
        }

        scnr.close();
    }
    
}