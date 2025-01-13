
import java.util.Scanner;

public class Problem32 {

    // Function to calculate the power of a number
    public static double calculatePower(double base, int exponent) {
        double result = 1.0;

        // Handle positive exponent
        if (exponent > 0) {
            for (int i = 1; i <= exponent; i++) {
                result *= base;
            }
        }
        // Handle negative exponent
        else if (exponent < 0) {
            for (int i = 1; i <= -exponent; i++) {
                result /= base;
            }
        }
        // Exponent = 0, result is 1
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the base
        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();

        // Input the exponent
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        // Calculate the power
        double power = calculatePower(base, exponent);

        // Display the result
        System.out.println(base + " raised to the power of " + exponent + " is: " + power);

        scanner.close();
    }
}


