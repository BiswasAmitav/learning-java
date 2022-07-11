package javaDataStructureAndAlgorithm;

public class HalfPyramidPattern {
    public static void main(String[] args) {
        int numberOfLine=10;

        for(int i=1;i<=numberOfLine;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
