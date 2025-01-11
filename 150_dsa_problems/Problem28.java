import java.math.BigInteger;
import java.util.Scanner;

public class Problem28 {

    // Function to compute the factorial of a number
    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    // Function to calculate the sum of the digits of a number
    public static int sumOfDigits(BigInteger number) {
        String numStr = number.toString();
        int sum = 0;
        for (char digit : numStr.toCharArray()) {
            sum += Character.getNumericValue(digit);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number to find the sum of the digits of its factorial: ");
        int number = scanner.nextInt();

        // Calculate the factorial
        BigInteger factorialResult = factorial(number);

        // Calculate the sum of the digits of the factorial
        int digitSum = sumOfDigits(factorialResult);

        // Output the result
        System.out.println("Factorial of " + number + " is: " + factorialResult);
        System.out.println("Sum of the digits of the factorial is: " + digitSum);

        scanner.close();
    }
}
