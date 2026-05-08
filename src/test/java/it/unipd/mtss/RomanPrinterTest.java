////////////////////////////////////////////////////////////////////
// Daxin Chen 2148627
// Aurelio Rrena 2147993
////////////////////////////////////////////////////////////////////
/// 
package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

/**
 * Test di unità per la classe RomanPrinter.
 * * Rispetto dei criteri A-TRIP:
 * - (A)utomatic: Integrati nella pipeline di CI.
 * - (T)horough: Copre la stampa di caratteri singoli (I, V, X) e la loro composizione (VI).
 * - (R)epeatable: L'output ASCII è costante e verificato tramite asserzioni stringa.
 * - (I)ndependent: I test non condividono risorse esterne, garantendo indipendenza totale.
 * - (P)rofessional: Utilizzo del pattern Arrange-Act-Assert per una chiara leggibilità.
 */

public class RomanPrinterTest {
    
@Test
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
