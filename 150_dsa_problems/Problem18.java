import java.util.Scanner;

public class Problem18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a number
        System.out.print("Enter a number to generate its multiplication table: ");
        int number = scanner.nextInt();

        // Prompt the user for the range of the table
        System.out.print("Enter the range up to which the table should be generated: ");
        int range = scanner.nextInt();

        System.out.println("\nMultiplication Table for " + number + ":");

        // Generate and display the multiplication table
        for (int i = 1; i <= range; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        scanner.close();
    }
}
