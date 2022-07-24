package BeginnerToAdvanceLessons;

import java.util.Scanner;

public class DoWhileCheck {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        boolean okay=true;

        do{
            System.out.println("Enter a Line : ");
            String line=scanner.nextLine();
            System.out.println("Your entered : " + line);

            if("quite".equals(line)){
                okay=false;
            }
        }while (okay);
    }
}
