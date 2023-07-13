import java.util.*;
public class cnditionQ3 {
    public static void main(String[] args) {
       Scanner scnr = new Scanner(System.in);
       System.out.println("enter week number");
        int day = scnr.nextInt();

       switch (day) {
        case 1 : System.out.println("Sunday");
        break;
        case 2 : System.out.println("Monday");
        break;
        case 3 : System.out.println("tuesday");
        break;
        case 4 : System.out.println("Wednesday");
        break;
        case 5 : System.out.println("Thursday");
        break;
        case 6 : System.out.println("Friday");
        break;
        case 7 : System.out.println("Saturday");
        break;
        default : System.out.println("Not a valid day");


        scnr.close();
       }
    }
}