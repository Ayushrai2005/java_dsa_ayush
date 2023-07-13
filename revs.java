public class revs {
    public static void main(String[] args) {
        int n = 108745;
        int rev = 0;

        while (n > 0) {
            int lastdigit = n % 10;
            rev = (rev * 10) + lastdigit;
            n = n / 10;
        }

        System.out.println(rev);

        // Ayush personal code
        // int lastdigit = n % 10;
        // rev = (rev * rev) + lastdigit;
        // System.out.print(lastdigit);

        // n /= 10;
        // lastdigit = n % 10;
        // rev = (rev * 10) + lastdigit;
        // System.out.print(lastdigit);

        // n /= 10;
        // lastdigit = n % 10;
        // rev = (rev * 10) + lastdigit;
        // System.out.print(lastdigit);

        // n /= 10;
        // lastdigit = n % 10;
        // rev = (rev * 10) + lastdigit;
        // System.out.print(lastdigit);
        // n /= 10;
        // lastdigit = n % 10;
        // rev = (rev * 10) + lastdigit;
        // System.out.print(lastdigit);

    }
}
