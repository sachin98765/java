import java.util.*;

public class Strings{
    public static void main(String[] args) {
        
        // //concatination
        // String firstName="Sam";
        // String lastName="Mohan";
        // String fullName=firstName+"@"+lastName;

        // System.out.println(fullName.length());

        // //charAt
        // for(int i=0;i<fullName.length();i++){
        //     System.out.println(fullName.charAt(i));
        // }


        //comapre two String
        /* 
        String name1="Tony"; 
        String name2="Tony22";

        if(name1.compareTo(name2)==0){
            System.out.println("Strings are Equal.");
        }
        else{
            System.out.println("Strings are Not Equal.");   
        }          */

        String sentence ="TonyStark";
        String name =sentence.substring(0,4);
        System.out.println(name);


    }
}