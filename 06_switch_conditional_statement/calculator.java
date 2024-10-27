import com.sun.source.doctree.SummaryTree;
import java.util.Scanner;
public class calculator{
    public static void main(String[] args) {
        System.out.println("Choose any number: \n 1.Sum \n 2.Substraction \n 3.Multiplication \n 4.Division");
        System.out.println("Choose a number: \t");
        Scanner obj = new Scanner(System.in);
        int num=obj.nextInt();
       
        if(num==1||num==2||num==3||num==4){            
            Scanner obj2=new Scanner(System.in);
            System.out.println("Choose 1st Value: \t");
            int a=obj2.nextInt();
            System.out.println("Choose Second Value: \t");
            int b=obj2.nextInt();

            int sum=a+b;
            int sub=a-b;
            int mul=a*b;
            double div=a/b;
                   
        switch(num){
            case 1:
                System.out.println("Sum of This two numbers:"+sum);
                break;

            case 2:
                System.out.println("Substraction of this Numbers:"+ sub);
                break;

            case 3:
                System.out.println("Multiplication of this two numbers :"+ mul);
                break;
            case 4:
                System.out.println("Division of this two numbers:"+div);
                break;
            default:System.out.println("programme enDED");
        }


        }
        else{
            System.out.println("!You choose wrone number");
        }


 
    }
}