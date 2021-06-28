import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;

public class DrawStopLightRewrite extends GraphicsProgram {

    private final double FRAME_WIDTH = 50;
    private final double FRAME_HEIGHT = 100;
    private final double LAMP_RADIUS = 10;

    public void run() {
        double cx = getWidth() / 2;
        double cy = getHeight() / 2;
        double fx = cx - FRAME_WIDTH / 2;
        double fy = cy - FRAME_HEIGHT / 2;
        double dy = FRAME_HEIGHT / 4 + LAMP_RADIUS / 2;
        add(createFilledRectangle(fx, fy, FRAME_WIDTH, FRAME_HEIGHT, Color.GRAY));
        add(createFilledCircle(cx, cy - dy, LAMP_RADIUS, Color.RED));
        add(createFilledCircle(cx, cy, LAMP_RADIUS, Color.YELLOW));
        add(createFilledCircle(cx, cy + dy, LAMP_RADIUS, Color.GREEN));
    }

    private GOval createFilledCircle(double x, double y, double r, Color color){
        GOval circle = new GOval( x - r, y - r, 2 * r, 2 * r);
        circle.setFillColor(color);
        circle.setFilled(true);
        return circle;
    }

    private GRect createFilledRectangle(double x, double y, double width, double height, Color color){
        GRect rectangle = new GRect(x, y, width, height);
        rectangle.setFilled(true);
        rectangle.setFillColor(color);
        return rectangle;
    }
}
