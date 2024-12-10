
import java.util.*;
public class Findindices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter rows Size--");
        int rows=sc.nextInt();
        System.out.println("Enter Columns Size--");
        int cols=sc.nextInt();
        int numbers[][]= new int[rows][cols];

        //input
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                numbers[i][j]=sc.nextInt();
                
            }
        }

        //find element
        System.out.println("Enter the element which you want to search--");
        int x=sc.nextInt();

        //output
        for(int i=0;i<numbers.length;i++){
            for(int j=0; j<numbers.length; j++){
                if(numbers[i][j]==x){
                    System.out.println(numbers[i][j]+" number indices is--"+"("+i+","+j+")");
                }
            }
        }
    
    }
    
}
