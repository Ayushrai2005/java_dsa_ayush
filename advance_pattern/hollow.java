package advance_pattern;

public class hollow {
    public static void print_hollow(int totrow, int totcols) {

        // outer loop
        for (int i = 1; i <= totrow; i++) {

            //inner coloums
            for (int j = 1; j <= totcols; j++) {

                //cell 

                if (i == 1 || i == totrow || j == 1 || j == totcols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        print_hollow(4, 5);
    }
}