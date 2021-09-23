package Chapter2;

import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;


/***
 * This program draws a house at specified points on the screen.
 *
 * Solved by @AlexandraMartinezJoya
 */
public class DrawHouse extends GraphicsProgram  {

    public void run(){
        drawHouseFacade();
        drawHouseRoof();
        drawHouseWindows();
        drawHouseDoor();
    }

    public void drawHouseFacade(){
        GRect houseFacade = new GRect(250, 260 , 200, 150 );
        add(houseFacade);
    }

    public void drawHouseRoof(){
        GLine roofLine = new GLine(250, 260, 350, 150);
        add(roofLine);
        GLine roofLine2 = new GLine(450, 260, 350, 150);
        add(roofLine2);
    }

    public void drawHouseWindows(){
        GRect houseWindow = new GRect(275, 320 , 30, 30);
        add(houseWindow);

        GRect houseWindow2 = new GRect(395, 320, 30, 30);
        add(houseWindow2);
    }

    public void drawHouseDoor(){
        GRect houseDoor = new GRect(325, 325, 50, 75);
        add(houseDoor);
        GOval doorknob = new GOval(355, 355, 10, 10);
        add(doorknob);
    }

    public void drawHouseStairsEntrance(){
        // TODO(When i feel like it)
    }
}
