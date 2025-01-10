import java.util.Scanner;

public class Problem24 {

    public static void main(String[] args) {
        // Create a scanner to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the upper limit
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        // Loop through numbers less than the given number
        System.out.println("Prime numbers less than " + n + ":");
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }

        scanner.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        // 0 and 1 are not prime numbers
        if (num <= 1) {
            return false;
        }

        // Check divisibility from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // not a prime number
            }
        }

        return true; // it is a prime number
    }
}
