package Chapter3;

import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class DrawHouseFlexible extends GraphicsProgram {

    public void run(){
        drawHouseFacade();
        drawHouseRoof();
        drawHouseWindows();
        drawHouseDoor();
    }

    public void drawHouseFacade(){
        double x = (getWidth() - FACADE_WIDTH ) / 2;
        double y = (getHeight() - FACADE_HEIGHT + ROOF_HEIGHT) / 2;
        GRect houseFacade = new GRect(x, y , FACADE_WIDTH, FACADE_HEIGHT );
        add(houseFacade);
    }

    public void drawHouseRoof(){
        double x = (getWidth() - FACADE_WIDTH ) / 2;
        double y = (getHeight() - FACADE_HEIGHT + ROOF_HEIGHT) / 2;
        GLine roofLine = new GLine(x, y,  x + FACADE_WIDTH / 2,  y - ROOF_HEIGHT);
        add(roofLine);
        GLine roofLine2 = new GLine( x + FACADE_WIDTH , y,  x + FACADE_WIDTH / 2,  y - ROOF_HEIGHT);
        add(roofLine2);
    }

    public void drawHouseWindows(){
        double x = (getWidth() - FACADE_WIDTH ) / 2;
        double y = (getHeight() - FACADE_HEIGHT + ROOF_HEIGHT) / 2;
        double leftWindowX = x + ((FACADE_WIDTH / 2  - WINDOW_SIZE )) / 2 ;
        double leftWindowY = y + (4 *(FACADE_HEIGHT - 2 * WINDOW_SIZE) / 5);
        GRect leftWindow = new GRect(leftWindowX, leftWindowY , WINDOW_SIZE, WINDOW_SIZE);
        add(leftWindow);
        double rightWindowX = x + ( FACADE_WIDTH / 2) + ((FACADE_WIDTH / 2  - WINDOW_SIZE )) / 2 ;
        double rightWindowY = leftWindowY;
        GRect rightWindow = new GRect(rightWindowX, rightWindowY, WINDOW_SIZE, WINDOW_SIZE);
        add(rightWindow);
    }

    public void drawHouseDoor(){
        double x = (getWidth() - FACADE_WIDTH ) / 2;
        double y = (getHeight() - FACADE_HEIGHT + ROOF_HEIGHT) / 2;
        double doorX = x + (FACADE_WIDTH - DOOR_WIDTH) / 2;
        double doorY = y + (FACADE_HEIGHT - DOOR_HEIGHT);
        GRect houseDoor = new GRect(doorX, doorY, DOOR_WIDTH, DOOR_HEIGHT);
        add(houseDoor);
        double doorKnobX = doorX + (9*  (DOOR_WIDTH - DOORKNOB_SIZE) / 10) ;
        double doorKnobY = doorY + ((DOOR_HEIGHT - DOORKNOB_SIZE)/2);
        GOval doorknob = new GOval(doorKnobX, doorKnobY, DOORKNOB_SIZE, DOORKNOB_SIZE);
        add(doorknob);
    }


    /*private constants */
    private final double FACADE_WIDTH = 300;
    private final double FACADE_HEIGHT = 200;
    private final double ROOF_HEIGHT = 100;
    private final double WINDOW_SIZE = 60;
    private final double DOOR_HEIGHT =  100;
    private final double DOOR_WIDTH =  50;
    private final double DOORKNOB_SIZE = 10;
}
