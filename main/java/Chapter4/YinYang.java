package Chapter4;

import acm.graphics.GArc;
import acm.program.GraphicsProgram;
import java.awt.*;

public class YinYang  extends GraphicsProgram {

    /* Private constants */
    private final int FIGURE_SIZE = 150;

    /* Runs the program */
        public void run() {
            double x = (double) getWidth() / 2;
            double y =  (double) getHeight() / 2;
            double r = FIGURE_SIZE;
            GArc bigBlack = new GArc(x - r, y -r, 2 *r, 2 * r, -90,  180);
            bigBlack.setFilled(true);
            add(bigBlack);

            GArc smallWhite = new GArc(x - r / 2, y -r,  r, r,  - 90, 180);
            smallWhite.setFilled(true);
            smallWhite.setColor(Color.WHITE);
            add(smallWhite);

            GArc smallBlack = new GArc( x - r / 2, y , r,  r, 90, 180);
            smallBlack.setFilled(true);
            add(smallBlack);

            GArc outerCircle = new GArc(x - r, y -r, 2* r, 2 *r, 0, 360);
            outerCircle.setFilled(false);
            add(outerCircle);
        }

        //TODO: add small circles in the white and back

}
