////////////////////////////////////////////////////////////////////
// Daxin Chen 2148627
// Aurelio Rrena 2147993
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
            case 'V':
                String[] v = {
                    "V   V",
                    "V   V",
                    " V V ",
                    " V V ",
                    "  V  ",
                    "  V  "
                };
                return v[row];
            case 'X':
                String[] x = {
                    "X   X",
                    " X X ",
                    "  X  ",
                    "  X  ",
                    " X X ",
                    "X   X"
                };
                return x[row];
            default:
                return "";
            


        }
    }
}
