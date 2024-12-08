
import java.util.*;
public class Functions {

    public static void printName(String name){
        System.out.println(name);
        return;
    } 

    public static void  main(String args[]){
        System.out.println("Enter Your Name------");
        Scanner sc= new Scanner(System.in);
        String name=sc.next();

        printName(name);

    }
    
}
