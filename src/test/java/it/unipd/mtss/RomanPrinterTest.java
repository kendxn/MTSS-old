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
    public void testPrint_ShouldReturnAsciiXIV_WhenInputIsFourteen() {
        String expected = 
            "X   X  I  V   V\n" +
            " X X   I  V   V\n" +
            "  X    I   V V \n" +
            "  X    I   V V \n" +
            " X X   I    V  \n" +
            "X   X  I    V  \n";
        String actual = RomanPrinter.print(14);
        assertEquals(expected, actual);
    }

    @Test
    public void testPrint_ShouldReturnAsciiXX_WhenInputIsTwenty() {
        String expected = 
            "X   XX   X\n" +
            " X X  X X \n" +
            "  X    X  \n" +
            "  X    X  \n" +
            " X X  X X \n" +
            "X   XX   X\n";
        String actual = RomanPrinter.print(20);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPrint_ShouldReturnAsciiXL_WhenInputIsForty() {
        String expected = 
            "X   XL    \n" +
            " X X L    \n" +
            "  X  L    \n" +
            "  X  L    \n" +
            " X X L    \n" +
            "X   XLLLLL\n";
        String actual = RomanPrinter.print(40);
        assertEquals(expected, actual);
    }

    @Test
    public void testPrint_ShouldReturnAsciiL_WhenInputIsFifty() {
        String expected = 
            "L    \n" +
            "L    \n" +
            "L    \n" +
            "L    \n" +
            "L    \n" +
            "LLLLL\n";
        String actual = RomanPrinter.print(50);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPrint_ShouldReturnAsciiXC_WhenInputIsNinety() {
        String expected = 
            "X   X CCCC\n" +
            " X X C    \n" +
            "  X  C    \n" +
            "  X  C    \n" +
            " X X C    \n" +
            "X   X CCCC\n";
        String actual = RomanPrinter.print(90);
        assertEquals(expected, actual);
    }

    @Test
    public void testPrint_ShouldReturnAsciiC_WhenInputIsOneHundred() {
        String expected = 
            " CCCC\n" +
            "C    \n" +
            "C    \n" +
            "C    \n" +
            "C    \n" +
            " CCCC\n";
        String actual = RomanPrinter.print(100);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPrint_ShouldReturnAsciiCD_WhenInputIsFourHundred() {
        String expected = 
            " CCCCDDDD \n" +
            "C    D   D\n" +
            "C    D   D\n" +
            "C    D   D\n" +
            "C    D   D\n" +
            " CCCCDDDD \n";
        String actual = RomanPrinter.print(400);
        assertEquals(expected, actual);
    }

    @Test
    public void testPrint_ShouldReturnAsciiD_WhenInputIsFiveHundred() {
        String expected = 
            "DDDD \n" +
            "D   D\n" +
            "D   D\n" +
            "D   D\n" +
            "D   D\n" +
            "DDDD \n";
        String actual = RomanPrinter.print(500);
        assertEquals(expected, actual);
    }

@Test
    public void testPrint_ShouldThrowException_WhenInputIsInvalid() {
        assertThrows(IllegalArgumentException.class, () -> {
            RomanPrinter.print(0);
        });
    }

}
