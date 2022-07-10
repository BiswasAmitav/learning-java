package detailsAboutThisKeyword;
import java.util.Scanner;
public class TakeMultipleInputOnArray {
    public static void main(String[] args){

        System.out.println("Number of element : ");
        Scanner sc = new Scanner(System.in);
        int numOfElement=sc.nextInt();

        int[] arrayNumber = new int[numOfElement];

        for(int i=0;i<numOfElement;i++){
            int serial=1+i;
            System.out.println("Enter your "+ serial +"th" +" element of array");
            arrayNumber[i] = sc.nextInt();
        }
        System.out.println(
                "Your entire array is : "
        );
        for(int i=0;i<arrayNumber.length;i++){
            System.out.print(arrayNumber[i]+" ");
        }


    /*    arrayNumber[0] = 15;
        arrayNumber[1] = 20;
        System.out.println(arrayNumber[0]);
        System.out.println(arrayNumber[1]);

     */

    }
}
