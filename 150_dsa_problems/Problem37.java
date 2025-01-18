import java.util.Scanner;

public class Problem37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculate and print the sum of squares of its digits
        int result = calculateSumOfSquares(number);
        System.out.println("The sum of the squares of the digits is: " + result);

        scanner.close();
    }

    public static int calculateSumOfSquares(int number) {
        int sum = 0;

        // Handle negative numbers
        number = Math.abs(number);

        while (number > 0) {
            int digit = number % 10; // Get the last digit
            sum += digit * digit;   // Add the square of the digit to the sum
            number /= 10;           // Remove the last digit
        }

        return sum;
    }
}
