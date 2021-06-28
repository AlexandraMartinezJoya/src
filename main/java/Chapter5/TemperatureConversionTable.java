import acm.program.ConsoleProgram;

/**
 * File : TemperatrureConversionTable
 * ---------------------------------------------------
 * This program creates a table of Celsius to Fahrenheit equivalents using a function to perform the conversion
 * Code from Art And Science of Java
 * @EricRoberts
 */


public class TemperatureConversionTable extends ConsoleProgram {

    /*Private constants */
    private final int LOWER_LIMIT = 0;
    private final int UPPER_LIMIT = 100;
    private final int STEP_SIZE = 5;

    public void run(){
        println("Celsius to Fahrenheit table");
        for(int c = LOWER_LIMIT; c <= UPPER_LIMIT; c+= STEP_SIZE) {
            int f = (int) celsiusToFahrenheit(c);
            println( c +"C = " + f + "F");
        }
    }

    private double celsiusToFahrenheit(double c){
        return 9.0 / 5.0 * c + 32;
    }
}
