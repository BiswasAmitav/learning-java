package BeginnerToAdvanceLessons;


class Employee{
    private int id;
    private String name;

    public Employee(int id, String name){
        this.id=id;
        this.name=name;
    }
    public String toString(){
        return " ID : "+id+" "+ " Full name : "+ name;
    }
}


public class ToStringClass {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1001,"Amitav Biswas");
        Employee employee2 = new Employee(2002,"Protap Biswas");

        System.out.println(employee1);
        System.out.println(employee2);

    }
}
