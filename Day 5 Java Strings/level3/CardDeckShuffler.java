import java.util.Random;

public class CardDeckShuffler {
    public static void main(String[] args) {
        String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
        String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10",
                           "Jack", "Queen", "King", "Ace" };
        String[] deck = new String[52];

        for (int i = 0; i < 52; i++) {
            deck[i] = ranks[i % 13] + " of " + suits[i / 13];
        }

        Random r = new Random();
        for (int i = 0; i < 52; i++) {
            int j = r.nextInt(52);
            String temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }

        for (int i = 0; i < 4; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (int j = 0; j < 9; j++) {
                System.out.println(deck[i + j * 4]);
            }
            System.out.println();
        }
    }
}
