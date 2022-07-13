package BeginnerToAdvanceLessons;

public class InheritanceAndAccessModifiers {

    public static void main(String[] args) {

        //ACCESS MODIFIERS.....1.public, 2.protected, 3.default(lack of access modifier), 4.private ....



        Factory factory1 = new Factory();

        //factory1.design();
        //factory1.build();


        Car car1 = new Car();

        car1.design();
        car1.build();
        car1.brand();

    }

}
