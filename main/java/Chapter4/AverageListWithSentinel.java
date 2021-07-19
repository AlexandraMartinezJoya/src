package Chapter4;

import acm.program.ConsoleProgram;

public class AverageListWithSentinel extends ConsoleProgram {

        public void run(){
            println("This program reads in exams scores and calculates the average.");
            println("Enter values , one per line, using " + SENTINEL +  " to signal the end of the list ");
            int total = 0;
            int count = 0;
            int value = readInt("  ?  ");
            while (value != SENTINEL) {
                total += value;
                count++;
                value = readInt( "  ?  ");
            }
            double average = total / (double)count;
            println("The average is : " + average + ".");
        }

        /*private constants*/
    private final int SENTINEL = -1;
}
