package Chapter2;

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

/***
 * This program is saying hello to the graphic element GLabel
 *
 * Solved by @AlexandraMartinezJoya
 */

public class HelloProgram  extends GraphicsProgram {

    private final Color  PURPLE_COLOR = new Color(163, 73, 164);
    private final Color PASTEL_PURPLE = new Color(207,137,245);

    public void run(){
        GLabel call = new GLabel("I can write code in Java, C, PHP, and Python, and ..js :(", 75,  125);
        call.setFont("Lucida Blackletter-48");
        call.setColor(PURPLE_COLOR);

        GLabel me = new GLabel("Alexandra Martinez Joya", 178, 54);
        me.setFont("Lucida Purpleletter-24");
        me.setColor(PASTEL_PURPLE);

        add(call);
        add(me);
    }
}
