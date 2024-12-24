import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the upper limit from the user
        System.out.print("Enter the upper limit for the Fibonacci series: ");
        int limit = scanner.nextInt();

        if (limit < 0) {
            System.out.println("Please enter a non-negative number.");
        } else {
            System.out.println("Fibonacci series up to " + limit + ":");
            generateFibonacci(limit);
        }

        scanner.close();
    }

    public static void generateFibonacci(int limit) {
        int a = 0, b = 1;

        // Print the Fibonacci numbers up to the given limit
        while (a <= limit) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println(); // Move to the next line after printing the series
    }
}
