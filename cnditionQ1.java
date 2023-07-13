import java.util.*;

public class cnditionQ1 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("enter no to check ");
        int n = scnr.nextInt();
        String type = (n > 0) ? "positive" : "negative";
        System.out.println(type);

        scnr.close();
    }
}
