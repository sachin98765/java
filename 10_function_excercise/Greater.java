
import java.util.*;
public class Greater {
    public static void calculateGreaterNumber(int a, int b) {
        if(a>b){
            System.out.println("greate Value Is--"+a);
        }
        else{
            System.out.println("greate Value Is--"+b);
        }        
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Value --");
        int a=sc.nextInt();
        System.out.print("Enter Second Value --");
        int b=sc.nextInt();
        calculateGreaterNumber(a, b);
    }
}
