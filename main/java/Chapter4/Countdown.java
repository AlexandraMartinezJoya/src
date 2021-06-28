package Chapter4;

import acm.program.ConsoleProgram;

public class Countdown extends ConsoleProgram {

        public void run(){
            for( int t = START ; t > 0 ; t--){
                println(t);
            }
            println("Liftoff!!");
        }

        /* Specifies the value from which to start counting down */
    private final int START = 10;
}
