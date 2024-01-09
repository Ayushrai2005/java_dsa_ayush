public class problem5{

    

    public static int fib(int n){
        if(n==0 || n == 1){
        return n ;
    }

        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 + fnm2 ;
        return fn ;
    }

    public static void main(String[] args) {
        int  n= 10;
        System.out.println(fib(n));
        

    }


}


// import java.util.Scanner;

// public class problem5 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the number of terms in Fibonacci series: ");
//         int terms = scanner.nextInt();

//         int firstTerm = 0, secondTerm = 1, nextTerm;
//         int count = 0;

//         System.out.println("Fibonacci Series:");

//         while (count < terms) {
//             System.out.print(firstTerm + " ");

//             nextTerm = firstTerm + secondTerm;
//             firstTerm = secondTerm;
//             secondTerm = nextTerm;

//             count++;
//         }
//     }
// }
