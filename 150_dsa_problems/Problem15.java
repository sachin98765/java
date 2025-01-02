import java.util.Arrays;

public class Problem15 {
    public static void main(String[] args) {
        // Example array
        int[] numbers = {5, 2, 8, 1, 3};

        // Display the original array
        System.out.println("Original array: " + Arrays.toString(numbers));

        // Sort the array in ascending order
        Arrays.sort(numbers);

        // Display the sorted array
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }
}
