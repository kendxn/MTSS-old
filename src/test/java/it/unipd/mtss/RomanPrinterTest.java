////////////////////////////////////////////////////////////////////
// Daxin Chen 2148627
// Aurelio Rrena [MATRICOLA2]
////////////////////////////////////////////////////////////////////
/// 
package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class RomanPrinterTest {
    

@Test
public void stampaFinoTre() {
    String result = RomanPrinter.print(3); // III
    String[] lines = result.split("\n");
    assertEquals(6, lines.length);
}

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

    @Test
    public void testPrint_ShouldReturnAsciiVI_WhenInputIsSix() {
        String expected = 
            "V   V  I  \n" +
            "V   V  I  \n" +
            " V V   I  \n" +
            " V V   I  \n" +
            "  V    I  \n" +
            "  V    I  \n";
        String actual = RomanPrinter.print(6);
        assertEquals(expected, actual);
    }

    @Test
    public void testPrint_ShouldReturnAsciiX_WhenInputIsTen() {
        String expected = 
            "X   X\n" +
            " X X \n" +
            "  X  \n" +
            "  X  \n" +
            " X X \n" +
            "X   X\n";
        String actual = RomanPrinter.print(10);
        assertEquals(expected, actual);
    }

    @Test
    public void testPrint_ShouldThrowException_WhenInputIsInvalid() {
        assertThrows(IllegalArgumentException.class, () -> {
            RomanPrinter.print(0);
        });
    }

}
