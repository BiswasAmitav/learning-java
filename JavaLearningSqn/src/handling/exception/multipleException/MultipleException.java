package handling.exception.multipleException;

import java.io.IOException;
import java.text.ParseException;
public class MultipleException {
    public static void main(String[] args) {
        System.out.println("Multiple exception...");

        MultipleExceptions me = new MultipleExceptions();
       // extracted(me);
      try{
           me.start();
        }catch (IOException e){
            e.printStackTrace();
        }catch (ParseException e){
           // e.printStackTrace();
            System.out.println("Incorrect...!");
        }
    }

//    private static void extracted(MultipleExceptions me) throws IOException, ParseException {
//        me.start();
//    }
}
