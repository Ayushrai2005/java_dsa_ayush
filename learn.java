import java.util.*;

public class learn {

    public static void main(String args[]) {

        Scanner scnr = new Scanner(System.in);

        System.out.print("ENTER NO A ");

        int a = scnr.nextInt();
        System.out.print("ENTER NO B ");

        int b = scnr.nextInt();

        int sum = (a + b);

        System.out.print("SUM OF A AND B IS ");

        System.out.println(sum);

        scnr.close();

    }

}