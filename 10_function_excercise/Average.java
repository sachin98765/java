import java.util.*;
public class Average{
    public static float calculateAverage(float a, float b,float c) {
    float ave=(a+b+c)/3;
    return ave;
        
    }

    public static void main(String[] args) {
        System.out.println("Enter 3  Numbers---");
        Scanner sc=new Scanner(System.in);
        float a=sc.nextInt();
        float b=sc.nextInt();
        float c=sc.nextInt();

        float ave=calculateAverage(a, b, c);
        System.out.println(ave);
    }
}