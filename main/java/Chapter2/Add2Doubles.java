package Chapter2;

import acm.program.*;

public class Add2Doubles extends ConsoleProgram {

    public void run(){
        println("this program adds two doubles");
        double number1 = readDouble("Enter first number: ");
        double number2 = readDouble("Enter second number: ");
        double total = number1 + number2;
        println("The total is " + total + ".");
    }
}
