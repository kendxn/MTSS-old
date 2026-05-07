////////////////////////////////////////////////////////////////////
// Daxin Chen 2148627
// Aurelio Rrena 2147993
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

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
