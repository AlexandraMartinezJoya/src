package Chapter3;

import acm.program.ConsoleProgram;

public class FeetAndInchesToCentimeters extends ConsoleProgram {

        public void run() {
            println("This program converts feet and inches to centimeters.");
            double feet = readDouble("Enter number of feet: ");
            double inches = readDouble("Enter number of inches: ");
            double totalInches = feetToInches(feet) + inches;
            double centimeters =  totalInches * CENTIMETERS_PER_INCH;
           println((int)feet + "ft " + (int)inches + "in = " + centimeters+"cm.");
        }

        private double feetToInches(double feet){
            return   feet * INCHES_PER_FOOT;
        }
    /*private constants*/
    private final double  CENTIMETERS_PER_INCH = 2.54;
    private final int INCHES_PER_FOOT = 12;
}
