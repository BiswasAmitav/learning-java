package handling.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//import com.sun.jdi.PathSearchingVirtualMachine;

public class ExceptionHandlingBasic {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Hello world....");

        File file  = new File("example.text");
        Scanner readFile = new Scanner(file);
    }
}
