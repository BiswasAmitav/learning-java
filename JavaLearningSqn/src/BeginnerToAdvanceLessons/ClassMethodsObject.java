package BeginnerToAdvanceLessons;

class Amit{

    int a;

    void display(){
        System.out.println("I am amit");
    }

    int calci(){
        //this.a=a;
        //System.out.println("your given a value is : " + a);
        int result=a*a;
        return result;
    }
}
public class ClassMethodsObject {

    public static void main(String[] args) {
//        System.out.println("hello");
//        System.out.println();
//
        Amit amit = new Amit();
        amit.a=2;
        int square = amit.calci();


        amit.calci();
        System.out.println(square);

    }
}
