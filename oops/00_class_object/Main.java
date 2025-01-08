
//create class 
class Pen{
    String color;
    String type;
    
    public void write(){
        System.out.println("Writing with " + color + " " + type + " pen");
    }

}
public class Main {
    public static void main(String[] args) {
        Pen pen1=new Pen();
        pen1.color="Red";
        pen1.type="Ballpoint";

        pen1.write();
    }
    
}
