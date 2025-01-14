//35. Finding the N-th Triangular Number
import java.util.Scanner;

public class Problem35 {
    // Method to calculate the N-th triangular number
    public static int findTriangularNumber(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input N from user
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        // Calculate and display the N-th triangular number
        int triangularNumber = findTriangularNumber(n);
        System.out.println("The " + n + "-th triangular number is: " + triangularNumber);
    }
}


