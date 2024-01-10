
import java.util.* ;
public class Stringss{

    public static void main(String[] args) {
        char ch[]= {'a' , 'b' , 'c' ,'d'} ;
        String str = "Abcd" ;
        String str2 = new String("XYZ") ;
        
        //Strings are Immutable in java 


        //Class 2 { Input /output}
        Scanner scnr = new Scanner( System.in) ;
        String name = scnr.nextLine() ;
        System.out.println(name);
        
    
        
        //Class 3 { String length}
        String Myname = "Vaibhav Khare" ;
        int Length = Myname.length() ;
        System.out.println(Length);
        System.out.println("lenght is " + Myname.length());



    }

}