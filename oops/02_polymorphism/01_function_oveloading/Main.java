class Student{
    String name;
    int age;
    String address;
    
    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name, int age){
        System.out.println(name + " " + age);   
    }

}

public class Main {
    public static void main(String[] args) {

        Student student1= new Student();
        student1.name = "John";
        student1.age = 20;

        student1.printInfo(student1.name,student1.age);


    }
    
}
