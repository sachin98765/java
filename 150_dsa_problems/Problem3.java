import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter any Year ");
        int year = scanner.nextInt();
        
        // Check if the number is even or odd
        if (year % 4 == 0) {
            System.out.println("Output: Year Is Leap Year.");
        } else {
            System.out.println("Output: Year Is Not Leap Year.");
        }
        
        // Close the scanner
        scanner.close();
    }
}
