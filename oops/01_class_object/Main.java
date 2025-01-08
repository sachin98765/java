import java.util.Arrays;

public class Main{
    public static void main(String[] args){

        //store 5 roll no
        int[] numbers =new int[5];

        //store 5 names
        String[] names = new String[5];

        //data of a student:(name, roll no, marks)
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        student[] students = new student[5];
        System.out.println(Arrays.toString(students));
    }
}

//create  a class student
//for every single student
class student{
    int rno;
    String name;
    float marks;
}