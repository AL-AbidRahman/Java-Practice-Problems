import java.util.Scanner;

public class LeapYearAndSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }

        System.out.println("\nUsing FOR loop:");
        printSeriesWithFor();

        System.out.println("\nUsing WHILE loop:");
        printSeriesWithWhile();

        System.out.println("\nUsing DO-WHILE loop:");
        printSeriesWithDoWhile();

        scanner.close();
    }

    public static void printSeriesWithFor() {
        int evenSum = 0, oddSum = 0;

        System.out.print("Even series: ");
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
            evenSum += i;
        }
        System.out.println("\nSum of even series: " + evenSum);

        System.out.print("Odd series: ");
        for (int i = 1; i < 20; i += 2) {
            System.out.print(i + " ");
            oddSum += i;
        }
        System.out.println("\nSum of odd series: " + oddSum);
    }

    public static void printSeriesWithWhile() {
        int i = 2, evenSum = 0;
        System.out.print("Even series: ");
        while (i <= 20) {
            System.out.print(i + " ");
            evenSum += i;
            i += 2;
        }
        System.out.println("\nSum of even series: " + evenSum);

        i = 1;
        int oddSum = 0;
        System.out.print("Odd series: ");
        while (i < 20) {
            System.out.print(i + " ");
            oddSum += i;
            i += 2;
        }
        System.out.println("\nSum of odd series: " + oddSum);
    }

    public static void printSeriesWithDoWhile() {
        int i = 2, evenSum = 0;
        System.out.print("Even series: ");
        do {
            System.out.print(i + " ");
            evenSum += i;
            i += 2;
        } while (i <= 20);
        System.out.println("\nSum of even series: " + evenSum);

        i = 1;
        int oddSum = 0;
        System.out.print("Odd series: ");
        do {
            System.out.print(i + " ");
            oddSum += i;
            i += 2;
        } while (i < 20);
        System.out.println("\nSum of odd series: " + oddSum);
    }
}
