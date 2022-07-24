package handling.exception.example1;



class Name{
    String firstName;
    String lastName;
//    public Name(String firstName, String lastName){
//        this.lastName=firstName;
//        this.lastName=lastName;
//
//
//    }
            void displayName(String firstName, String lastName){
                this.firstName=firstName;
                this.lastName=lastName;
            System.out.println(firstName+" "+lastName);
        }

}

public class Example1 {
    public static void main(String[] args) {

        System.out.println("Here i will be learn by example....");
        Name name = new Name();
        name.displayName("Amitav","Biswas");
    }
}
