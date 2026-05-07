////////////////////////////////////////////////////////////////////
// Daxin Chen 2148627
// Aurelio Rrena 2147993
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;
import java.util.TreeMap;


public class IntegerToRoman {


    private static final TreeMap<Integer, String> keys = new TreeMap<Integer, String>();

    static {
        keys.put(1, "I");
        keys.put(4, "IV");
        keys.put(5, "V");

    }

public static String convert(int number) {
    StringBuilder result = new StringBuilder();
    
    if (number <= 0 || number > 1000) {
        throw new IllegalArgumentException("Il numero deve essere compreso tra 1 e 1000");
    }
    
    while (number > 0) {
        Integer l = keys.floorKey(number);
        
        if (l == null)  break; 
        result.append(keys.get(l));
        
        number -= l;
    }
    
    return result.toString();
}

}
