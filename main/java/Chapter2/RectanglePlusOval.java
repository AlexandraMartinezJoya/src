package Chapter2;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;

/***
 * This program is displaying a rectangle and a oval. textbook example
 *
 * Solved by @AlexandraMartinezJoya
 */
public class RectanglePlusOval extends GraphicsProgram {

    private final Color PINK_RED = new Color(255,159,159);
    private final Color BLUE_GREEN = new Color(145, 215, 201);

    public void run() {
        GRect rect = new GRect(100, 50, 125, 60);
        rect.setFilled(true);
        rect.setColor(PINK_RED);
        add(rect);

        GOval oval = new GOval(100, 50, 125, 60);
        oval.setFilled(true);
        oval.setColor(BLUE_GREEN);
        add(oval);
    }
}
