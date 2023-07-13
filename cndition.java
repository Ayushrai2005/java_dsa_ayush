import java.util.*;

public class cndition {
    public static void main(String[] args) {
        System.out.println("Enter any number");
        Scanner scnr = new Scanner(System.in);
        int income = scnr.nextInt();
        if(income<500000){
            System.out.println("you are too Gareeb to pay tax ");

        }
        else if(income>500000 && income<1000000){
            System.out.println( "the tax is "   +  ((int) (income*0.2)) + "  CHup chap pura pay kardena");
        }
        else{
            System.out.println( "the tax is hhe " + ( (int)(income*0.3)));
        
        
        }
scnr.close();
    
}

}