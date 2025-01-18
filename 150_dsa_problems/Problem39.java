import java.util.Scanner;

public class Problem39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the matrix
        System.out.print("Enter the size of the square matrix: ");
        int size = scanner.nextInt();

        // Generate the square matrix
        int[][] matrix = generateSquareMatrix(size);

        // Print the square matrix
        System.out.println("Generated Square Matrix:");
        printMatrix(matrix);

        scanner.close();
    }

    public static int[][] generateSquareMatrix(int size) {
        int[][] matrix = new int[size][size];
        int number = 1;

        // Fill the matrix with sequential numbers
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = number++;
            }
        }

        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
}
