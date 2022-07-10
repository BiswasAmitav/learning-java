package detailsAboutThisKeyword;

public class MyThisClass {
    int age ;
    String name;

   /* MyThisClass(){//    ITS CALLED DEFAULT CONSTRUCTOR BCZ IT DOSENT HAVE ANY PARAMETER ..

    }*/


    /*MyThisClass(int b, String c){//ITS CALLED CUSTOM CONSTRUCTOR BCZ HERE WE PASS PARAMETER ...
        age=b;
        name=c;
    }*/


    MyThisClass(int age, String name){//BY USING THIS
        this.age=age;
        this.name=name;
    }
    void display(){
        System.out.println("Value:"+age+"Name:"+name);
    }


    public static void main(String[] args){
        MyThisClass obj=new MyThisClass(20,"amitav");
        obj.display();
    }
}
