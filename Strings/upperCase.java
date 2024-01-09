public class upperCase {
    public static String toUpperCase(String str) {

        StringBuilder sbr = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sbr.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sbr.append(str.charAt(i));
                i++;
                sbr.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sbr.append(str.charAt(i));
            }

        }
        return sbr.toString();

    }

    public static void main(String[] args) {
        String str = "i am ayush rAi";
        System.out.println(toUpperCase(str));
    }
}