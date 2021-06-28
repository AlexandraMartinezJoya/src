package Chapter2;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

import java.awt.*;

public class OlympicRings extends GraphicsProgram {

    private Color olympicsBlue = new Color(14, 119, 177);
    private Color olympicsYellow = new Color(255, 178, 60);
    private Color olympicsGreen = new Color(8, 173, 81);
    private Color olympicsRed = new Color(237, 54, 74);

    public void run(){
        GOval blueRing = new GOval(50, 50, 150, 150);
        blueRing.setColor(olympicsBlue);
        add(blueRing);

        GOval yellowRing = new GOval(135, 125, 150, 150);
        yellowRing.setColor(olympicsYellow);
        add(yellowRing);

        GOval blackRing = new GOval(225, 50, 150, 150);
        blackRing.setColor(Color.BLACK);
        add(blackRing);

        GOval greenRing = new GOval(310, 125, 150, 150);
        greenRing.setColor(olympicsGreen);
        add(greenRing);

        GOval redRing = new GOval(400, 50, 150, 150);
        redRing.setColor(olympicsRed);
        add(redRing);
    }
}
