public class problem10 {

    public static int optimizedPow(int a, int n) {
        if (n == 0) {
            return 1;
        }

        // It is still bog oh of n
        // int halfPowersq = optimizedPow(a, n / 2) * optimizedPow(a, n / 2);

        // so to optimizr it as big oh of log n
        int halfpower = optimizedPow(a, n / 2);
        int halfPowersq = halfpower * halfpower;

        // n is odd
        if (n % 2 != 0) {
            halfPowersq = a * halfPowersq;

        }
        return halfPowersq;

    }

    public static void main(String[] args) {

        int a = 2;
        int n = 10;

        System.out.println(optimizedPow(a, n));
    }
}
