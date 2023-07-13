package advance_pattern;

public class rhombs {

    public static void rhombas(int n) {

        // outer loop
        for (int i = 1; i <=n; i++) {
            // spaces
            for (int j = 1; j <= n - i ; j++) {
                System.out.print(" ");

            }

            for (int j = 1; j<=n; j++) {
                System.out.print("* ");

            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        rhombas(5);
    }

}
