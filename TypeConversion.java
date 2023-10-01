import java.util.Calendar;
import java.util.Date;
public class TypeConversion {
    public static void main(String[] args) {
        /*
        //Implicit casting
        byte byteVar = 42;
        short shortVar = byteVar;
        int intVar = shortVar;
        long longVar = intVar;
        float floatVar = longVar;
        double doubleVar = floatVar;
        
        //Explicit casting
        double doubleVar = 42.0d;
        float floatVar = (float) doubleVar;
        long longVar = (long) floatVar;
        int intVar = (int) longVar;
        short shortVar = (short) intVar;
        byte byteVar = (byte) shortVar;
        // Casting float/double automatically rounds down
        */

        Object obj = Calendar.getInstance();
        long time = 0;
        if(obj instanceof Calendar) {
            time=((Calendar)obj).getTimeInMillis();
        }
        if(obj instanceof Date) {
            time=((Date)obj).getTime();
        }

        System.out.println(time);
    }
}
