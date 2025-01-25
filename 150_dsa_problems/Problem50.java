import java.util.HashSet;
import java.util.Scanner;

public class Problem50 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: String to check
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        // Function call to find the longest substring
        int result = lengthOfLongestSubstring(s);
        System.out.println("The length of the longest substring without repeating characters is: " + result);

        scanner.close();
    }

    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0, right = 0;
        int maxLength = 0;

        // Use a sliding window approach
        while (right < s.length()) {
            // If the character at the right pointer is not in the set, add it
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                // If the character is already in the set, remove the left pointer's character
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxLength;
    }
}
