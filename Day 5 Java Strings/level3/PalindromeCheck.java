import java.util.Scanner;

public class PalindromeCheck {
    public static boolean isPalindrome1(String text) {
        int n = text.length();
        for (int i = 0; i < n / 2; i++) {
            if (text.charAt(i) != text.charAt(n - i - 1)) return false;
        }
        return true;
    }

    public static boolean isPalindrome2(String text) {
        StringBuilder rev = new StringBuilder(text).reverse();
        return text.equals(rev.toString());
    }

    public static boolean isPalindrome3(String text) {
        String lower = text.toLowerCase().replaceAll("[^a-z0-9]", "");
        return isPalindrome1(lower);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println("Palindrome (loop): " + isPalindrome1(text));
        System.out.println("Palindrome (reverse): " + isPalindrome2(text));
        System.out.println("Palindrome (ignore cases & symbols): " + isPalindrome3(text));
    }
}
