import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class StanfordBouncingBall extends GraphicsProgram {

    private final int DIAM_BALL = 30;

    private final double GRAVITY = -11;

    private final int DELAY = 50;

    private final double X_START = DIAM_BALL / 2;
    private final double Y_START = 100;

    /** X velocity **/
    private  final double X_VELOCITY = 5;
    private  final double BOUNCE_REDUCE = 0.9;

    private double xVel = X_VELOCITY;
    private double yVel = 0.0;

    private GOval ball;

    public void run(){
        setup();

        while(ball.getX() < getWidth() + DIAM_BALL * 2){
            moveBall();
            checkForCollision();
            pause(DELAY);
        }
    }

    private void setup(){
        ball = new GOval(X_START, Y_START, DIAM_BALL, DIAM_BALL);
        ball.setFilled(true);
        add(ball);
    }

    private void moveBall(){
        yVel += GRAVITY;
        ball.move(xVel, yVel);
    }

    private void checkForCollision(){
        if(ball.getY() > getHeight() - DIAM_BALL){
            yVel = -yVel * BOUNCE_REDUCE;
        }
        double diff = ball.getY() - (getHeight() - DIAM_BALL);
        ball.move(0, -2 * diff);
    }
}
