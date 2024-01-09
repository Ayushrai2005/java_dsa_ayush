import java.util.*;

public class cnt {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        do {
            System.out.println("Enter Your Number : ");
            int n = scnr.nextInt();
            if (n % 10 == 0) {
                continue;
            }
            System.out.println("Your number is : " + n);
        } while (true);



        //Example   
        // for(int i = 1; i<5 ; i++){
        // if (i==3) {
        // continue;
        // }
        // System.out.println(i);
        // }
        // }

      
    
}
}
