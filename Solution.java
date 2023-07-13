import java.util.*;

public class Solution {
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("enter no a");
        int a = scnr.nextInt();
        System.out.print("enter no b");
        int b = scnr.nextInt();
        System.out.print("enter no c");
        int c = scnr.nextInt();

        float average = (a + b + c ) /  3;
        System.out.print(average);

        scnr.close();
    }
}