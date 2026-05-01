////////////////////////////////////////////////////////////////////
// Daxin Chen 2148627
// Aurelio Rrena [MATRICOLA2]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {

    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        StringBuilder result = new StringBuilder();
        
        for (int row = 0; row < 6; row++) {
            for (char c : romanNumber.toCharArray()) {
                result.append(getAsciiRow(c, row));
            }
            result.append("\n");
        }
        
        return result.toString();
    }

    private static String getAsciiRow(char c, int row) {
        switch (c) {
            case 'I':
                String[] i = {
                    "  I  ",
                    "  I  ",
                    "  I  ",
                    "  I  ",
                    "  I  ",
                    "  I  "
                };
                return i[row];

            default:
                return "";
        }
    }
}