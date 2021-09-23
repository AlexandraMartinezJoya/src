package Chapter2;

import acm.program.*;

/***
 * This program adds two by two doubles. It uses the java reserved keyword for doubles
 *
 * Solved by @AlexandraMartinezJoya
 */
public class Add2Doubles extends ConsoleProgram {

    public void run(){
        println("this program adds two doubles");
        double flour = readDouble("Enter first number: ");
        double eggs = readDouble("Enter second number: ");
        double butter = readDouble("Enter second number: ");
        double raisins = readDouble("Enter second number: ");

        double flourRaisins = flour + raisins;
        double butteredEggs = eggs + butter;

        double newCakeDough = flourRaisins + butteredEggs;
        println("The new dough recipie weights: " + newCakeDough + ".");
    }
}
