public class fancQ2 {

    public static boolean isEven(int n) {
        boolean isEven = true;

        if (n % 2 != 0) {
            isEven = false;

        }
        System.out.println(isEven);
        return isEven;
    }

    public static void main(String[] args) {
        isEven(5);
    }
}