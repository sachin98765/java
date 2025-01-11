import java.util.Scanner;

public class Problem27 {

    // Function to generate a matrix pattern
    public static void generateMatrixPattern(int rows, int cols) {
        int count = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%4d", count); // Align numbers with padding
                count++;
            }
            System.out.println();
        }
    }

    // Function to generate a triangular pattern
    public static void generateTrianglePattern(int rows) {
        int count = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%4d", count);
                count++;
            }
            System.out.println();
        }
    }

    // Function to generate a reverse triangular pattern
    public static void generateReverseTrianglePattern(int rows) {
        int count = rows * (rows + 1) / 2; // Total numbers in the triangle
        for (int i = rows; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.printf("%4d", count);
                count--;
            }
            System.out.println();
        }
    }

    // Main function to choose and display patterns
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a pattern type:");
        System.out.println("1. Matrix");
        System.out.println("2. Triangle");
        System.out.println("3. Reverse Triangle");
        System.out.print("Enter your choice (1/2/3): ");
        int choice = scanner.nextInt();

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        int cols = 0;

        if (choice == 1) {
            System.out.print("Enter the number of columns: ");
            cols = scanner.nextInt();
        }

        switch (choice) {
            case 1:
                System.out.println("Matrix Pattern:");
                generateMatrixPattern(rows, cols);
                break;
            case 2:
                System.out.println("Triangle Pattern:");
                generateTrianglePattern(rows);
                break;
            case 3:
                System.out.println("Reverse Triangle Pattern:");
                generateReverseTrianglePattern(rows);
                break;
            default:
                System.out.println("Invalid choice. Please choose 1, 2, or 3.");
        }

        scanner.close();
    }
}
