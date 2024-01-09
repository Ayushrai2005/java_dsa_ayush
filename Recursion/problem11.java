public class problem11 {

    public static int tilingProb(int n) { // 2 x n (floor size )

        // base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // kaam
        // vertical choice
        int fnm1 = tilingProb(n - 1);

        // horizontal size
        int fnm2 = tilingProb(n - 2);

        int totWays = fnm1 + fnm2;
        return totWays;

    }

    public static void main(String[] args) {
        System.out.println(tilingProb(2));

    }
}
