package Chapter4;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;

public class AnimateSquare extends GraphicsProgram {

        public void run() {
            GRect square = new GRect(0, 0, SQUARE_SIZE, SQUARE_SIZE);
            square.setFilled(true);
            add(square);

            double dx = (double) (getWidth() - SQUARE_SIZE) / N_STEPS;
            double dy = (double)(getHeight() - SQUARE_SIZE) / N_STEPS;
            for ( int i = 0;  i < N_STEPS; i++) {
                square.move(dx, dy);
                square.setColor(Color.BLACK);
                pause(PAUSE_TIME);
                square.setColor(Color.RED);
                pause(PAUSE_TIME);
            }
        }

//        private constants
        private final int N_STEPS = 100;
        private final int PAUSE_TIME = 60;
        private final int  SQUARE_SIZE = 50;
}
