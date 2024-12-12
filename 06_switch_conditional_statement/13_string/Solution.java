//  Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’.
// Display that username to the user.

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter Your String--");
        String str = sc.next();
        String uname="";

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='@'){
                break;
            }
            else{
                

            }
        }


    }
}
