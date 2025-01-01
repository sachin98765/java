import java.util.Scanner;

public class Program11{

    // Method to print a pyramid pattern
    public static void printPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Method to print a diamond pattern
    public static void printDiamond(int rows) {
        // Top half of the diamond (including middle row)
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Bottom half of the diamond
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a pattern to display:");
        System.out.println("1. Pyramid Pattern");
        System.out.println("2. Diamond Pattern");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("\nPyramid Pattern:");
                printPyramid(rows);
                break;
            case 2:
                System.out.println("\nDiamond Pattern:");
                printDiamond(rows);
                break;
            default:
                System.out.println("Invalid choice. Please run the program again.");
        }

        scanner.close();
    }
}
