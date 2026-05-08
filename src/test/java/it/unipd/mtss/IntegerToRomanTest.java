////////////////////////////////////////////////////////////////////
// Daxin Chen 2148627
// Aurelio Rrena 2147993
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

/**
 * Test di unità per la classe IntegerToRoman.
 * * Semplificazione dei criteri A-TRIP applicati:
 * - (A)utomatic: I test sono eseguiti automaticamente tramite Maven e GitHub Actions.
 * - (T)horough: Vengono testati i casi limite (1, 10), i numeri intermedi e le condizioni di errore (0, negativi).
 * - (R)epeatable: I test sono deterministici e producono lo stesso risultato a ogni esecuzione.
 * - (I)ndependent: Ogni metodo di test è isolato e non dipende dallo stato o dall'esito degli altri.
 * - (P)rofessional: Il codice dei test segue gli standard di pulizia, naming e documentazione del progetto.
 */

public class IntegerToRomanTest {
    
    @Test
    void convertToThree(){    
        IntegerToRoman ir = new IntegerToRoman();
        String uno=ir.convert(1);
        assertEquals("I", uno); 

        String due=ir.convert(2);
        assertEquals("II", due);
        String tre=ir.convert(3);
        assertEquals("III", tre);
        assertNotEquals(uno, tre);
    }   


    @Test
    void convertFourToSix(){    
        IntegerToRoman ir = new IntegerToRoman();
        String quattro=ir.convert(4);
        assertEquals("IV", quattro);
        
        String cinque = ir.convert(5);
        assertEquals("V", cinque);
        
        String sei = ir.convert(6);
        assertEquals("VI", sei);
   
    }
    
    @Test
    void convertSevenToTen() {    
        IntegerToRoman ir = new IntegerToRoman();
        String sette = ir.convert(7);
        assertEquals("VII", sette);
        
        String otto = ir.convert(8);
        assertEquals("VIII", otto);
        
        String nove = ir.convert(9);
        assertEquals("IX", nove);
        
        String dieci = ir.convert(10);
        assertEquals("X", dieci);
    }
    
    @Test
    void convertElevenToTwenty() {    
        IntegerToRoman ir = new IntegerToRoman();
        
        String undici = ir.convert(11);
        assertEquals("XI", undici);
        
        String quattordici = ir.convert(14);
        assertEquals("XIV", quattordici);
        
        String diciannove = ir.convert(19);
        assertEquals("XIX", diciannove);
        
        String venti = ir.convert(20);
        assertEquals("XX", venti);
    }
    
    @Test
    void convertTwentyOneToFifty() {    
        IntegerToRoman ir = new IntegerToRoman();
        
        String trentanove = ir.convert(39);
        assertEquals("XXXIX", trentanove);
        
        String quaranta = ir.convert(40);
        assertEquals("XL", quaranta);
        
        String quarantaquattro = ir.convert(44);
        assertEquals("XLIV", quarantaquattro);
        
        String quarantanove = ir.convert(49);
        assertEquals("XLIX", quarantanove);
        
        String cinquanta = ir.convert(50);
        assertEquals("L", cinquanta);
    }
    
    @Test
    void convertFiftyOneToOneHundred() {    
        IntegerToRoman ir = new IntegerToRoman();
        
        String ottantanove = ir.convert(89);
        assertEquals("LXXXIX", ottantanove);
        
        String novanta = ir.convert(90);
        assertEquals("XC", novanta);
        
        String novantaquattro = ir.convert(94);
        assertEquals("XCIV", novantaquattro);
        
        String novantanove = ir.convert(99);
        assertEquals("XCIX", novantanove);
        
        String cento = ir.convert(100);
        assertEquals("C", cento);
    }
    
    @Test
    void convertOneHundredOneToFiveHundred() {    
        IntegerToRoman ir = new IntegerToRoman();
        
        String trecentonovantanove = ir.convert(399);
        assertEquals("CCCXCIX", trecentonovantanove);
        
        String quattrocento = ir.convert(400);
        assertEquals("CD", quattrocento);
        
        String quattrocentoquarantaquattro = ir.convert(444);
        assertEquals("CDXLIV", quattrocentoquarantaquattro);
        
        String cinquecento = ir.convert(500);
        assertEquals("D", cinquecento);
    }
    
    
    @Test
    void testConvert_ShouldThrowException_WhenInputIsZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            IntegerToRoman.convert(0);
        });
    }

    @Test
    void testConvert_ShouldThrowException_WhenInputIsNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            IntegerToRoman.convert(-1);
        });
    }
    
}
