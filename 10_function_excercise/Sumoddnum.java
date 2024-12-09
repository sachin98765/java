
import java.util.*;

public class Sumoddnum {
    public static void calculateSumOddNum(int n) {
        int soddn=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                soddn=soddn+i;
            }
           
        }
        System.out.println("The sum of all odd numbers from 1 to n = "+soddn);
        
    }

    public static void main(String[] args) {
        System.out.println("Enter number where to add all Odd Numbers--");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        calculateSumOddNum(n);
    }
    
}
