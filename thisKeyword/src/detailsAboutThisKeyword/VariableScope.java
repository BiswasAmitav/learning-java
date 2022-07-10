package detailsAboutThisKeyword;
import java.util.Scanner;
public class VariableScope {
    public static void main(String[] arrgs){
        Scanner value = new Scanner(System.in);
        int number = 0;
        do{
            System.out.println("Enter a number : ");
           // int number = 0;//Local VAriable....
            /** OUTSIDE OF THE THIS CURLI BRACES WE CAN'T USE IT ...*/

            number = value.nextInt();
            //System.out.println("Didn't Match...!");
        }
        while(number != 9);
        System.out.println("Your Given NUmber is Matched ...");
        System.out.println("Thank you . ");
    }
}
