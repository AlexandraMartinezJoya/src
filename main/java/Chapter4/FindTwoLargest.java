package Chapter4;

import acm.program.ConsoleProgram;

/**
 ================================================
 This program read in a list of user inputted integers, and stops reading them at a
 sentinel value, and then displays the two largest number
 @EricRoberts

 Solved by Alexandra Martinez
 */

public class FindTwoLargest extends ConsoleProgram {

    private final int SENTINEL = 0;

        public void run() {
            println("This program finds the two largest integers in a list.");
            println("Enter values, one per line, using " + SENTINEL + " to signal the end of the list");
            int n = readInt("   ?   ");
            int largest = 0;
            int secondLargest = 0;
            while (n != SENTINEL) {
                if (n > largest) {
                    largest = n;
                }
                if (n < largest && secondLargest < largest) {
                    secondLargest = n;
                }
                n = readInt( "   ?   ");
            }
            println("The largest number in the list is: " + largest) ;
            println("The second largest number in the list is: " + secondLargest) ;
        }
}
