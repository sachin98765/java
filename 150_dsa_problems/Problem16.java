public class Problem16{
    public static void main(String[] args) {
        // Example array
        int[] numbers = {5, 2, 8, 1, 3};

        // Variable to store the sum
        int sum = 0;

        // Loop through the array to calculate the sum
        for (int number : numbers) {
            sum += number;
        }

        // Display the sum
        System.out.println("Sum of array elements: " + sum);
    }
}
