import java.util.Scanner;

public class CalendarDisplayString {
    public static String getMonthName(int m) {
        String[] names = { "", "January", "February", "March", "April", "May", "June", "July",
                           "August", "September", "October", "November", "December" };
        return names[m];
    }

    public static boolean isLeap(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }

    public static int getDays(int m, int y) {
        int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (m == 2 && isLeap(y)) return 29;
        return days[m];
    }

    public static int startDay(int m, int y) {
        int d = 1;
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        return (d + x + (31 * m0) / 12) % 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), y = sc.nextInt();
        int days = getDays(m, y);
        int start = startDay(m, y);

        System.out.println(getMonthName(m) + " " + y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < start; i++) System.out.print("    ");
        for (int i = 1; i <= days; i++) {
            System.out.printf("%3d ", i);
            if ((i + start) % 7 == 0) System.out.println();
        }
    }
}
