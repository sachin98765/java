
//create class 
class Pen{
    String color;
    String type;
    
    public void write(){
        System.out.println("Write something"); 
    }

    public void printColor(){
        System.out.println(this.color);
    }


}


class Student{
    String name;
    int age;
    String address;
    
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class Main {
    public static void main(String[] args) {

        //this is for pen class
        // Pen pen1=new Pen();
        // pen1.color="Red";
        // pen1.type="Ball";

        // Pen pen2=new Pen();
        // pen2.color="Blue";
        // pen2.type="Gel";

        // pen1.printColor();
        // pen2.printColor();


        //this is for student class
        Student student1=new Student();
        student1.name="Rahul";
        student1.age=20;

        student1.printInfo();
    }
    
}
