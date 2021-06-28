package Chapter4;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

import java.awt.*;

public class Rainbow extends GraphicsProgram {

    public void run(){
        GOval rainbowRedStripe = new GOval(-400, 50, 1500, 300);
        rainbowRedStripe.setColor(Color.RED);
        rainbowRedStripe.setFilled(true);
        add(rainbowRedStripe);

        GOval rainbowOrangeStripe = new GOval(-400, 75, 1500, 300);
        rainbowOrangeStripe.setColor(Color.ORANGE);
        rainbowOrangeStripe.setFilled(true);
        add(rainbowOrangeStripe);

        GOval rainbowYellowStripe = new GOval(-400, 100, 1500, 300);
        rainbowYellowStripe.setColor(Color.YELLOW);
        rainbowYellowStripe.setFilled(true);
        add(rainbowYellowStripe);

        GOval rainbowGreenColor = new GOval(-400, 125, 1500, 300);
        rainbowGreenColor.setColor(Color.GREEN);
        rainbowGreenColor.setFilled(true);
        add(rainbowGreenColor);

        GOval rainbowBlueColor = new GOval(-400, 150, 1500, 300);
        rainbowBlueColor.setColor(Color.BLUE);
        rainbowBlueColor.setFilled(true);
        add(rainbowBlueColor);

        GOval rainbowPurpleColor = new GOval(-400, 175, 1500, 300);
        rainbowPurpleColor.setColor(Color.MAGENTA);
        rainbowPurpleColor.setFilled(true);
        add(rainbowPurpleColor);

        GOval rainbowWhite = new GOval(-400, 200, 1500, 300);
        rainbowWhite.setColor(Color.WHITE);
        rainbowWhite.setFilled(true);
        add(rainbowWhite);
    }
}
