import java.util.Scanner;

public class Problem49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Input: Array elements
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Find the second largest number
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;  // update second largest
                largest = arr[i];         // update largest
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];   // update second largest if it's not equal to largest
            }
        }

        // Output: Second largest number
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest number.");
        } else {
            System.out.println("The second largest number is: " + secondLargest);
        }

        scanner.close();
    }
}
