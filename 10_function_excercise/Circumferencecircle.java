import java.util.*;


/* This is a a way---------- */
/*
public class Circumferencecircle {
    public static void calculateCircumferenceCircle(int r) {
        double pi=3.14159;
        double c=2*pi*r;
        System.out.println(c);
        return;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r = sc.nextInt();

        calculateCircumferenceCircle(r);
    }
    
}  */



/*  This is another way---------- */

public class Circumferencecircle{

    public static double calculateCircumferenceCircle(int r){
        double pi=3.14159;
        double c= 2* pi*r;
        return c;
    }
    public static void main(String args[]){
        System.out.println("Enter radius of a circle---");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();

        System.out.println("circumference of a circle = "+calculateCircumferenceCircle(r));


    }
}
