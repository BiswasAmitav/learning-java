package learningConstructorInJava;
import java.util.*;
import java.lang.String;
class Student {
    int id;
    String name;
    double pi;

    //CREATING PARAMETERIZED CONSTRUCTOR....
    Student(int i,String n){
        id=i;
        name=n;
    }
    //HERE I AM OVERLOADDING THE CONSTRUCTOR ....
    Student(int i,String n, double f){
        id=i;
        name=n;
        pi=f;

    }
    void display(){
        System.out.println(id + " " +name+" "+pi);
    }

    public static void main(String[] args) {
//        Scanner inputTaken=new Scanner(System.in);
//        System.out.print("Enter your ID : ");
//
//        int id=inputTaken.nextInt();
//        System.out.println("Enter your name : ");
//        Scanner input=new Scanner(System.in);
//        String name = input.nextLine();
//        System.out.println("your id : " + id);
//        System.out.println("your name : "+ name);


        // CREATING OBJECT FOR STUDENT...
        Student s1=new Student(12,"Amitav",3.12L);
        Student s2 =new Student(12,"Robin");
        s1.display();
    }
}
