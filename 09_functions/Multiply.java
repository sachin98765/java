
import java.util.Scanner;


public class Multiply{

    public static int calculateSum(int a, int b){
        
        return a*b;
    }
    public static void main(String args[]){
        System.out.println("Enter two Numbers which you multiply--");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println("Two Numbers Multiplication = "+calculateSum(a, b));


    }
}