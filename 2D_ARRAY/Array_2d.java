import java.util.*;

public class Array_2d {
    // search
    public static boolean search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Found at cell (" + i + "," + j + ")");
                    return true;
                }
            }

        }
        System.out.println("key not found");
        return false;
    }

    // largst
    public static int findLargest(int matrix[][]) {
        int largest = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > largest) {
                    largest = matrix[i][j];
                }
            }
        }
        return largest;
    }

    // smallst
    public static int findSmallest(int matrix[][]) {
        int smallest = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < smallest) {
                    smallest = matrix[i][j];
                }
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("enter the no of rows ");// int n = matrix.length {to get no of rows}
        int n = scnr.nextInt(); // int m = matrix[0].length {to get no of colums}
        System.out.println("enter the no of coloumns");
        int m = scnr.nextInt();

        int matrix[][] = new int[n][m];

        System.out.println("Enter elements of the 2D array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scnr.nextInt();
            }
        }

        // output
        System.out.println("The 2D array is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter your key to search");
        int key = scnr.nextInt();
        search(matrix, key);

        //
        int largest = findLargest(matrix);
        int smallest = findSmallest(matrix);

        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);

        scnr.close();
    }
}