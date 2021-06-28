package Chapter3;

import acm.program.ConsoleProgram;

public class AverageNDoubles extends ConsoleProgram {
        public void run(){
            println("This program averages "+ (int)NUMBER_OF_DOUBLES +" numbers");

            double total = 0;
            for (int i = 0; i < NUMBER_OF_DOUBLES; i++) {
                int numberCount = 1 + i;
                double number = readDouble("please enter " +numberCount + " number: ");
                total += number;
            }
            double average = total /  NUMBER_OF_DOUBLES;
            println("The average is " + average);
        }

        private final double NUMBER_OF_DOUBLES = 4;
}
