import acm.program.ConsoleProgram;

/**
 * File : FactorialTable
 * =========================
 * This file generates a table of factorials
 */

public class FactorialTable extends ConsoleProgram {

    /**
     * Private constants
     */
    private final int LOWER_LIMIT = 0;
    private final int UPPER_LIMIT = 10;

    public void run(){
        for( int i = LOWER_LIMIT; i <= UPPER_LIMIT; i++){
            println(i +  " ! = " + factorial(i));
        }
    }

    private int factorial(int n){
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
