
import java.util.Scanner;

public class classtest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("Fibonacci Series:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}

// public static void main(String[] args) {
// // Create a Scanner object to read user input
// Scanner scanner = new Scanner(System.in);

// // Prompt the user to enter the temperature
// System.out.print("Enter the temperature in Celsius: ");
// double temperature = scanner.nextDouble();

// // Determine the weather condition based on the temperature
// if (temperature >= 30.0) {
// System.out.println("It's hot outside!");
// } else if (temperature >= 20.0) {
// System.out.println("It's warm outside.");
// } else if (temperature >= 10.0) {
// System.out.println("It's cool outside.");
// } else {
// System.out.println("It's cold outside!");
// }

// // Close the Scanner
// scanner.close();
// }
// }
