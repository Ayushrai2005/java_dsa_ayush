
import java.util.*;

public class loop {
    public static void main(String[] args) {
        System.out.println("Enter Your range :  ");
        int n = 1;
        Scanner scnr = new Scanner(System.in);
        int range = scnr.nextInt();

        while (n <= range) {
            if(n==3){
                n++;
                continue;
            }
            System.out.println(n);
            n++;

            scnr.close();
        }

    }
}
