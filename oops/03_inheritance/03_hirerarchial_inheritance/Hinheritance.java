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

class EquilateralTriangle extends Shape{
    public void area(int l,int h){
        System.out.println(color +" "+ "Area of Triangle2 = "+ (0.5*l*h));
    }
}

public class Hinheritance {
    public static void main(String[] args) {
        EquilateralTriangle t1 = new EquilateralTriangle();
        t1.color = "Red";
        t1.area(10,20);

    }
    
}
