import java.util.Scanner;

public class Problem43 {

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for a number
        System.out.print("Enter a number to find its divisors: ");
        int number = scanner.nextInt();

        // Find and display all divisors
        System.out.println("Divisors of " + number + " are:");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        
        // Close the scanner
        scanner.close();
    }
}
