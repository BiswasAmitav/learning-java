package BeginnerToAdvanceLessons;


class Laptop{
    private int id;
    private String brand;

    public Laptop(int id, String brand){
        this.id=id;
        this.brand=brand;
    }

    public String toString(){
        return "Laptop [ id " + id + " , brand " + brand + " ]";
    }
}

public class TheEqualsMethod {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop(230, " hp");
        Laptop laptop2 = new Laptop(6732," Dell");

        System.out.println(laptop1.equals(laptop2));
    }
}
