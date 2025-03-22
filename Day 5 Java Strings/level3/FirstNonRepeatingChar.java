import java.util.Scanner;

public class FirstNonRepeatingChar {
    public static char firstNonRepeating(String text) {
        for (int i = 0; i < text.length(); i++) {
            boolean unique = true;
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(i) == text.charAt(j) && i != j) {
                    unique = false;
                    break;
                }
            }
            if (unique) return text.charAt(i);
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        char result = firstNonRepeating(text);
        if (result != 0)
            System.out.println("First Non-Repeating Character: " + result);
        else
            System.out.println("No non-repeating character found.");
    }
}
