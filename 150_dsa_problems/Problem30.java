import java.util.Scanner;

public class Problem30 {

    // Function to generate Pascal's Triangle
    public static void generatePascalsTriangle(int numRows) {
        int[][] triangle = new int[numRows][numRows];

        // Generate Pascal's Triangle
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                // First and last values in a row are always 1
                if (j == 0 || j == i) {
                    triangle[i][j] = 1;
                } else {
                    // Other values are the sum of the two values above
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of rows for Pascal's Triangle
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int numRows = scanner.nextInt();

        // Generate and display Pascal's Triangle
        System.out.println("Pascal's Triangle:");
        generatePascalsTriangle(numRows);

        scanner.close();
    }
}


