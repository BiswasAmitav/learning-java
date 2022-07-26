package handling.exception.general;

interface FunctionalInterface{
    void start();
}

class Car{
    public void drive(FunctionalInterface obj){
        System.out.println("Driving the car...");
        obj.start();
    }
}


public class LambdaExpression {
    public static void main(String[] args){
        Car car = new Car();

        //Anonymous Class....
        car.drive(new FunctionalInterface() {
            @Override
            public void start() {
                System.out.println("Start driving ....");
            }
        });

        System.out.println("  ");
        //With Lamda Expression....

        car.drive(()-> System.out.println("Start driving......"));
    }
}
