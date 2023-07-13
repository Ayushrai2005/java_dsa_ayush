public class fancQ5 {


      public static void main(String[] args) {
        int n = 124 ;

        System.out.println("the sum is " + sumdigits(n));
    }



    public static int sumdigits(int n) {
        int sumofdigits = 0;
        while(n>0){

            int lastdigits = n % 10 ;
            sumofdigits += lastdigits ;
            n/=10 ;
        }

        return sumofdigits ;
    }

}