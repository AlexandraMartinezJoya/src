package Chapter6;

import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Craps extends ConsoleProgram {

    /** Instance variables */
    private RandomGenerator rgen = RandomGenerator.getInstance();

    public void run(){
        int total = rollTwoDice();
        if( total == 7 || total == 11) {
            println("That's a natural. You win.");
        } else if ( total == 2 || total == 3 || total == 12) {
            println("That's craps. You lose.");
        } else {
            int point = total;
            println("Your point is " + point);
            while (true){
                total = rollTwoDice();
                if (total == point) {
                    println("You made your point. You win.");
                    break;
                } else if (total == 7) {
                    println("That's a 7. You lose");
                    break;
                }
            }
        }
    }

    private int rollTwoDice(){
        int d1 = rgen.nextInt(1, 6);
        int d2 = rgen.nextInt(1, 6);
        int total = d1 + d2;
        println("Rolling dice: "+  d1 + " + " + d2 + " = " + total);
        return total;
    }
}
