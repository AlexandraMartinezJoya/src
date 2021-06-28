package Chapter4;

import acm.program.ConsoleProgram;

public class SumOfFirstNOddIntegers extends ConsoleProgram {

        public void run(){
                println("This program displays the sum of odd integers inputted");
                int digits = readInt("Please enter an integer: ");
                int total = 0;
                int count = 0;
                for (int i = 0; count < digits; i++) {
                        if (i % 2 == 1) {
                                total += i;
                                count++;
                        }
                }
                println("The sum of the odd integers is " + total);
        }
}
