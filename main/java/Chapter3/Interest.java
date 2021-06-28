package Chapter3;

import acm.program.ConsoleProgram;

public class Interest  extends ConsoleProgram {

        public void run(){
            println("Chapter3.Interest Calculation program.");
            double startingBalance = readDouble("Enter starting balance: ");
            double interestRate = readDouble("Enter annual interest rate: ");
            double balanceAfterOneYear = startingBalance + (startingBalance * (interestRate / HUNDRED_PERCENT));
            println("Balance after one year = " +  balanceAfterOneYear);
        }

        /*Private constant*/
    private final int HUNDRED_PERCENT = 100;
}
