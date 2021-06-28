package Chapter3;

import acm.program.ConsoleProgram;

public class KilogramsToPoundsAndOunces extends ConsoleProgram {

    public void run() {
        println("This program converts kilograms to pounds and ounces");
        double kilograms = readDouble("Enter number of kilograms: ");

        double totalPounds = kilogramsToPounds(kilograms) ;
        double totalOunces =  totalPounds * OUNCES_PER_POUND;
        println((int)kilograms + "kgs = " + (int)totalPounds + "pounds and " + (int)totalOunces+"ounces");
    }

    private double kilogramsToPounds(double kilograms){
        return   kilograms * POUNDS_PER_KILOGRAM;
    }
    /*private constants*/
    private final double  POUNDS_PER_KILOGRAM = 2.2;
    private final int OUNCES_PER_POUND = 16;
}
