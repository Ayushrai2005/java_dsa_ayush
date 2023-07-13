public class chat {
     public static void main(String[] args) {
        String message = "AYUSH OPPPPP";
        int key = 3;
        String encryptedMessage = encrypt(message, key);
        System.out.println("Encrypted message: " + encryptedMessage);
        String decryptedMessage = decrypt(encryptedMessage, key);
        System.out.println("Decrypted message: " + decryptedMessage);
    }
     public static String encrypt(String message, int key) {
        String encryptedMessage = "";
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (Character.isUpperCase(c)) {
                c = (char) ((c + key - 65) % 26 + 65);
            } else if (Character.isLowerCase(c)) {
                c = (char) ((c + key - 97) % 26 + 97);
            }
            encryptedMessage += c;
        }
        return encryptedMessage;
    }
     public static String decrypt(String encryptedMessage, int key) {
        String decryptedMessage = "";
        for (int i = 0; i < encryptedMessage.length(); i++) {
            char c = encryptedMessage.charAt(i);
            if (Character.isUpperCase(c)) {
                c = (char) ((c - key - 65 + 26) % 26 + 65);
            } else if (Character.isLowerCase(c)) {
                c = (char) ((c - key - 97 + 26) % 26 + 97);
            }
            decryptedMessage += c;
        }
        return decryptedMessage;
    }
}