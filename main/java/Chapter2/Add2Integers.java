package Chapter2;

import acm.program.*;

/**
 * This program is one of the exercises found in the Java book.
 * It uses the java reserved keyword for integers.
 *
 * Solved by @AlexandraMartinezJoya
 */
public class Add2Integers extends ConsoleProgram{

    public void run(){
        println("This program adds two numbers. It can only read 10 digits");
        int clinker = readInt("Please type the amount of clinked used for 20kg of cement: ");
        int water = readInt("Please type in the amount of water needed for 20kgs of cement:  ");
        int cement = clinker + water;
        println("The total mixing quantities of cement is " + cement + ".");
    }
}
