package Chapter4;

import acm.program.ConsoleProgram;

public class SecondFibonacciSequence extends ConsoleProgram {

    public void run() {
        println("This program displays the first numbers of fibonnaci sequence which are smaller than 10000");

        int firstFibonacciNumber = 0;
        int secondFibonacciNumber = 1;
       while(firstFibonacciNumber < SMALLER_THAN){
            if(firstFibonacciNumber == 0 && secondFibonacciNumber == 1){
                println(" Fib number in sequence is: " + firstFibonacciNumber);
                println( " Fib number in sequence is: " + secondFibonacciNumber);
            }
            int nextFibonnaciNumber = firstFibonacciNumber + secondFibonacciNumber;
            firstFibonacciNumber = secondFibonacciNumber;
            secondFibonacciNumber = nextFibonnaciNumber;
            if(nextFibonnaciNumber > SMALLER_THAN) {
                break;
            }
            println(" Fib number in sequence is: " + nextFibonnaciNumber);
        }

    }

    private final int SMALLER_THAN = 10000;
}
