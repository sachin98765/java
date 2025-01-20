import java.util.Scanner;

public class Problem41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get the number from the user
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        // Input: Get the digit to count
        System.out.print("Enter the digit to count: ");
        int digit = scanner.nextInt();

        // Validate the digit
        if (digit < 0 || digit > 9) {
            System.out.println("Please enter a valid digit (0-9).");
        } else {
            // Count the occurrences of the digit
            int count = countDigitOccurrences(number, digit);

            // Output the result
            System.out.println("The digit " + digit + " occurs " + count + " times in the number " + number + ".");
        }

        scanner.close();
    }

    /**
     * Method to count the occurrences of a specific digit in a number.
     *
     * @param number The input number.
     * @param digit  The digit to count.
     * @return The count of occurrences of the digit.
     */
    public static int countDigitOccurrences(long number, int digit) {
        int count = 0;
        number = Math.abs(number); // Handle negative numbers

        while (number > 0) {
            if (number % 10 == digit) { // Check if the last digit matches
                count++;
            }
            number /= 10; // Remove the last digit
        }

        return count;
    }
}
