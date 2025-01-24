public class Problem46 {

    public static void main(String[] args) {
        String input = "Hello, World!";
        int length = calculateLength(input);

        System.out.println("The length of the string is: " + length);
    }

    public static int calculateLength(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            count++;
        }
        return count;
    }
}
