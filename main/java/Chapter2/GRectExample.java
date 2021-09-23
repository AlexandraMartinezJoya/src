package Chapter2;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;

/***
 * This program is the text book example of a filled rectangle
 *
 * Solved by @AlexandraMartinezJoya
 */
public class GRectExample  extends GraphicsProgram {

    private final Color PURPLE_COLOR = new Color(163, 73, 164);
    private final Color BEAUTIFUL_PINK = new Color(255,179,217);

    public void run() {
        GRect rectangle = new GRect(100, 50, 125, 60);
        rectangle.setFilled(true);
        rectangle.setColor(PURPLE_COLOR);
        add(rectangle);
    }
}
