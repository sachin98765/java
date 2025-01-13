//Description: Write a program to find the median of an array of numbers.

import java.util.Arrays;
import java.util.Scanner;

public class Problem31 {

    // Function to find the median of an array
    public static double findMedian(int[] array) {
        // Sort the array
        Arrays.sort(array);

        int n = array.length;
        // If the array length is odd, return the middle element
        if (n % 2 != 0) {
            return array[n / 2];
        }
        // If the array length is even, return the average of the two middle elements
        return (array[n / 2 - 1] + array[n / 2]) / 2.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Input the elements of the array
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Find and display the median
        double median = findMedian(array);
        System.out.println("The median is: " + median);

        scanner.close();
    }
}


