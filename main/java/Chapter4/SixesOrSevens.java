package Chapter4;

import acm.program.ConsoleProgram;

public class SixesOrSevens extends ConsoleProgram {

        public void run(){
            println("This program prints a list of numbers between 1 and " + MAX_NUMBER +" which is divisible by 6 or 7 but not both");

            for (int i = 0; i <= MAX_NUMBER; i++){
                if(i % 6 == 0 && i % 7 != 0) {
                    println( i  + ": this number is divisible by 6 but not by 7");
                }
                if (i % 7 == 0 && i % 6 != 0) {
                    println(i + ": this number is divisible by 7 but not by 6");
                }
            }
        }

        /* private constants*/
    private final int MAX_NUMBER = 100;
}
