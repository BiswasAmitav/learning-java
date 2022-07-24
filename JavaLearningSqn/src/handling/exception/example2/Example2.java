package handling.exception.example2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
       /* System.out.println("Hello amit example 2 for exception handling .....");

        File file = new File("example.text");

        try{
            Scanner readFile = new Scanner(file);
            System.out.println("Hello there..!");
        }
        catch (FileNotFoundException e){
            //Auto generated catch block............

            //e.printStackTrace();
            System.out.println("File not found : "+file.toString());
        }*/



        //====================================
        //  another way to handle this kind of situation

        //WE'RE GOING TO CONTROL OUR EXCEPTION

        try{
            read();
        }
        catch(FileNotFoundException e){
            System.out.println("File not found ");
        }
    }

    public static void read() throws FileNotFoundException {
        File file = new File("example.text");
        Scanner readFile = new Scanner(file);
    }
}
