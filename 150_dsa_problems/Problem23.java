
import java.util.Scanner;

public class Problem23 {
    // Function to calculate the Fibonacci number at a specific position
    public static int getFibonacci(int position) {
        if (position <= 0) {
            throw new IllegalArgumentException("Position must be greater than 0.");
        }
        if (position == 1 || position == 2) {
            return 1;
        }
        int first = 1, second = 1, fib = 0;
        for (int i = 3; i <= position; i++) {
            fib = first + second;
            first = second;
            second = fib;
        }
        return fib;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the position to find the Fibonacci number: ");
        int position = scanner.nextInt();

        try {
            int result = getFibonacci(position);
            System.out.println("Fibonacci number at position " + position + " is: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}


