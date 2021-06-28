import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class ConsecutiveHeads extends ConsoleProgram {

    /** Instance variables */
    private RandomGenerator rgen = RandomGenerator.getInstance();

    public void run(){
        int consecutiveHeads = 0;
           int totalFlips= 0;
            int heads = 0;
            while( consecutiveHeads < 3) {
                int generateHeadsOrTails = rgen.nextInt(0, 1);
                totalFlips++;
                if (generateHeadsOrTails == heads) {
                    println("Heads");
                    consecutiveHeads++;
                } else {
                    println("Tails");
                    consecutiveHeads = 0;
                }
            }
            println("It took " + totalFlips + " flips to get 3 consecutive heads.");
    }
}
