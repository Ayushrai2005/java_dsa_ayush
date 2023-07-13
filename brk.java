import java.util.*;
public class brk {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        

        do{
            System.out.println("Enter Your Number : ");
            int n = scnr.nextInt();
            if(n%10==0){
            break;
        }
            System.out.println(n);
        }while(true );
   

   
    int x, y, z;
    x=y=z=2 ;
    x+=y ; y-=z ; z/=(x+y);
    System.out.println(x  + " " +  y + " "+ z );

    }
}  
