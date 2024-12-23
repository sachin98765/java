import java.util.Scanner;

public class Problem4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number to check if it is an Armstrong number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        // Close the scanner
        scanner.close();
    }

    // Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;

        // Calculate the number of digits
        int digits = String.valueOf(num).length();

        // Calculate the sum of each digit raised to the power of the number of digits
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        // Check if the sum equals the original number
        return sum == originalNum;
    }
}
