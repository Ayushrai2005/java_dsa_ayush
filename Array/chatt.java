import java.security.SecureRandom;
import java.util.Scanner;

public class chatt {
    private static final String LOWERCASE_CHARACTERS = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()-_=+[]{}<>.,?/:;";

    private static SecureRandom random = new SecureRandom();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the desired length of the password: ");
        int length = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Include lowercase characters? (y/n): ");
        boolean includeLowercase = scanner.nextLine().equalsIgnoreCase("y");

        System.out.print("Include uppercase characters? (y/n): ");
        boolean includeUppercase = scanner.nextLine().equalsIgnoreCase("y");

        System.out.print("Include numbers? (y/n): ");
        boolean includeNumbers = scanner.nextLine().equalsIgnoreCase("y");

        System.out.print("Include special characters? (y/n): ");
        boolean includeSpecialCharacters = scanner.nextLine().equalsIgnoreCase("y");

        String generatedPassword = generatePassword(length, includeLowercase, includeUppercase, includeNumbers, includeSpecialCharacters);
        System.out.println("Generated Password: " + generatedPassword);

        scanner.close();
    }

    private static String generatePassword(int length, boolean includeLowercase, boolean includeUppercase,
            boolean includeNumbers, boolean includeSpecialCharacters) {
        StringBuilder password = new StringBuilder();
        String characters = "";

        if (includeLowercase) {
            characters += LOWERCASE_CHARACTERS;
            password.append(getRandomCharacter(LOWERCASE_CHARACTERS));
        }

        if (includeUppercase) {
            characters += UPPERCASE_CHARACTERS;
            password.append(getRandomCharacter(UPPERCASE_CHARACTERS));
        }

        if (includeNumbers) {
            characters += NUMBERS;
            password.append(getRandomCharacter(NUMBERS));
        }

        if (includeSpecialCharacters) {
            characters += SPECIAL_CHARACTERS;
            password.append(getRandomCharacter(SPECIAL_CHARACTERS));
        }

        for (int i = password.length(); i < length; i++) {
            password.append(getRandomCharacter(characters));
        }

        shuffleString(password.toString());

        return password.toString();
    }

    private static char getRandomCharacter(String characters) {
        int randomIndex = random.nextInt(characters.length());
        return characters.charAt(randomIndex);
    }

    private static void shuffleString(String str) {
        char[] charArray = str.toCharArray();

        for (int i = charArray.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }

        System.out.println("Shuffled Password: " + new String(charArray));
    }
}
