package Chapter7;

import acm.program.ConsoleProgram;

public class AverageListRewrite extends ConsoleProgram {

    public void run(){
        println("This program reads in exams scores and calculates the average.");
        println("Enter values , one per line, using  a blank line to signal the end of the list ");
        int total = 0;
        int count = 0;
        String value = readLine("  ?  ");
        while (!value.equals("")) {
            Integer intValue = new Integer(value);
            total += intValue;
            count++;
            value = readLine( "  ?  ");
        }
        double average = total / (double)count;
        println("The average is : " + average + ".");
    }

    /*private constants*/
    private final String SENTINEL = "";
}
