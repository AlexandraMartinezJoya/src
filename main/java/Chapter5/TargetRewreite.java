import acm.graphics.GOval;
import acm.program.GraphicsProgram;

import java.awt.*;

public class TargetRewreite extends GraphicsProgram {

    /**
     * Private constants
     */
    private final int N_CIRCLES = 5;
    private final double OUTER_RADIUS = 75;
    private final double INNER_RADIUS = 10;

    public void run() {
        double dx = getWidth()  / 2;
        double dy = getHeight() / 2;
        double spaceBetweenCircles = (OUTER_RADIUS - INNER_RADIUS ) / (N_CIRCLES - 1) ;
        drawTarget(dx, dy, spaceBetweenCircles);
    }

    private void drawTarget(double dx, double dy, double spaceBetween){
        GOval outterCircle =  createFilledCircle(dx, dy, OUTER_RADIUS,  Color.RED );
        add(outterCircle);
        GOval outterMiddleWhiteCircle  = createFilledCircle( dx  , dy  , OUTER_RADIUS - ( spaceBetween), Color.WHITE);
        add(outterMiddleWhiteCircle);
        GOval innerMiddleRedCircle = createFilledCircle(dx, dy, OUTER_RADIUS - ( 2 * spaceBetween), Color.RED);
        add(innerMiddleRedCircle);
        GOval innerMiddleWhiteCircle = createFilledCircle(dx, dy, OUTER_RADIUS - ( 3 * spaceBetween), Color.WHITE);
        add(innerMiddleWhiteCircle);
        GOval innerMiddleRedSmallCircle = createFilledCircle(dx, dy, OUTER_RADIUS - ( 4 * spaceBetween), Color.RED);
        add(innerMiddleRedSmallCircle);
        GOval innerWhiteCircle = createFilledCircle(dx, dy, INNER_RADIUS, Color.WHITE);
        add(innerWhiteCircle);
    }

    private GOval createFilledCircle(double x, double y, double r, Color color){
        GOval circle = new GOval( x - r, y - r, 2 * r, 2 * r);
        circle.setColor(color);
        circle.setFillColor(color);
        circle.setFilled(true);
        return circle;
    }
}
