
public class Strings {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Testing..");
     System.out.println(sb);

     //Char at index '0'
     System.out.println(sb.charAt(0));

     //set char at index 0
     sb.setCharAt(0,'P');
     System.out.println(sb);

     //inser char 
     sb.insert(0,'P');
     System.out.println(sb);

     //delete
     sb.delete(1, 5);
     System.out.println(sb);

     //append 
     sb.append("Ping");
     System.out.println(sb);



    }
}
