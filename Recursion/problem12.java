public class problem12 {

    public static void remDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {

        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        // kaam

        char currChar = str.charAt(idx);

        // if (map[currChar - 'a'] == true) {
        //     // duplicate
        //     remDuplicates(str, idx + 1, newStr, map);
        // } else {
        //     map[currChar - 'a'] = true;
        //     remDuplicates(str, idx + 1, newStr.append(currChar), map);
        // }

       
       //chat gpt
        if (!map[currChar - 'a']) {
            map[currChar - 'a'] = true;
            newStr.append(currChar);
        }

        remDuplicates(str, idx + 1, newStr, map);
        //chat gpt

    }

    public static void main(String[] args) {

        String str = "appnacollege";
        remDuplicates(str, 0, new StringBuilder(""), new boolean[26]);

    }
}
