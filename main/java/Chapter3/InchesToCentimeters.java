package Chapter3;

import acm.program.ConsoleProgram;

public class InchesToCentimeters extends ConsoleProgram {

    public void run(){
        println("This program converts inches to centimeters");
        double inches = readDouble("Enter value in inches: ");
        double cm = inches * CENTIMETERS_PER_INCH;
        println(inches +  "in =  " + cm + "cm");
    }

    /*private constants*/
    private final double  CENTIMETERS_PER_INCH = 2.54;
}
