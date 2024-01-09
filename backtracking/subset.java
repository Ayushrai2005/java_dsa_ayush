public class subset {

    public static void findSubsets(String str, String ans, int i) {

        // baseCase
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.print("null");

            }
            System.out.println(ans);
            return;

        }

        // yes Choice
        findSubsets(str, ans + str.charAt(i), i + 1);
        // No choice
        findSubsets(str, ans, i + 1);

    }

    public static void main(String[] args) {

        String s = "abc";
        findSubsets(s, "", 0);

    }
}
