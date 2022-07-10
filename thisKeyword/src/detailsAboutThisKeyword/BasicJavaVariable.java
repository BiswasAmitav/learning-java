package detailsAboutThisKeyword;

import java.util.Scanner;
public class BasicJavaVariable {

    public static void main(String[] args){

/*
 THESE ARE ALL PRIMITIVE DATA TYPE...
 int aValue=42;
        short aShort=93;
        long aLong=873;
        double aDouble=3.1416;
        float aFloat=5.2323f;

        System.out.println(aValue);
        System.out.println(aShort);
        System.out.println(aLong);
        System.out.println(aDouble);
        System.out.println(aFloat);


 */
        int a;
        short b;
        long c;
        double d;
        float e;

        System.out.println("Enter your integer ....");
        Scanner scan = new Scanner(System.in);
        a=scan.nextInt();
        System.out.println(a);


        System.out.println("Enter your short number.....");
        //Scanner scanShort = new Scanner(System.in);
        b=scan.nextShort();
        System.out.println("Your short : "+b);


        System.out.println("Enter your long number.....");
        //Scanner scanShort = new Scanner(System.in);
        c=scan.nextLong();
        System.out.println("Your long : "+c);
    }

}
