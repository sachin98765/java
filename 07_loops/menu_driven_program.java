import java.util.Scanner;


public class menu_driven_program {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Choose '1' or '0'");
        int num=obj.nextInt();
        
        if(num==1){
            System.out.println("Enetr your Marks----");
            int marks=obj.nextInt();
            if(marks>=90){
                System.out.println("This is GOOD");
            }
            else if ( marks>=60 || marks>=89){
                System.out.println("This is also GOOD");
            }
            else{
                System.out.println("This is good as well");
            }
        }
        else{
            System.out.println("!Stop!");
        }
    }    
}
