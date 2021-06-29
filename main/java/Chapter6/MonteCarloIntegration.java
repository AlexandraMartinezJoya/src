package Chapter6;

import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

import java.awt.*;

/**
 * To simulate this process in a program imagine that the dart board is drawn in the standard Cartesian coordinate plane, you learned about in high school
 * You can model the process of throwing a dart randomly at the square by generating two random numbers , x and y, each of which lies between -1 and 1.
 * This(x,y) point always lies somewhere in the square. The point (x, y) lies inside the circle if: squareRoot(x ^ 2 + y ^ 2) < 1. You can however simplify this condition
 * considerably by squaring each side of the inequality, which gives rise to the following more efficient test : x ^ 2 + y ^ 2 < 1.
 * If you perform this simulation many times and compute the fraction of darts that fall within the circle, the result will be somewhere in the neighbourhood PI / 4.
 *
 * Write a program that simulates throwing 10000 darts and then uses the simulation technique described in this exercise to generate and display an
 * approximate value of PI. Don't worry if your answer is correct only in the first few digits. The strategy used in this problem is not particularly accurate
 * even though it occasionally proves useful as a technique for making rough approximations. In mathematics, this is called Monte Carlo integration,
 * after the gambling center that is the capital of Monaco.
 */

public class MonteCarloIntegration extends ConsoleProgram {

    /** Private constants */
    private final int NUMBER_OF_THOWS = 10000;

    /** Instance variables */
    private RandomGenerator rgen = RandomGenerator.getInstance();

    public void run(){
        thorwDarts(NUMBER_OF_THOWS);
    }

    private void thorwDarts(int throwCount) {
        for(int i = 0; i < throwCount; i++) {
            int x = rgen.nextInt(-1, 1);
            int y = rgen.nextInt(-1, 1);
            boolean dartsInTheCircle = x * x  + y * y < 1;
            if(dartsInTheCircle) {
                println("" + i);
            }
        }
    }

}
