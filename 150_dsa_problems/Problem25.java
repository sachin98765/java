import java.util.Scanner;

public class Problem25{

    public static void main(String[] args) {
        // Create a scanner to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Get the count of digits
        int digitCount = countDigits(number);

        // Print the result
        System.out.println("The number of digits in " + number + " is: " + digitCount);

        scanner.close();
    }

    // Method to count the digits in a number
    public static int countDigits(int num) {
        // Handle negative numbers
        num = Math.abs(num);

        // Special case for 0
        if (num == 0) {
            return 1;
        }

        int count = 0;
        while (num > 0) {
            num /= 10; // Remove the last digit
            count++;   // Increment the digit count
        }
        return count;
    }
}
