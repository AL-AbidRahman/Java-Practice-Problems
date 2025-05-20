import java.util.Scanner;

public class PracticeProblem03Final {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int evenCount = 0, oddCount = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);

        System.out.println("\nFibonacci Series (12 terms):");
        int a = 0, b = 1;
        System.out.print(a + ", " + b);
        for (int i = 2; i < 12; i++) {
            int next = a + b;
            System.out.print(", " + next);
            a = b;
            b = next;
        }

        scanner.close();
    }
}
