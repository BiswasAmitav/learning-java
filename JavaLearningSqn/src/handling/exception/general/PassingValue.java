package handling.exception.general;

public class PassingValue {
    public static void main(String[] args) {
        System.out.println("Here I'm going to learn how to pass value by another one .....");

        PassingValue passValue=new PassingValue();

        int number = 10;
        System.out.println(" 1. number = "+number);

        passValue.display(number);
        System.out.println("4 . number "+number);
    }

    public void display(int number){
        System.out.println("2. number " + number);
        number=15;
        System.out.println(" 3. number" +number);
    }
}
