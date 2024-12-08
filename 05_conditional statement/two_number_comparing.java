import java.util.Scanner;

public class two_number_comparing {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter first value A =");
        int a=obj.nextInt();
        System.out.print("Enter Second value B =");
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
