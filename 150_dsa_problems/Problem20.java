import java.util.Scanner;

public class Problem20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a number
        System.out.print("Enter a number to check if it is a perfect number: ");
        int number = scanner.nextInt();

        // Check if the number is perfect
        if (isPerfectNumber(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }

        scanner.close();
    }

    /**
     * Determines if a given number is a perfect number.
     *
     * @param number The number to check.
     * @return True if the number is perfect, else False.
     */
    public static boolean isPerfectNumber(int number) {
        if (number <= 1) {
            return false; // Perfect numbers are positive integers greater than 1
        }

        int sum = 0;

        // Find and sum the divisors of the number
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Check if the sum of divisors equals the number
        return sum == number;
    }
}
 
