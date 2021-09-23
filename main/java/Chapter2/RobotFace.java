package Chapter2;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;

/***
 * This program is displaying a robot face
 *
 * Solved by @AlexandraMartinezJoya
 */
public class RobotFace extends GraphicsProgram {

    public void run(){
        drawUtopiaBot();
        drawRobotEyes();
        drawRobotNose();
        drawRobotMouth();
    }

    private void drawUtopiaBot() {
        GRect robotFace = new GRect(200, 50, 200, 250);
        robotFace.setColor(Color.BLACK);
        robotFace.setFilled(true);
        robotFace.setFillColor(Color.LIGHT_GRAY);
        add(robotFace);
    }

    private void drawRobotEyes(){
        GOval robotEye = new GOval(240, 100, 30, 30);
        robotEye.setColor(Color.ORANGE);
        robotEye.setFilled(true);
        add(robotEye);
        GOval robotEye2 = new GOval(330, 100, 30, 30);
        robotEye2.setColor(Color.ORANGE);
        robotEye2.setFilled(true);
        add(robotEye2);
    }

    private void drawRobotNose(){
        GRect robotNose = new GRect(290, 160 , 15, 30 );
        robotNose.setColor(Color.BLACK);
        robotNose.setFilled(true);
        add(robotNose);
    }

    private void drawRobotMouth(){
        GRect robotMouth = new GRect(270, 230, 60, 30);
        robotMouth.setColor(Color.WHITE);
        robotMouth.setFilled(true);
        add(robotMouth);
    }
}
