import java.util.Scanner;

public class CharFrequencyUnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean counted = false;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) {
                    counted = true;
                    break;
                }
            }
            if (!counted) {
                int count = 0;
                for (int k = 0; k < text.length(); k++) {
                    if (text.charAt(k) == ch) count++;
                }
                System.out.println(ch + " : " + count);
            }
        }
    }
}
