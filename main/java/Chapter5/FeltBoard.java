import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;

public class FeltBoard extends GraphicsProgram {

    /* Runs the program */
    public void run() {
        GRect rect = new GRect(100, 50, 100, 100/ PHI);
        rect.setFilled(true);
        rect.setColor(Color.pink);
        add(rect);

        GOval oval = new GOval(150, 50 + 50 / PHI, 100, 100 / PHI);
        oval.setFilled(true);
        oval.setFillColor(Color.WHITE);
        oval.setColor(Color.RED);
        add(oval);
    }

    /** Constants respesenting golden ratio */
    public final double PHI = 1.618;
}
