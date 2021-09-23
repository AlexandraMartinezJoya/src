package Chapter2;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

import java.awt.*;


/***
 * This program is displaying three pixels Olympic Rings
 *
 * Solved by @AlexandraMartinezJoya
 */
public class ThreePixelOlympicRings  extends GraphicsProgram {
    private final Color olympicsBlue = new Color(14, 119, 177);
    private final Color olympicsYellow = new Color(255, 178, 60);
    private final Color olympicsGreen = new Color(8, 173, 81);
    private final Color olympicsRed = new Color(237, 54, 74);


    public void run(){
            GOval blueRing1 = new GOval(50, 50, 150, 150);
            GOval blueRing2 = new GOval(51, 51, 148, 148);
            GOval blueRing3 = new GOval(52, 52, 146, 146);
            blueRing1.setColor(olympicsBlue);
            blueRing2.setColor(olympicsBlue);
            blueRing3.setColor(olympicsBlue);
            add(blueRing1);
            add(blueRing2);
            add(blueRing3);

            GOval yellowRing = new GOval(135, 125, 150, 150);
            GOval yellowRing1 = new GOval(136, 126, 148, 148);
            GOval yellowRing2= new GOval(137, 127, 146, 146);
            yellowRing.setColor(olympicsYellow);
            yellowRing1.setColor(olympicsYellow);
            yellowRing2.setColor(olympicsYellow);
            add(yellowRing);
            add(yellowRing1);
            add(yellowRing2);

            GOval blackRing = new GOval(225, 50, 150, 150);
            GOval blackRing1 = new GOval(226, 51, 148, 148);
            GOval blackRing2 = new GOval(227, 52, 146, 146);
            blackRing.setColor(Color.BLACK);
            blackRing1.setColor(Color.BLACK);
            blackRing2.setColor(Color.BLACK);
            add(blackRing);
            add(blackRing1);
            add(blackRing2);

            GOval greenRing = new GOval(310, 125, 150, 150);
            GOval greenRing1 = new GOval(311, 126, 148, 148);
            GOval greenRing2 = new GOval(312, 127, 146, 146);
            greenRing.setColor(olympicsGreen);
            greenRing1.setColor(olympicsGreen);
            greenRing2.setColor(olympicsGreen);
            add(greenRing);
            add(greenRing1);
            add(greenRing2);

            GOval redRing = new GOval(400, 50, 150, 150);
            GOval redRing1 = new GOval(401, 51, 148, 148);
            GOval redRing2 = new GOval(402, 52, 146, 146);
            redRing.setColor(olympicsRed);
            redRing1.setColor(olympicsRed);
            redRing2.setColor(olympicsRed);
            add(redRing);
            add(redRing1);
            add(redRing2);
        }
}
