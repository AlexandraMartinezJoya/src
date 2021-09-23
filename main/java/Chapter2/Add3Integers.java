package Chapter2;

import acm.program.ConsoleProgram;

/***
 * This program adds three integers. It uses the java reserved keyword for integers
 *
 * Solved by @AlexandraMartinezJoya
 */

public class Add3Integers extends ConsoleProgram {

    public void run(){
        println("This program adds two numbers. It can only read 10 digits");
        int fives = readInt("Please type in the first number and press enter key : ");
        int tens = readInt("Please type in the second number and press enter key:  ");
        int twenties = readInt("Please type in the third number and press enter key:  ");
        int addedInts = fives + tens + twenties;
        println("The total is " + addedInts + ".");
    }
}
