import java.util.Scanner;

public class Problem40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculate the single-digit sum
        int result = getSingleDigitSum(number);

        // Output the result
        System.out.println("The single-digit sum is: " + result);

        scanner.close();
    }

    /**
     * Method to calculate the single-digit sum of a number.
     *
     * @param num The input number.
     * @return The single-digit sum.
     */
    public static int getSingleDigitSum(int num) {
        while (num >= 10) { // Continue until the number becomes a single digit
            int sum = 0;
            while (num > 0) {
                sum += num % 10; // Add the last digit to the sum
                num /= 10;       // Remove the last digit
            }
            num = sum; // Update num to the calculated sum
        }
        return num; // Return the single-digit result
    }
}
