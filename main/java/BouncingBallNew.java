import acm.graphics.GOval;
import acm.graphics.GPoint;
import acm.program.GraphicsProgram;

import java.awt.*;

/**
 * This program is based on the animated square program and displays a ball which is bouncing around the end of the boundaries of the graphics window
 *
 * @EricRoberts
 *
 * Solves by @Alexandra Martinez
 */
public class BouncingBallNew extends GraphicsProgram {

    private final int BALL_RADIUS = 60;

    private final Color PURPLE = new Color(186, 59, 186);

    public void run(){
        double ballInitialX = (getWidth() - 2* BALL_RADIUS) / 2;
        double ballInitialY = (getHeight() - 2* BALL_RADIUS) / 2;

        GOval ball = new GOval(ballInitialX, ballInitialY, BALL_RADIUS , BALL_RADIUS);

        ball.setFilled(true);
        ball.setColor(Color.red);
        add(ball);
        double directionX = 0;
        double directionY = 0;
        while(true) {
            double dx = 1 - directionX;
            double dy = 1 - directionY;
            ball.move(dx, dy);
            ball.pause(10);
            double windowBottom = getHeight() -  BALL_RADIUS;
            double windowLeftWall = getWidth() - BALL_RADIUS;
            double windowRightWall = BALL_RADIUS;
            GPoint location = ball.getLocation();
            if( location.getY()  == windowBottom) {
                directionX = 0;
                directionY = 2;
                GOval purpleBall = new GOval(ball.getX(), ball.getY(), BALL_RADIUS, BALL_RADIUS);
                purpleBall.setFilled(true);
                purpleBall.setFillColor(PURPLE);
                add(purpleBall);
                purpleBall.move(dy , dx);
                purpleBall.pause(30);
            }
            if(location.getX() == windowLeftWall){
                directionX = 2;
                directionY = 2;
                GOval blueBall = new GOval(ball.getX(), ball.getY(), BALL_RADIUS, BALL_RADIUS);
                blueBall.setFilled(true);
                blueBall.setFillColor(Color.BLUE);
                add(blueBall);
            }
            if( location.getY()  == 0.00) {
                directionX =  2;
                directionY = 0;
                GOval yellowBall = new GOval(ball.getX(), ball.getY(), BALL_RADIUS, BALL_RADIUS);
                yellowBall.setFilled(true);
                yellowBall.setFillColor(Color.YELLOW);
                add(yellowBall);
            }
            if( location.getX()  == 0.00) {
                directionX =  0;
                directionY = 0;
                GOval greenBall = new GOval(ball.getX(), ball.getY(), BALL_RADIUS, BALL_RADIUS);
                greenBall.setFilled(true);
                greenBall.setFillColor(Color.GREEN);
                add(greenBall);
            }
        }
    }
}
