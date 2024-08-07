public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 12321;
        int original = number;
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        if (original == reversed) {
            System.out.println("The number " + original + " is a palindrome.");
        } else {
            System.out.println("The number " + original + " is not a palindrome.");
        }
    }
}
