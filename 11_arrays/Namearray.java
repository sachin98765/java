
import java.util.*;
public class Namearray {
    public static void main(String[] args) {
        System.out.println("Enter Array Size----");
        Scanner sc=new Scanner(System.in);

        //array size
        int size = sc.nextInt();
        String names[]= new String[size];

        //input names
        for(int i=0;i<size;i++){
            names[i]=sc.next();   
        }

        //output
        for(int i=0;i<size;i++){
            System.out.print(names[i]+"\t");
        }
        
    }
}
