package advance_pattern;

public class prmid {
    public static void in_rotated_hf_prmid(int n) { // n represent lines of the pyramid

        // outer loop
        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= i; j++) {

                System.out.print("*");
            }

            System.out.println();

        }
    }

    public static void main(String[] args) {
        in_rotated_hf_prmid(45);
    }
}