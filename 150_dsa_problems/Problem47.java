import java.util.Scanner;

public class Problem47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of rows for the pyramid
        System.out.print("Enter the number of rows for the pyramid: ");
        int rows = scanner.nextInt();

        // Generate the pyramid
        for (int i = 1; i <= rows; i++) {
            // Print numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(); // Move to the next row
        }

        scanner.close();
    }
}
