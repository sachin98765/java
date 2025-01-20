public class Problem42 {
    
    // Recursive method to calculate Fibonacci numbers
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int limit = 10; // Change this value to adjust the limit
        System.out.println("Fibonacci sequence up to " + limit + ":");

        for (int i = 0; i < limit; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
