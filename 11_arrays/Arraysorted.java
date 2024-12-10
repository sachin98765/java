
import java.util.*;
public class Arraysorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size =sc.nextInt();

        int numbers[]=new int[size];

        //input
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }

        boolean isAcending=true;

        for(int i=0;i<numbers.length-1;i++){
            if(numbers[i]>numbers[i+1]){
                isAcending = false;
            }
        }

        if(isAcending){
            System.out.println("This array is sorted in ascending order.");
        }
        else{
            System.out.println("This array is not  sorted in ascending order.");

        }

    }
}
