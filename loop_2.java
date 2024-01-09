import java.util.*;
//code to get some og first n numbers  enter by user
public class loop_2 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enetr your range :  ");
        int n = scnr.nextInt();
        while (i <= n) {
            sum += i;
            i++;

            scnr.close();
        }
        System.out.println(sum);

    }
}
