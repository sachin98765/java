import java.util.Scanner;
public class print_color_greeting {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int number=obj.nextInt();

        if (number==1) {
            System.out.println("HEllo");
        }
        else if(number==2) {
            System.out.println("Namaste");
        }
        else if(number==3){
            System.out.println("Bonjour");
        }
        else{
            System.out.println("!You choose wrone NUMBER choose '1' '2' '3' ");
        }
        
    }
}
