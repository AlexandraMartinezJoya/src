package Chapter3;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;

public class ImprovedGRectPlusGOval extends GraphicsProgram {
        public void run(){
            double x = (getWidth() - FIGURE_WIDTH) / 2;
            double y = (getHeight() - FIGURE_HEIGHT) / 2;
            GRect rect = new GRect(x, y, FIGURE_WIDTH, FIGURE_HEIGHT);
            rect.setFilled(true);
            rect.setColor(Color.RED);
            add(rect);

            GOval oval = new GOval(x, y, FIGURE_WIDTH, FIGURE_HEIGHT);
            oval.setFilled(true);
            oval.setColor(Color.BLUE);
            add(oval);
        }


        /*private constants*/
    private final double FIGURE_WIDTH = 125;
    private final double FIGURE_HEIGHT = 75;
}
