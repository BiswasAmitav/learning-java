package BeginnerToAdvanceLessons;

class Student{

    public String name;
    public static String studentClass;

    public void studentName(){
        System.out.println( studentClass);
    }

    public static void classInfo(){
        System.out.println(studentClass);
        //this gives you an error ..  System.out.println(name);
    }


}
public class StaticAndFinal {
    public static void main(String[] args) {

        Student.studentClass = "Web development Fundamentals";
        System.out.println(Student.studentClass);
       // Student.studentName();
        Student.classInfo();


        Student student1 = new Student();
        Student student2 = new Student();

        student1.name="Stream";
        student2.name="online";

    }
}
