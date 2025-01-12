//Write a program to find the largest palindrome in a given string.
import java.util.Scanner;

public class Problem29 {

    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Function to find the largest palindrome in a given string
    public static String findLargestPalindrome(String input) {
        String largestPalindrome = "";
        int maxLength = 0;

        // Iterate through all substrings
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                String substring = input.substring(i, j);
                if (isPalindrome(substring) && substring.length() > maxLength) {
                    largestPalindrome = substring;
                    maxLength = substring.length();
                }
            }
        }

        return largestPalindrome;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Find and print the largest palindrome
        String largestPalindrome = findLargestPalindrome(input);
        if (!largestPalindrome.isEmpty()) {
            System.out.println("The largest palindrome in the string is: " + largestPalindrome);
        } else {
            System.out.println("No palindrome found in the string.");
        }

        scanner.close();
    }
}


