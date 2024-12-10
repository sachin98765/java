//array input and find the value

import java.util.*;
public class Arrayqs {
    public static void main(String[] args) {
        System.out.println("Enter Array Size--");
        Scanner sc=new Scanner(System.in);

        int size=sc.nextInt();
        int numbers[]=new int[size];

        //input
        System.out.println("Enter Elements---");
        for(int i=0;i<size;i++){
            numbers[i] = sc.nextInt();
        }

        //find element which you find
        System.out.println("Enter Number Which You Find---");
        int x=sc.nextInt();


        //output
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==x){
                System.out.println("$$$$> "+numbers[i]+" found at index :"+i);
            }
        }
        
    }
}
