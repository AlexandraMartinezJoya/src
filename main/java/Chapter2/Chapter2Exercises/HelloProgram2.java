package Chapter2.Chapter2Exercises;
/***
 *HelloProgram2.java
 * ==============
 * Exercise 1  from chapter 2 from The art and science of Java.
 * Program is Written by Alexandru Martinez, my 7 year old son, and me, Alexandra Martinez, his mother
 */


import acm.graphics.*;
import acm.program.*;

import java.awt.*;

public class HelloProgram2  extends GraphicsProgram {

    private final Color  PURPLE_COLOR = new Color(163, 73, 164);
    private final Color  BROWN_COLOR = new Color(163, 119, 75);
    private final Color BEAUTIFUL_PINK = new Color(255,179,217);
    private final Color LIGHT_BLUE = new Color(157,220,247);
    private final Color PINK_RED = new Color(255,159,159);

    public void run(){
        GLabel msg = new GLabel("theres only one trap", 500,  400);
        msg.setFont("Lucida Blackletter-48");
        msg.setColor(PURPLE_COLOR);

        GLabel alex = new GLabel("and what", 100,  300);
        alex.setFont("Helvetica-36");
        alex.setColor(Color.GRAY);

        GLabel ceva = new GLabel("Nothing", 300,  300);
        ceva.setFont("Helvetica-36");
        ceva.setColor(Color.LIGHT_GRAY);

        GRect rectangle = new GRect(100, 100, 100, 100);
        rectangle.setColor(PINK_RED);
        rectangle.setFilled(true);
        add(rectangle);

        GOval oval = new GOval(75, 75, 100, 125);
        oval.setFilled(true);
        oval.setColor(LIGHT_BLUE);
        GLabel alexandra = new GLabel("Alexandra" , 100, 150);
        alexandra.setFont("Helvetica-24");
        alexandra.setColor(BEAUTIFUL_PINK);
        add(oval);
        add(alexandra);

        GLine line = new GLine(350, 100, 150, 100);
        line.setColor(Color.black);
        GLabel label = new GLabel("But that",270 , 100);
        label.setFont("Helvetica-24");
        label.setColor(Color.DARK_GRAY);
        add(line);


        add(label);
        add(alex);
        add(msg);
        add(ceva);
    }

}
