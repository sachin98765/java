import java.util.*;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Row Size---");
        int rows=sc.nextInt();
        System.out.println("Enter Column Size--");
        int cols=sc.nextInt();

        int numbers[][]=new int[rows][cols];

        //input
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                numbers[i][j]=sc.nextInt();
            }

        }

        //output
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println(" ");
        }


    }
    
}
