import java.util.ArrayList;
import java.util.List;

public class Problem38 {
    public static List<Integer> findMissingNumbers(int[] sequence, int n) {
        // Create a list to store the missing numbers
        List<Integer> missingNumbers = new ArrayList<>();
        
        // Use a boolean array to track numbers that exist in the sequence
        boolean[] present = new boolean[n + 1];
        
        // Mark the numbers that are present in the sequence
        for (int num : sequence) {
            present[num] = true;
        }
        
        // Add numbers that are not present to the missingNumbers list
        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                missingNumbers.add(i);
            }
        }
        
        return missingNumbers;
    }

    public static void main(String[] args) {
        int[] sequence = {1, 2, 4, 5};
        int n = 5;
        
        List<Integer> missingNumbers = findMissingNumbers(sequence, n);
        
        System.out.println(missingNumbers); // Output: [3]
    }
}
