import java.util.Scanner;

public class two_number_comparing {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();

        if(a==b){
            System.out.println("A is EQUAL to B");
        }
        else if(a>b){
            System.out.println("A is GRETTER THEN B");
        }
        else{
            System.out.println("A is LESS THEN B ");
        }
    }
}
