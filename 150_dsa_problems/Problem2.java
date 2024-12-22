import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Check if the number is prime
        if (isPrime(number)) {
            System.out.println("Output: Prime");
        } else {
            System.out.println("Output: Not Prime");
        }
        
        // Close the scanner
        scanner.close();
    }
    
    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;  // 0 and 1 are not prime numbers
        }
        
        // Check divisibility from 2 to the square root of num
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;  // Found a divisor, so not prime
            }
        }
        
        return true;  // No divisors found, so prime
    }
}
