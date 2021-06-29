package Chapter6;

import acm.program.ConsoleProgram;

public class RoundoffExample extends ConsoleProgram {

    public void run(){
        double sum = 1.0 / 2.0 + 1.0 / 3.0 + 1.0 / 6.0;
        println("1.0 / 2.0 + 1.0 / 3.0 + 1.0 / 6.0 = " + sum);
    }
}
