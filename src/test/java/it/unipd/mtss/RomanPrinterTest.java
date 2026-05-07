////////////////////////////////////////////////////////////////////
// Daxin Chen 2148627
// Aurelio Rrena 2147993
////////////////////////////////////////////////////////////////////
/// 
package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RomanPrinterTest {
    

public void testPrint_ShouldReturnAsciiI_WhenInputIsOne() {
        String expected = 
            "  I  \n" +
            "  I  \n" +
            "  I  \n" +
            "  I  \n" +
            "  I  \n" +
            "  I  \n";
        String actual = RomanPrinter.print(1);
        assertEquals(expected, actual);
    }

@Test
public void testPrint_ShouldReturnAsciiV_WhenInputIsFive() {
    String expected = 
        "V   V\n" +
        "V   V\n" +
        " V V \n" +
        " V V \n" +
        "  V  \n" +
        "  V  \n";
    String actual = RomanPrinter.print(5);
    assertEquals(expected, actual);
}

}
