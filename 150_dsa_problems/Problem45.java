
    import java.util.*;

public class Problem45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of elements in the array
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Initialize the array
        int[] numbers = new int[n];

        // Read the elements from the user
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Find the mode
        List<Integer> modes = findMode(numbers);

        // Print the result
        System.out.println("The mode(s): " + modes);

        scanner.close();
    }

    public static List<Integer> findMode(int[] numbers) {
        // Use a HashMap to store the frequency of each number
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Find the maximum frequency
        int maxFrequency = Collections.max(frequencyMap.values());

        // Collect all numbers with the maximum frequency
        List<Integer> modes = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                modes.add(entry.getKey());
            }
        }

        return modes;
    }
}


