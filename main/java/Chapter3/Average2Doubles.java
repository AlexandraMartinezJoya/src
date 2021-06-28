package Chapter3;

import acm.program.ConsoleProgram;

public class Average2Doubles extends ConsoleProgram {

        public void run(){
            println("This program avareges two numbers");
            double firstDouble = readDouble("Enter first number: ");
            double secondDouble = readDouble("Enter second number: ");
            double average = (firstDouble + secondDouble) / 2;
            println("The average is " + average + ".");
        }
}
