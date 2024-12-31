import java.util.Scanner;

public class Problem10 {
    // Method to calculate GCD using the Euclidean algorithm
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to calculate LCM using the formula: LCM(a, b) = (a * b) / GCD(a, b)
    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculate and display the LCM
        int lcm = findLCM(num1, num2);
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);

        scanner.close();
    }
}
