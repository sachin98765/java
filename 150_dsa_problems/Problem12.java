import java.util.Scanner;

public class Problem12{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        // Initialize counters for vowels and consonants
        int vowelCount = 0;
        int consonantCount = 0;

        // Convert the string to lowercase for uniform processing
        String lowerCaseInput = input.toLowerCase();

        // Iterate over each character in the string
        for (char ch : lowerCaseInput.toCharArray()) {
            if (Character.isLetter(ch)) { // Check if the character is a letter
                if ("aeiou".indexOf(ch) != -1) { // Check if the character is a vowel
                    vowelCount++;
                } else { // If it's not a vowel, it must be a consonant
                    consonantCount++;
                }
            }
        }

        // Output the results
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);

        scanner.close();
    }
}
