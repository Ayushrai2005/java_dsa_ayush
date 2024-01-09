public class stringCompress {
    public static String Compression(String str) {
        String newStr = "";

        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;

            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;

            }

            newStr += str.charAt(i); // write the original char to the new string
            if (count > 1) {
                newStr += count.toString(); // write /add counts to new string after orginal char
            }

        }
        return newStr.toString();

    }

    public static void main(String[] args) {

        String str = "aaaabbbccdrrr";
        System.out.println(Compression(str));

    }
}
