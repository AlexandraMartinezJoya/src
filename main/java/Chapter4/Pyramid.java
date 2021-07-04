package Chapter4;

/** A comment 
Had to leave this commment here. Apparently I was complaining that a whole lot of programmers I've met write the crappiest code ever immagined and then they go into
meetings explaining how they build the Pyramids, the Hanging Gardens, or any other world wonder. It's become one of my main jokes, since I've began testing.
Then here comes this exercise, and I had to build, a Pyramid. I couldn't do it. :D I have used the code of some stranger online, which really has solved the Pyramid puzzle.
So, I would give him credit, and I would, had I know where to refer him. for right now, hes just a stealth nickname leaving a comment on some forum. Anyhow, thank you stranger. 
Apparently you and only you have indeed build a Pyramid :) 
*/

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

