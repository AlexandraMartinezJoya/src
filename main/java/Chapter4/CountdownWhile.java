package Chapter4;

import acm.program.ConsoleProgram;

public class CountdownWhile extends ConsoleProgram {

    public void run(){
        int t = 0;
        while(t < START ) {
            println("Liftoff");
            t++;
        }
    }

    /* Specifies the value from which to start counting down */
    private final int START = 10;
}
