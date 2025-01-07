
import java.util.Scanner;

public class Problem22{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the range
        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();

        // Calculate the sum of even numbers in the range
        int sum = calculateSumOfOdd(start, end);

        // Output the result
        System.out.println("The sum of all even numbers between " + start + " and " + end + " is: " + sum);

        scanner.close();
    }

    /**
     * Calculates the sum of all even numbers within a given range.
     *
     * @param start The starting number of the range.
     * @param end   The ending number of the range.
     * @return The sum of all even numbers in the range.
     */
    public static int calculateSumOfOdd(int start, int end) {
        int sum = 0;

        // Adjust start to the first odd number if it's even
        if (start % 2 == 0) {
            start++;
        }

        // Loop through all odd numbers in the range
        for (int i = start; i <= end; i += 2) {
            sum += i;
        }

        return sum;
    }
}


