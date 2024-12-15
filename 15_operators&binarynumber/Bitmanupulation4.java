
import java.util.*;
public class Bitmanupulation4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Choose 0 OR 1");
        int oper =sc.nextInt();
        int n=5;
        int pos =1;

        int bitMask = 1<< pos;
        if(oper ==1){
            //set
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }
        else{
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }
    }
    
}
