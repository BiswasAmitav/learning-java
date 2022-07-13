package BeginnerToAdvanceLessons;

public class CastingNumericalValues {
    public static void main(String[] args){
        //System.out.println("hello world .. ");

        //HERE WE WILL LEARN CASTING OF DATA TYPE...

        byte byteValue=3;
        short shortValue=38;
        int intValue=29;
        long longValue=89272897;

        float floatValue = 923.92F;
        double doubleValue=90320.2;

        intValue= (int) longValue; //I CASTED LONG VALUE AND STORED IT INT VALUE....
        //System.out.println(floatValue);
       //System.out.println(Short.MAX_VALUE);

        intValue=(int) floatValue;

        System.out.println(intValue);
    }
}
