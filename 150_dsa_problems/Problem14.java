import java.util.Scanner;

public class Problem14{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Create an array of size 'n'
        int[] array = new int[n];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Initialize largest and smallest with the first element of the array
        int largest = array[0];
        int smallest = array[0];

        // Traverse the array to find the largest and smallest numbers
        for (int i = 1; i < n; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        // Display the results
        System.out.println("\nLargest number in the array: " + largest);
        System.out.println("Smallest number in the array: " + smallest);

        scanner.close();
    }
}
