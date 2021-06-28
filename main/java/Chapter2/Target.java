package Chapter2;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

import java.awt.*;

public class Target extends GraphicsProgram {

        public void run(){
            GOval outterCircle = new GOval(250, 100, 300, 300);
            outterCircle.setColor(Color.RED);
            outterCircle.setFilled(true);
            add(outterCircle);

            GOval middleCircle = new GOval(300, 150, 200, 200);
            middleCircle.setColor(Color.WHITE);
            middleCircle.setFilled(true);
            add(middleCircle);

            GOval innerCircle = new GOval(350, 200, 100, 100);
            innerCircle.setColor(Color.RED);
            innerCircle.setFilled(true);
            add(innerCircle);
        }
}
