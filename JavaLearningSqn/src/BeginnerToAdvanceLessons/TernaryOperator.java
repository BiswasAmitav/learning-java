package BeginnerToAdvanceLessons;

public class TernaryOperator {
    public static void main(String[] args) {
        //System.out.println(true ? "true" : "false");


        int[] numbers={23,24,53,64,};

        int lsNumber=Integer.MIN_VALUE;

        for (int currentNumber : numbers){
            lsNumber = currentNumber<currentNumber?currentNumber:lsNumber;
        }
        System.out.println(lsNumber);
    }
}
