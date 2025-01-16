//Description: Write a program to determine if a number is a perfect square.


import java.util.Scanner;

public class Problem36 {

    // Method to check if a number is a perfect square
    public static boolean isPerfectSquare(int number) {
        if (number < 0) {
            return false; // Negative numbers cannot be perfect squares
        }
        int sqrt = (int) Math.sqrt(number);
        return sqrt * sqrt == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number from the user
        System.out.print("Enter a number to check if it is a perfect square: ");
        int number = scanner.nextInt();

        // Check if the number is a perfect square and display the result
        if (isPerfectSquare(number)) {
            System.out.println(number + " is a perfect square.");
        } else {
            System.out.println(number + " is not a perfect square.");
        }
    }
}


