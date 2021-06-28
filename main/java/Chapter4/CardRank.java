package Chapter4;

import acm.program.ConsoleProgram;

public class CardRank extends ConsoleProgram {

        public void run() {
            println("This program converts integers to card ranks");
            int n = readInt("Enter an integer between 1 and 13");
            switch (n) {
                case 1 -> println("Ace");
                case 11 -> println("Jack");
                case 12 -> println("Queen");
                case 13 -> println("King");
                default -> println(n);
            }
        }
}
