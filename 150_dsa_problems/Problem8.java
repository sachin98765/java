import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number from the user
        System.out.print("Enter a number to calculate sum ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println(" negative numbers.");
        } else {
            long factorial = calculateSum(number);
            System.out.println("The factorial of " + number + " is: " + factorial);
        }

        scanner.close();
    }

    public static long calculateSum(int num) {
        long result = 0;
        for (int i = 1; i <= num; i++) {
            result += i;
        }
        return result;
    }
}
