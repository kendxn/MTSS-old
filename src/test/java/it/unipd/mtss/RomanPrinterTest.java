////////////////////////////////////////////////////////////////////
// Daxin Chen 2148627
// Aurelio Rrena [MATRICOLA2]
////////////////////////////////////////////////////////////////////
/// 
package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RomanPrinterTest {
    

@Test
public void stampaFinoTre() {
    String result = RomanPrinter.print(3); // III
    String[] lines = result.split("\n");
    assertEquals(6, lines.length);
}

}
