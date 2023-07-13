import java.util.*;
public class input {
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("enetr Radius");
        float rds = scnr.nextFloat();
        
        float area = (3.14f * rds * rds);
        
        System.out.print(area);



        scnr.close();
        
    }
}