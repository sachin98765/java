import java.util.Scanner;

public class Problem17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for range
        System.out.println("Enter the start of the range: ");
        int start = scanner.nextInt();

        System.out.println("Enter the end of the range: ");
        int end = scanner.nextInt();

        System.out.println("Armstrong numbers between " + start + " and " + end + ":");

        // Find and print Armstrong numbers in the range
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        int sum = 0;
        int originalNumber = number;
        int digits = String.valueOf(number).length();

        // Calculate the sum of digits raised to the power of the number of digits
        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }

        // Return true if the sum equals the original number
        return sum == originalNumber;
    }
}
