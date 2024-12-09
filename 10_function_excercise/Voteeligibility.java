
import java.util.*;
 c
public class Voteeligibility {
    public static void checkVoteEligibility(int age) {
        if(age>18){
            System.out.println("Person is Eligible for Vote.");
            return;
        }
        else{
            System.out.println("Person is Not Eligible for Vote");

        }
    }

    public static void main(String[] args) {
        System.out.println("Enter your Age-------");
        Scanner sc=new Scanner(System.in);
        int age= sc.nextInt();

        checkVoteEligibility(age);
    }
}
