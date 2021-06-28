package Chapter2; /***
 *
 */


import acm.graphics.*;
import acm.program.*;

import java.awt.*;

public class HelloProgram  extends GraphicsProgram {

    private final Color  PURPLE_COLOR = new Color(163, 73, 164);
    private final Color PINK_RED = new Color(255,159,159);

    public void run(){
        GLabel msg = new GLabel("I Love Java, C , C++, C#, PHP, and Python", 75,  125);
        msg.setFont("Lucida Blackletter-48");
        msg.setColor(PURPLE_COLOR);

        GLabel me = new GLabel("Alexandra Martinez Joya", 600, 450);
        msg.setFont("Lucida Blackletter-24");
        me.setColor(PINK_RED);

        add(msg);
        add(me);
    }
}
