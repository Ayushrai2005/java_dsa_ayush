package advance_pattern;

public class btrfly {
    public static void btrflyy(int n) {
        // outer loop first half
        for (int i = 1; i <= n; i++) {

            // starts = i
            for (int j = 1; j <= i; j++) {

                System.out.print("*");
            }

            // spaces = *n-1
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // starts = 1
            for (int j = 1; j <= i; j++) {

                System.out.print("*");

            }
            System.out.println();

        }
        // second half
        for (int i = n; i >= 1; i--) {
            // starts = i
            for (int j = 1; j <= i; j++) {

                System.out.print("*");
            }

            // spaces = *n-1
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // starts = 1
            for (int j = 1; j <= i; j++) {

                System.out.print("*");

            }
            System.out.println();

        }

    }

    public static void main(String[] args) {

        btrflyy(5);
    }
}