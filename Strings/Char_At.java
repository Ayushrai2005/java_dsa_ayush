public class Char_At {

    // To print full Characters
    public static void printletters(String Fullname) {

        for (int i = 0; i < Fullname.length(); i++) {

            System.out.print(Fullname.charAt(i) + " ");
        }

    }

    public static void main(String[] args) {
        String Firstname = "Ayush";
        String Lastname = "Rai";

        String Fullname = Firstname + " " + Lastname;
        System.out.println(Fullname.charAt(0));
        System.out.println(Firstname);

        // To get full letters
        printletters(Fullname);

    }
}
