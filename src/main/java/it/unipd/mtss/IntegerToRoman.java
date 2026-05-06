////////////////////////////////////////////////////////////////////
// Daxin Chen 2148627
// Aurelio Rrena [MATRICOLA2]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;
import java.util.TreeMap;


public class IntegerToRoman {


    public static TreeMap<Integer, String> keys = new TreeMap<Integer, String>();

    static {
        keys.put(1, "I");
        keys.put(4, "IV");
        keys.put(5, "V");

    }

public static String convert(int number) {
    StringBuilder result = new StringBuilder();
    
    while (number > 0) {
        Integer l = keys.floorKey(number);
        
        if (l == null)  break; 
        result.append(keys.get(l));
        
        number -= l;
    }
    
    return result.toString();
}

}