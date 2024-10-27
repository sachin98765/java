
import java.util.Scanner;
public class print_even_number {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        for(int i=0;i<=num;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
