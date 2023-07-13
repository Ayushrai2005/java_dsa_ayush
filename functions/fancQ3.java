public class fancQ3 {
    public static boolean isPalindrome(int number) {
        int reversedNumber = 0;
        int originalNumber = number;
        
        // Reverse the number
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        
        // Check if the reversed number is equal to the original number
        if (reversedNumber == originalNumber) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int number = 12321;
        boolean isPalindrome = isPalindrome(number);
        
        if (isPalindrome) {
            System.out.println(number + " is a palindrome number.");
        } else {
            System.out.println(number + " is not a palindrome number.");
        }
    }
}
