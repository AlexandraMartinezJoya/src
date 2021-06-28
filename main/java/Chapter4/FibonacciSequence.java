package Chapter4;

import acm.program.ConsoleProgram;

public class FibonacciSequence extends ConsoleProgram {

    public void run() {
        println("This program displays the first 15 digits of fibonnaci sequence");
        println( "0 1  1 2 3 5 8 13 21 34 55 89 144 233 377");

        int firstFibonacciNumber = 0;
        int secondFibonacciNumber = 1;
        for (int i = 0; i < SEQUENCE_MAX; i++ ) {
            if(firstFibonacciNumber == 0 && secondFibonacciNumber == 1){
                println(" Fib number in sequence is: " + firstFibonacciNumber);
                println( " Fib number in sequence is: " + secondFibonacciNumber);
            }
            int nextFibonnaciNumber = firstFibonacciNumber + secondFibonacciNumber;
            firstFibonacciNumber = secondFibonacciNumber;
            secondFibonacciNumber = nextFibonnaciNumber;
            println(" Fib number in sequence is: " + nextFibonnaciNumber);
        }

    }

    private final int SEQUENCE_MAX = 13;
}
