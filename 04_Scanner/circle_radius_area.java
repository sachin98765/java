
import java.util.Scanner;


public class circle_radius_area {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);

        double pi=3.14159;
        double radius=obj.nextInt();
        // double radius=23.565;
        double area=(pi*(radius*2)); 
        System.out.println("The area of the circle is="+area);
        
    }

}
