package Chapter7;

import acm.program.ConsoleProgram;

/**
 * This program converts hexadecimals to decimals.
 * Constraints:  use Interger.parseInt and Integer.toString methods
 */

public class HexToDecimalConverter extends ConsoleProgram {

    /* Private constants */
    private final int SENTINEL_VALUE = 0;


    public void run(){
        println("This program converts hexadecimal to decimal.");
        println("Enter 0 to stop.");
        String hexadecimal = readLine("Enter a hexadecimal number: ");
        while (!hexadecimal.equals("0")){
            int decimal = hexToDecimal(hexadecimal);
            println( hexadecimal + " hex = " + decimal + " decimal.");
            hexadecimal = readLine("Enter a hexadecimal number: ");
        }
    }

    private int hexToDecimal(String hexadecimal){
        return hexDecode(hexadecimal);
    }

    private boolean digitsRemain(String hexadecimal){
        return hexadecimal.length() > 0;
    }

    private int hexDecode(String hexadecimal){
       int total = 0;
        int count = 0;
        int incrementor = 16;
        while(digitsRemain(hexadecimal)){
            String digit = extractLastDigit(hexadecimal);
            int digitValue = 0;
            switch (digit){
                case "A" :
                    digitValue = 10; break;
                case "B" :
                    digitValue = 11; break;
                case "C" :
                    digitValue = 12; break;
                case "D":
                    digitValue = 13; break;
                case "E":
                    digitValue = 14; break;
                case "F" :
                    digitValue = 15; break;
                default:
                    digitValue = new Integer(digit);
            }
            if(count == 0) {
                total += digitValue;
            } else {
                total += count *  incrementor * digitValue ;
            }
            hexadecimal = removeLastDigit(hexadecimal);
            count++;
        }
        return total;
    }

    private String extractLastDigit(String hexadecimal){
        return "" + hexadecimal.charAt(hexadecimal.length() - 1);
    }

    private String removeLastDigit(String hexadecimal){
        return hexadecimal.substring(0, hexadecimal.length() -1);
    }
}
