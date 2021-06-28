package Chapter4;

import acm.program.ConsoleProgram;

public class SignTest  extends ConsoleProgram {

        public void run(){
            println("This program classifies an integer by it's sign");
            int n = readInt("Enter a number: ");
            if(n > 0){
                println("The number is positive");
            } else {
                println("That number is negative");
            }
        }
}
