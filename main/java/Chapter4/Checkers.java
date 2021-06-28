package Chapter4;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;

/**
 * This program enhances the checkers program to place red and black circles simulating the initial state of a game of checkers
 *
 * @EricRoberts
 *
 * Solves by @Alexandra Martinez
 */
public class Checkers extends GraphicsProgram {


    /* private constants */
    private final int N_ROWS = 8;
    private  final int N_COLUMNS = 8;

    public void run(){
        double sqSize = (double) getHeight() / N_ROWS;
        for ( int i = 0; i < N_ROWS; i++) {
            for (int j = 0; j < N_COLUMNS; j++){
                double x = j * sqSize;
                double y = i * sqSize;
                GRect sq = new GRect(x, y, sqSize, sqSize);
                sq.setFilled((i + j) % 2 != 0);
                sq.setFillColor(Color.GRAY);
                add(sq);

                //Red checkers handling
                if(i <= 2 && sq.isFilled()) {
                    GOval redCheckers = new GOval(x, y, sqSize, sqSize);
                    redCheckers.setFilled(true);
                    redCheckers.setFillColor(Color.RED);
                    add(redCheckers);
                }

                if(i >= 5 && sq.isFilled()) {
                    GOval blackCheckers = new GOval(x, y, sqSize, sqSize);
                    blackCheckers.setFilled(true);
                    blackCheckers.setFillColor(Color.BLACK);
                    add(blackCheckers);
                }

            }
        }
    }
}
