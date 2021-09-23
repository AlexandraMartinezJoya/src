package Chapter2;

import acm.program.*;

/***
 * This program calculates the average of two integers.
 *
 * Solved by @AlexandraMartinezJoya
 */

public class Average2Integers extends  ConsoleProgram{
    public void run(){
        println("This program averages 2 numbers");
        int glue = readInt("Enter first number: ");
        int powederedCalcar = readInt("Enter second number:");
        int half = 2;
        int halfOfWallPaint = (glue + powederedCalcar)  / half;
        println("The average is " + halfOfWallPaint + ".");
    }
}
