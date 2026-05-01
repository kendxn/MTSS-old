package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class IntegerToRomanTest {
    
    @Test
    void checkRes(){    
        IntegerToRoman ir = new IntegerToRoman();
        String ris=ir.convert(3);
        assertEquals("III", ris);
    }   


}
