
import java.util.Scanner;
public class print_table {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter the Number-");
        int num=obj.nextInt();
        for(int i=1;i<=10;i++){
            int count=num*i;
            System.out.println(num+"x"+i+"="+ count);

        }
    }
}
