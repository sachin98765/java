class Shape{
    String color;

    public void area(){
        System.out.println("Area of Shape");
    }
}  
    class Triangle extends Shape{
        public void area(int l,int h){
            System.out.println("Area of Triangle = "+ (0.5*l*h));
        }
    
    }


public class Sinheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "Red";
        t1.area(10,20);

    }
    
}