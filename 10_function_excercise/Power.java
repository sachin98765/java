
import java.util.*;
import java.lang.Math;

public class Power {
    public static void calculatePower(int x, int n) {
       double result = Math.pow(x , n);
       System.out.println("The value of one number raised to the power of another is = "+result);
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Value of X :");
        int x=sc.nextInt();
        System.out.println("Enter Value of N :");
        int n=sc.nextInt();

        calculatePower(x, n);
    }
}




