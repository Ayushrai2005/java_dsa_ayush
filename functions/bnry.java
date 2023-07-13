import java.util.*;
public class bnry{
public static void binTodec(int binNum){

    int pow = 0 ;
    int decNum = 0 ;
    int mynum = binNum ;

    while(binNum>0 ){

        int lastdigit = binNum % 10 ;
        decNum = decNum + (lastdigit * (int)Math.pow(2, pow ));
        pow ++ ;
        binNum = binNum/10 ;
    }

    System.out.println("decimal of " + mynum + "= " + decNum);
}

public static void main(String[] args) {
    System.out.println("enter your Binary Number ");
Scanner scnr = new Scanner (System.in);
int binNum = scnr.nextInt();
    binTodec(binNum);
}

}
