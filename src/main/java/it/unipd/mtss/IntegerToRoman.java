////////////////////////////////////////////////////////////////////
// Daxin Chen 2148627
// Aurelio Rrena [MATRICOLA2]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;
import java.util.TreeMap;


public class IntegerToRoman {


    public final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

    static {

        map.put(1, "I");

    }

    public static String convert(int number) {
        int l =  map.floorKey(number);
        if ( number == l ) {
            return map.get(number);
        }
        return map.get(l) + convert(number-l);
    }
}