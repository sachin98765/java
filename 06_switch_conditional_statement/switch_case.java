import java.util.Scanner;
public class switch_case {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();

        switch(num){
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default : System.out.println("!YOU CHOOSE WRONG NUMBER CHOOSE '1' '2' '3' ");
        }
    }
}
