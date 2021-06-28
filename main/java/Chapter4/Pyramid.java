package Chapter4;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Pyramid extends GraphicsProgram {

    private final int BRICK_WIDTH = 20;
    private final int BRICK_HEIGHT = 7;
    private final int BRICKS_IN_BASE = 12;

    public void run() {
        pyramidBricks();
    }


    private void pyramidBricks(){
        int numOfBricks = BRICKS_IN_BASE;
        int numOfRows = BRICKS_IN_BASE;
        double y =(getHeight() - BRICK_HEIGHT * BRICKS_IN_BASE) / 2;
        while (numOfRows > 0) {
            double x = (getWidth()/2) - ((numOfBricks*BRICK_WIDTH)/2);
            for (int i = numOfBricks; i > 0; i--) {
                GRect brick = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
                add(brick);
                x +=BRICK_WIDTH;
            }
            numOfBricks--;
            numOfRows--;
            y -= BRICK_HEIGHT;
        }

    }

}

