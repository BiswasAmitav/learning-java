package detailsAboutThisKeyword;

public class MultiDimensionalArray {
    public static void main(String[] args){
        // THIS IS REFERRING ONE DIMENSIONAL ARRAY....
        int[] oneDimensionalArray= { 12,13,14};
        //System.out.println(oneDimensionalArray[1]);

        //MULTI DIMENSIONAL ARRAY............
        int[][] multiDimensionalArray = {{12,14,13,15,16},{12,223,44443,534,53},{35,34,23,23}};
        /** THE FIRST SET OF BRCKETS IS HAVING ARRAY INDEX 0..AND INSIDE THAT ONE GENERAL
         * INDEXING WILL BE APPLIED ...AND SECONS BRACKETS IS HAVING INDEX ONE , THEN ACCESSING
         * THESE ELEMENT WE NEED TO APPLY GENRAL INDEXING OF ARRAY */

        //System.out.println(multiDimensionalArray[0][1]);//FIRST BRACES IS FREFFREING THE MAIN GROUP OF ARRAY AND SECOND BRACE
        //IS REFERRING THAT GENERAL ELEMENT INDEXING....

        //System.out.println(multiDimensionalArray[1][2]);


        /* NOW IN THIS SECTION WE'RE GOING TO LEARN HOW TO PRINT ALL THE ELEMENT OF MULTIDIMENSIONAL
        * ARRAY ........*/
        for(int array=0;array<multiDimensionalArray.length;array++){
            for(int item=0;item<multiDimensionalArray[array].length;item++){
                System.out.print(multiDimensionalArray[array][item] + "\t");
            }
            System.out.println(" ");
        }

    }
}
