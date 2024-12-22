import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println("Output: Even");
        } else {
            System.out.println("Output: Odd");
        }
        
        // Close the scanner
        scanner.close();
    }
}
