package Chapter4;

import acm.program.ConsoleProgram;

public class AddNIntegers extends ConsoleProgram {

    public void run(){
        println("This program adds "+ (int)NUMBER_OF_INTEGERS +" numbers");

        double total = 0;
        for (int i = 0; i < NUMBER_OF_INTEGERS; i++) {
            int numberCount = 1 + i;
            int number = readInt("please enter " + numberCount + " number: ");
            total += number;
        }
        println("The total  is " + total + ".");
    }

    private final double NUMBER_OF_INTEGERS = 10;
}
