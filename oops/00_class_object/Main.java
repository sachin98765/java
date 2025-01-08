
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
public class Main {
    public static void main(String[] args) {
        Pen pen1=new Pen();
        pen1.color="Red";
        pen1.type="Ball";

        Pen pen2=new Pen();
        pen2.color="Blue";
        pen2.type="Gel";

        pen1.printColor();
        pen1.printColor();
    }
    
}
