import java.util.Scanner;

public class Problem19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the range
        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();

        System.out.println("\nPrime numbers between " + start + " and " + end + " are:");

        // Find and display all prime numbers in the range
        for (int number = start; number <= end; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }

        scanner.close();
    }

    /**
     * Checks whether a given number is a prime number.
     *
     * @param number The number to check.
     * @return True if the number is prime, else False.
     */
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // 0 and 1 are not prime numbers
        }

        // Check divisors from 2 to √number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Divisible by i, not a prime number
            }
        }

        return true; // No divisors found, it's a prime number
    }
}
