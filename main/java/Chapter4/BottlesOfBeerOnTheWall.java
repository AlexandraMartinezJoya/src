package Chapter4;

import acm.program.ConsoleProgram;

public class BottlesOfBeerOnTheWall extends ConsoleProgram {

        public void run(){
                for (int i = STARTING_BEER_COUNT; i > 0; i-- ) {
                        println(  i + " bottles of beer on the wall");
                        println(i + " bottles of beer ");
                        println("You take one down, pass it around");
                        println(i-1 + " bottles of beer on the wall");
                        println(" ");
                        if ( i == 1) {
                                println(  i + " bottle of beer on the wall");
                                println(i + " bottle of beer ");
                                println("You take one down, pass it around");
                                println(i-1 + " bottles of beer on the wall");
                                println(" ");
                        }
                }

        }

        private final int STARTING_BEER_COUNT = 99;
}
