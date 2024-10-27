
import java.util.Scanner;

public class sum_N_numbers {
    public static void main(String[] args) {

        System.out.println("Enter N natural No-");
        Scanner obj= new Scanner(System.in);
        int num=obj.nextInt();
        int count=0;
        for(int i=1;i<=num;i++){
             count=count+i;
            
        }
        System.out.println("Total of N Natural Numbers is:"+count);  
    }
    
}
