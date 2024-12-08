import java.util.*;

public class Factorial {
    public static void calculateFactorial(int n){

        if(n<0){
            System.out.println("Invaild Number!!!!!!!!!!");
            return;
        }

        int fac=1;
        for(int i=n;i>=1;i--){
            fac=fac*i;
        }
        System.out.println(fac);
        return;
    }
    

    public static void main(String args[]){
        System.out.println("Enter your Factorial Number---");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    
        calculateFactorial(n);

    }
}
