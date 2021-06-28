package Chapter2;

import acm.program.*;

public class Average2Integers extends  ConsoleProgram{
    public void run(){
        println("This program avarages 2 numbers");
        int n1 = readInt("Enter first number: ");
        int n2 = readInt("Enter second number:");
        double average = (n1 + n2)  / 2.0;
        println("The average is " + average + " ");
    }
}
