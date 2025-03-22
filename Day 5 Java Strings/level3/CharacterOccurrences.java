import java.util.Scanner;

public class CharacterOccurrences {
    public static int[] findAllIndexes(String text, char ch) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ch) count++;
        }
        int[] indexes = new int[count];
        int j = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ch) {
                indexes[j++] = i;
            }
        }
        return indexes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        char ch = sc.next().charAt(0);
        int[] indexes = findAllIndexes(text, ch);
        for (int i : indexes) {
            System.out.print(i + " ");
        }
    }
}
