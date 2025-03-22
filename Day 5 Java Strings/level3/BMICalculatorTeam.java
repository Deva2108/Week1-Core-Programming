import java.util.Scanner;

public class BMICalculatorTeam {
    public static String[][] computeBMI(double[][] people) {
        String[][] result = new String[10][4];
        for (int i = 0; i < people.length; i++) {
            double weight = people[i][0];
            double height = people[i][1] / 100;
            double bmi = weight / (height * height);
            String status = "";
            if (bmi < 18.5) status = "Underweight";
            else if (bmi < 25) status = "Normal";
            else if (bmi < 30) status = "Overweight";
            else status = "Obese";

            result[i][0] = String.format("%.2f", people[i][0]);
            result[i][1] = String.format("%.2f", people[i][1]);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        return result;
    }

    public static void displayResult(String[][] res) {
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i][0] + "\t" + res[i][1] + "\t" + res[i][2] + "\t" + res[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] people = new double[10][2];
        for (int i = 0; i < 10; i++) {
            people[i][0] = sc.nextDouble();
            people[i][1] = sc.nextDouble();
        }
        String[][] results = computeBMI(people);
        displayResult(results);
    }
}
