import java.util.*;

public class fanc {

    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;

    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int a = scnr.nextInt();
        int b = scnr.nextInt();
        int sum = sum(a, b);

        System.out.println(sum);

    }
}
