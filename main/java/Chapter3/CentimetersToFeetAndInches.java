package Chapter3;

import acm.program.ConsoleProgram;

public class CentimetersToFeetAndInches extends ConsoleProgram {

    public void run(){
        println("This program converts centimeters to feet and inches.");
        double cm = readDouble("Enter value in centimeters: ");
        double totalInches = cm / CENTIMETERS_PER_INCH;
        int feet = (int) (totalInches / INCHES_PER_FOOT);
        double inches = totalInches - INCHES_PER_FOOT * feet;
        println(cm + "cm = " + feet  + "ft + " + inches + " inches");
    }

    /*private constants*/
    private final int INCHES_PER_FOOT = 12;
    private final double CENTIMETERS_PER_INCH = 2.54;
}
