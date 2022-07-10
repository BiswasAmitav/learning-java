package detailsAboutThisKeyword;

class Animal{
    void eat(){
        System.out.println("First animals is eating bread.....");
    }
}

class Dog extends Animal{
    void eat(){
        System.out.println("Extends animals is eating bread.....");
    }
    void bark(){
        System.out.println("Dog is barking...");
    }
    void work(){
        /* HERE WE USE SUPER CLASS BCZ WE NEED TO ACCESS THE FIRST EAT....
        * THE REASON IS WE'RE ACCESSING OUTSIDE OF THE EXTEND CLASS*/
        super.eat();//first eat is called which is staying outide of the extends class
        this.eat();//current instance or current method.....
        this.bark();
    }
}
public class SuperTest2 {
    public static void main(String[] args){
        //System.out.println("Hello ");//TOR TESTING

        Animal obj=new Animal();//its reffreing first eat....
        obj.eat();

        Dog d=new Dog();//its reffering the class which is extended class dog...
        d.work();
    }
}
