import java.util.Scanner;
public class adult_check {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int age=obj.nextInt();
        if(age>=18){
            System.out.println("The Person is 18+");
        }
        else{
            System.out.println("The Persion is not 18+");
        }
        
    }
  
}
