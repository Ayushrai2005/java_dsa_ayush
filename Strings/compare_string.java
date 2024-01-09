public class compare_string {

    public static void main(String[] args) {

        String s1 = "tony";
        String s2 = "tony";
        String s3 = new String("tony");
        //Strings Equality check
        // if (s1 == s2) {

        //     System.out.println("Strings ar equal"); //says equal because both s1 s3 points to same tony ; 

        // } else {
        //     System.out.println("strings are not equal");
        // }

        // if (s1 == s3) {

        //     System.out.println("Strings ar equal");

        // } else {
        //     System.out.println("not equals"); //this prints because New Keyword creates a new block of memory 
        // }


        if(s1.equals(s3)){
            System.out.println("Strings are equal");
    
        }else{
            System.out.println("Not equals");
        }

    }

}
