
import java.util.*;
public class Stringaarrayinput {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Array Size:  ");
            int size =sc.nextInt();
            String array[]=new String[size];
            int toLength =0;


            for(int i=0;i<size; i++){
                array[i]=sc.next();
                toLength += array[i].length();
            }
            System.out.println(toLength);
    }
    
}
