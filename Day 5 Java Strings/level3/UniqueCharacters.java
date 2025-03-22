import java.util.Scanner;

public class UniqueCharacters {
    public static int getLength(String text) {
        int len = 0;
        try {
            while (true) {
                text.charAt(len);
                len++;
            }
        } catch (Exception e) {
        }
        return len;
    }

    public static char[] findUnique(String text) {
        int n = getLength(text);
        char[] result = new char[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (unique) result[k++] = text.charAt(i);
        }
        char[] finalResult = new char[k];
        for (int i = 0; i < k; i++) finalResult[i] = result[i];
        return finalResult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        char[] unique = findUnique(text);
        for (char c : unique) {
            System.out.print(c + " ");
        }
    }
}
