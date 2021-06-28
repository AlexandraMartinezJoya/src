package Chapter4;

import acm.program.ConsoleProgram;

/**
================================================
 This program read in a list of user inputted integers, and stops reading them at a
 sentinel value, and then displays the largest number
 @EricRoberts

 Solved by Alexandra Martinez
 */
public class FindLargest extends ConsoleProgram {

    private final int SENTINEL = 0;

    public void run(){
        println("This program finds the largest integer in a list.");
        println("Enter the values, one per line, using 0  to signal the end of the list.");
        int n = readInt("Enter a pozitive number: ");
        int largest = 0;
        while ( n != SENTINEL){
            if(n > largest) {
                largest = n;
            }
            n = readInt("Enter a pozitive number: ");
        }
        println("The largest number in the list is: " + largest);
    }
}
