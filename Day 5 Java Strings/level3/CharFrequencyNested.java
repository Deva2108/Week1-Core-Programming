import java.util.Scanner;

public class CharFrequencyNested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        boolean[] visited = new boolean[text.length()];
        for (int i = 0; i < text.length(); i++) {
            if (visited[i]) continue;
            int count = 1;
            for (int j = i + 1; j < text.length(); j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(text.charAt(i) + " : " + count);
        }
    }
}
