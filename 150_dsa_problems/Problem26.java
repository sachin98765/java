import java.util.Scanner;

public class Problem26 {

    public static void main(String[] args) {
        // Create a scanner to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a narcissistic number
        if (isNarcissistic(number)) {
            System.out.println(number + " is a Narcissistic number.");
        } else {
            System.out.println(number + " is not a Narcissistic number.");
        }

        scanner.close();
    }

    // Method to check if a number is a narcissistic number
    public static boolean isNarcissistic(int num) {
        int originalNum = num;
        int sum = 0;
        int digits = countDigits(num);

        // Calculate the sum of digits raised to the power of the number of digits
        while (num > 0) {
            int digit = num % 10; // Extract the last digit
            sum += Math.pow(digit, digits); // Add the digit raised to the power
            num /= 10; // Remove the last digit
        }

        return sum == originalNum; // Check if the sum equals the original number
    }

    // Method to count the digits in a number
    public static int countDigits(int num) {
        return String.valueOf(Math.abs(num)).length(); // Handle negative numbers
    }
}
