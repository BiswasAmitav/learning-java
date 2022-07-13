package polymorphism;

public class Polymorphism {
    public static void main(String[] args) {

        Vechile vehicle1 = new Vechile();
        Car car = new Car();// Car is extends to vechile...

        Vechile vehicle2 = car;
       // vehicle2.design();

        car.ride();
        //vehicle2.ride();

        createDesign(car);
    }
    public static void createDesign(Vechile vehicle){
        vehicle.design();
    }
}
