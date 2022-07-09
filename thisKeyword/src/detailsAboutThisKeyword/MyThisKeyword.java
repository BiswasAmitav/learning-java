package detailsAboutThisKeyword;
import java.util.*;
import java.lang.String;
public class MyThisKeyword {
//INSTANCE VARIABLE IN CURRENT CLASS INTERMS OF MyThisKeyord  CONSTUCTIOR
    String firstName;
    String lastName;


    void msg(){
        System.out.print("Your full name is : ");
    }


    MyThisKeyword(String firstName, String lastName){
        //HERE COMPILER WILL PRINT NULL VALUE ....TO OVEROCME THIS SITUATION WE NEED THIS KEYWORD
//        firstName=firstName;
//        lastName=lastName;


        this.firstName=firstName;//CALLED INSTANCE VARIABLE MEANS THE CURRENT VARIABLE...
        this.lastName=lastName;//CALLED INSTANCE VARIABLE MEANS THE CURRENT VARIABLE...
        //this.msg();//INVOKE MSG METHOD BY THIS KEWYWORD....

        msg();//IF WE DONTWRITE THIS THEN ONLY IT WILL WORK , BCZ COMPILER DEFAULTLY WRITE A THIS THEN ITS WORK...
    }
    //FOR DISPLAYING THE NUMBERS...

    void display(){
//        System.out.println("First Name : " + firstName + "Last name : " + lastName);
        System.out.println(/*"Your full name is : " + */  firstName + " "+ lastName);
    }

    public static void main(String[] args){
       // System.out.println("hello");

//FOR TAKING INPUT AS FIRST NAME...........
        System.out.println("Entr your first name : ");
        String firstName;
        Scanner firstNameInput= new Scanner(System.in);
        firstName =firstNameInput.nextLine();

        //FOR TAKING INPUT AS LAST NAME .............
        String lastName;
        System.out.println("Enter your last name : ");
        Scanner lastNameInput=new Scanner(System.in);
        lastName=lastNameInput.nextLine();


        MyThisKeyword obj = new MyThisKeyword(firstName,lastName);
        obj.display();

    }
}
