import acm.program.ConsoleProgram;
import java.lang.Math;

/**
 * File: RaiseIntToPower.java
 * ====================
 * This program displays a list of values of 2^k for all k values from 0 to 10
 * @EricRoberts
 *
 * By @AlexandraMartinez
 */

public class RaiseIntToPower extends ConsoleProgram {

    /**
     * Private constants
     */
    private final int STARTING_VALUE = 0;
    private final int ENDING_VALUE = 10;

    public void run() {
        println("This program displays a list of values of 2^k for all k values from 0 to 10");
        int num = 2;
        for (int power = STARTING_VALUE; power <= ENDING_VALUE; power++){
            println( num + "^ "+ power + " = " + raiseIntToPower(num,  power));
        }

    }

    private int raiseIntToPower( int num, int power){
//        return (int) Math.pow(num, power);
        int total = 0 ;
        for(int i = 0; i <= power; i++) {
            switch (i) {
                case 0 -> total = 1;
                case 1 -> total = num;
                default -> total *= num;
            }
        }
        return total;
    }
}
