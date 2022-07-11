package BeginnerToAdvanceLessons;

class Program{
    int value;
    double value1;

    public Program(){
        this(5);//THIS IS CALLING SECOND CONSTRUCTOR....

        System.out.println("First constructor ....");
        value=15;
    }

    public Program(int value){
        this(7,7.71);//THIS IS CALLING THIRD CONSTRUCTOR....
        this.value=value;
        System.out.println("Second Constructor : " + value);
    }
    public Program(int value, double value1){
        this.value=value;
        this.value1=value1;
        System.out.print("I am fromm third constructor : ");
        System.out.println("int : "+ value+" Double : "+ value1);
    }
}
public class ThisVsThisBraces {
    public static void main(String[] args){
        //System.out.println("hello..");

        Program myProgram = new Program(); //SECOND PART THAT MEANS AFTER = NEW PROGRAM() MAKE THIS CONSTRUCTOR RUN...
        new Program(2);//MAKE THE CONSTRUCTOR RUN...
        new Program(2,3.13);

    }
}
