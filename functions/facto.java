
public class facto {

    public static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;

        }
        return f;

    }

    public static int binC(int n, int r) {
        int n_fact = fact(n);
        int r_fact = fact(r);
        int n_r = fact(n - r);
        int binc = n_fact / (r_fact * n_r);
        return binc;
    }

    public static void main(String[] args) {
        System.out.println(binC(5, 2));

    }

}
