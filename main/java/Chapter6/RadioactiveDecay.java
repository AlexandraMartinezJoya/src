package Chapter6;

import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class RadioactiveDecay extends ConsoleProgram {

    /**
     * Private constants
     */
    private final int INITIAL_ATOMS = 10000;

    /**
     * Instance variables
     */
    private RandomGenerator rgen = RandomGenerator.getInstance();

    public void run() {


        int atomsRemaining = INITIAL_ATOMS;
        println("There are " + INITIAL_ATOMS + " initially") ;
        int year = 0;
        while(atomsRemaining > 0) {
            for (int i = atomsRemaining; i > 0; i--) {
                int hasDecayed = rgen.nextInt(0, 1);
                if (hasDecayed == 0) {
                    atomsRemaining--;
                }
            }
            year = year + 1;
            println("There are " + atomsRemaining + " at the end of year " + year );
        }
    }
}
