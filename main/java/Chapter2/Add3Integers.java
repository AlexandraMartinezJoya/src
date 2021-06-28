package Chapter2;

import acm.program.ConsoleProgram;

public class Add3Integers extends ConsoleProgram {

    public void run(){
        println("This program adds two numbers. It can only read 10 digits");
        int fistNumber = readInt("Please type in the first number and press enter key : ");
        int secondNumber = readInt("Please type in the second number and press enter key:  ");
        int thirdNumber = readInt("Please type in the third number and press enter key:  ");
        int addedNumbers = fistNumber + secondNumber + thirdNumber;
        println("The total is " + addedNumbers + ".");
    }
}
