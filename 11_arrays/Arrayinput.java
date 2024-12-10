
import java.util.*;
public class Arrayinput {
    public static void main(String[] args) {
        System.out.println("Enter Array Size--");
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();

        int numbers[] =new int[size];

        //input
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }

        //output
        for(int i=0;i<size;i++){
            System.err.print(numbers[i]+"\t");
        }

    }
}
