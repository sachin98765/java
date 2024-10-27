import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class check_odd_even {
    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        int num=obj.nextInt();

        if(num%2==0){
            System.out.println("Number is EVEN");
        }
        else{
            System.out.println("Number is ODD");
        }

    }
}
