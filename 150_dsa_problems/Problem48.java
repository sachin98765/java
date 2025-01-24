import java.util.Scanner;

public class Problem48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number to find the sum of prime factors
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0; // To store the sum of prime factors

        // Divide by 2 until the number is no longer even
        while (number % 2 == 0) {
            sum += 2;
            number /= 2;
        }

        // Check for odd prime factors
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                sum += i;
                number /= i;
            }
        }

        // If the remaining number is a prime number greater than 2
        if (number > 2) {
            sum += number;
        }

        // Output the sum of the prime factors
        System.out.println("The sum of the prime factors is: " + sum);

        scanner.close();
    }
}
