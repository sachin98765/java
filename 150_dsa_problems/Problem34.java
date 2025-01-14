//      Description: Write a program to calculate the sum of all prime numbers within a given range.
import java.util.Scanner;

public class Problem34 {
    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input range from user
        System.out.print("Enter the lower bound of the range: ");
        int lowerBound = scanner.nextInt();

        System.out.print("Enter the upper bound of the range: ");
        int upperBound = scanner.nextInt();

        // Calculate the sum of prime numbers in the range
        int sum = 0;
        for (int i = lowerBound; i <= upperBound; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }

        // Output the result
        System.out.println("The sum of prime numbers between " + lowerBound + " and " + upperBound + " is: " + sum);
    }
}


