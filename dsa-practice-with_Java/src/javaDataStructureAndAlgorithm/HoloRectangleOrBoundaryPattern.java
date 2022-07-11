package javaDataStructureAndAlgorithm;

public class HoloRectangleOrBoundaryPattern {
    public static void main(String[] args) {
        int lineNumber=5;
        int elementNumberOfEachLine=15;

        for(int i=1;i<=lineNumber;i++){
            for(int j=1;j<=elementNumberOfEachLine;j++){
                if(i==1 || j==1 || i==lineNumber || j==elementNumberOfEachLine){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
