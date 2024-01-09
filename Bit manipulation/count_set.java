import java.util.Scanner;

public class count_set {

    public static int CountsetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;

            }
            n = n >> 1;

        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter your no to check");

        int n = scnr.nextInt();
        System.out.println(CountsetBits(n));

    }
}
