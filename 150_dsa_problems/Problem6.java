import java.util.Scanner;

public class Problem6{
    public static void main(String[] args) {
        //String Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string or number:");
        String input = sc.next();
        
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}