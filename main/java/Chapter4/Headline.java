package Chapter4;

import acm.graphics.GLabel;
import acm.graphics.GPoint;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;

public class Headline extends GraphicsProgram {

    public void run(){
        GLabel falseHeadline = new GLabel("DEWEY DEFEATS TRUMAN", 650, 250);
        Font headlineFont =  new Font("TimesRoman", Font.BOLD, 128);
        int fontSize = headlineFont.getSize();
        falseHeadline.setFont(headlineFont);
        falseHeadline.setColor(Color.BLACK);
        add(falseHeadline);
        GPoint location = falseHeadline.getLocation();
        while((int)location.getY() + fontSize > 0) {
            falseHeadline.move(-1, 0);
            falseHeadline.pause(30);
        }
    }
}
