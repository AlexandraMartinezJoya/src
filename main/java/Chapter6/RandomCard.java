package Chapter6;

import acm.program.ConsoleProgram;

public class RandomCard extends ConsoleProgram {

        public void run() {
            println("This program displays a randomly chosen card.");
            Card card = new Card();
            card.drawRandomCard();
            println(card.toString());
        }
}
