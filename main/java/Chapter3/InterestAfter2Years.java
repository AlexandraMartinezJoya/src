package Chapter3;

import acm.program.ConsoleProgram;

public class InterestAfter2Years extends ConsoleProgram {

    public void run(){
        println("Chapter3.Interest Calculation program.");
        double startingBalance = readDouble("Enter starting balance: ");
        double interestRate = readDouble("Enter annual interest rate: ");
        double interestPerYear = startingBalance * (interestRate / HUNDRED_PERCENT);
        double balanceAfterOneYear = startingBalance + (interestPerYear);
        interestPerYear = balanceAfterOneYear * (interestRate / HUNDRED_PERCENT);
        double balanceAfterTwoYears = balanceAfterOneYear + (interestPerYear);
        println("Balance after one year = " +  balanceAfterOneYear);
        println("Balance after two years = " +  balanceAfterTwoYears);
    }

    /*Private constant*/
    private final int HUNDRED_PERCENT = 100;
}
