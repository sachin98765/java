import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.println("Enter a string to reverse: ");
        String input = scanner.nextLine();

        // Reverse the string
        String reversed = reverseString(input);

        // Output the result
        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }

    // Method to reverse a string
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}
