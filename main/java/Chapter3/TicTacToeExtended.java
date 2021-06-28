package Chapter3;

import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class TicTacToeExtended extends GraphicsProgram {

    public void run(){

        double x = (getWidth() - BOARD_SIZE) / 2;
        double y = (getHeight() - BOARD_SIZE) / 2;
        add(new GLine(x, y , x + BOARD_SIZE, y));
        add(new GLine(x , y + BOARD_SIZE / 3,  x +  BOARD_SIZE, y + BOARD_SIZE / 3));
        add(new GLine(x + BOARD_SIZE / 3, y - BOARD_SIZE / 3, x + BOARD_SIZE / 3, y  - BOARD_SIZE / 3 + BOARD_SIZE));
        add(new GLine(x +  2 * BOARD_SIZE / 3, y - BOARD_SIZE / 3, x +  2 * BOARD_SIZE / 3, y  - BOARD_SIZE / 3 + BOARD_SIZE));
    }

    private final int BOARD_SIZE = 150;
}
