import java.util.Scanner;

public class recursion {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the number you want to Get factorial of : ");
        int n = scnr.nextInt();
        int result = factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case: 0! and 1! are both 1
        } else {
            return n * factorial(n - 1); // Recursive case: n! = n * (n-1)!
        }
    }
}

// import java.util.Scanner;
// import java.math.BigInteger;

// public class recursion {

//     public static void main(String[] args) {
//         Scanner scnr = new Scanner(System.in);
//         System.out.println("Enter the number you want to get factorial of: ");
//         long n = scnr.nextLong();
//         BigInteger result = factorial(n);
//         System.out.println("Factorial of " + n + " is: " + result);
//     }

//     public static BigInteger factorial(long n) {
//         if (n == 0 || n == 1) {
//             return BigInteger.ONE; // Base case: 0! and 1! are both 1
//         } else {
//             return BigInteger.valueOf(n).multiply(factorial(n - 1)); // Recursive case: n! = n * (n-1)!
//         }
//     }
// }
