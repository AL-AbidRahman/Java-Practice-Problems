import java.util.Scanner;

public class PracticeProblem03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of values: ");
        int n = scanner.nextInt();
        double[] values = new double[n];
        double sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            values[i] = scanner.nextDouble();
            sum += values[i];
        }

        double average = sum / n;
        System.out.println("Average = " + average);

        System.out.print("\nEnter letter grade: ");
        double grade = scanner.nextDouble();
        System.out.print("Has the student completed the semester? (yes/no): ");
        String completed = scanner.next();

        if (grade >= 3.5) {
            if (completed.equalsIgnoreCase("yes")) {
                System.out.println("Student receives a medal.");
            } else {
                System.out.println("Student did not complete the semester, no medal.");
            }
        } else {
            System.out.println("Grade too low for medal.");
        }

        System.out.print("\nEnter % of target sales reached: ");
        double sales = scanner.nextDouble();
        System.out.print("Enter % attendance: ");
        double attendance = scanner.nextDouble();

        int bonus = 0;

        if (sales >= 95) {
            if (attendance == 100) {
                bonus = 60;
            } else if (attendance >= 90) {
                bonus = 40;
            }
        } else if (sales >= 80) {
            if (attendance == 100) {
                bonus = 40;
            } else if (attendance >= 90) {
                bonus = 20;
            }
        } else {
            bonus = 5;
        }

        System.out.println("Bonus = " + bonus + "%");

        scanner.close();
    }
}
