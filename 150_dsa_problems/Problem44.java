
    import java.util.Scanner;

public class Problem44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of elements in the array
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Initialize the array
        double[] numbers = new double[n];

        // Read the elements from the user
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextDouble();
        }

        // Calculate the sum of the array elements
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }

        // Calculate the average
        double average = sum / n;

        // Print the result
        System.out.println("The average is: " + average);

        scanner.close();
    }
}


