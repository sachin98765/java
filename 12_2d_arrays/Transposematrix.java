import java.util.*;

public class Transposematrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr rows size--");
        int rows=sc.nextInt();
        System.out.println("Enter columns size--");
        int cols=sc.nextInt();
        int matrix[][]=new int[rows][cols];

        //input
        System.out.println("enter your elements--");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        //output
        System.out.println("This matrix  Transpose Matrix Is---");
        for(int j=0;j<matrix.length;j++){
            for(int i=0;i<matrix.length;i++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
