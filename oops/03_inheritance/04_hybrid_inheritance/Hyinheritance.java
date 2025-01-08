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

class EquilateralTriangle extends Triangle{
    public void area(int l,int h){
        System.out.println("Area of Triangle2 = "+ (0.5*l*h));
    }
}

class Circle extends Shape{
    public void area(int r){
        System.out.println(color +" "+ "Area of Circle = "+ (22/7*r*r));
    }
}

public class Hyinheritance {
    public static void main(String[] args) {
        Circle t1 = new Circle();
        t1.color = "Red";
        t1.area(10);

    }
    
}
