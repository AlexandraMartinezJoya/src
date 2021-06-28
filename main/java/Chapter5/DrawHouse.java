import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

/**
 * File: chapter 5: DrawHouse.java
 * =========================
 * This program draws a two story house, with a roof, a door, and windows.
 * It is exercise 9 from The Art and Science of Java, by @EricRoberts
 * @EricRoberts
 *
 * solved by @AlexandraMartinez
 */

public class DrawHouse extends GraphicsProgram {

    /**
     * Private constants
     */
    private final double HOUSE_WIDTH = 300;
    private final double HOUSE_HEIGHT = 240;
    private final double ROOF_HEIGHT = 120;

    private final double FRAMES_IN_SMALL_WINDOW = 2;
    private final double FRAMES_IN_LARGE_WINDOW = 3;
    private final double WINDOW_FRAME_HEIGHT = 30;
    private final double WINDOW_FRAME_WIDTH = 20;

    private final double DOOR_HEIGHT = 80;
    private final double DOOR_WIDTH = 50;

    private final double DOORKNOB_RADIUS = 5;
    private final double DOORKNOB_OFFSET = 10;

    public void run() {
        double dx = getWidth()  / 2;
        double dy = getHeight() / 2;
        double houseX = dx - (HOUSE_WIDTH /2);
        double houseY = (getHeight() - (HOUSE_HEIGHT /2 + ROOF_HEIGHT /2)) /2;
        drawHouse(houseX, houseY);
        drawRoof(houseX, houseY);
        drawDoor(houseX, houseY);
        drawFloorWindows(houseX, houseY);
    }

    private void drawHouse(double dx , double dy) {
        GRect houseFrame = new GRect(dx,  dy, HOUSE_WIDTH, HOUSE_HEIGHT);
        add(houseFrame);
    }

    private void drawRoof(double houseX, double houseY) {
        GLine roofLine = new GLine(houseX, houseY, houseX + HOUSE_WIDTH / 2 ,  houseY - ROOF_HEIGHT );
        GLine secondRoofLine = new GLine(houseX + HOUSE_WIDTH,  houseY , houseX + HOUSE_WIDTH / 2, houseY - ROOF_HEIGHT );
        add(roofLine);
        add(secondRoofLine);
    }

    private void  drawDoor(double houseX, double houseY) {
        double doorX = houseX + ((HOUSE_WIDTH - DOOR_WIDTH) / 2);
        double doorY = houseY + HOUSE_HEIGHT - DOOR_HEIGHT;
        GRect door = new GRect(doorX, doorY, DOOR_WIDTH, DOOR_HEIGHT);
        add(door);
        drawDoorKnob(doorX, doorY);
    }

    private void drawDoorKnob(double doorX, double doorY){
        double doorknobX = doorX + ((DOOR_WIDTH - DOORKNOB_RADIUS) /2 )+ DOORKNOB_OFFSET;
        double doorknobY = doorY + ((DOOR_HEIGHT - DOORKNOB_RADIUS) / 2);
        GOval doorknob = new GOval(doorknobX, doorknobY, DOORKNOB_RADIUS * 2, DOORKNOB_RADIUS *2);
        add(doorknob);
    }

    private void drawFloorWindows(double houseX, double houseY) {
        drawLowFloorLeftWindow (houseX, houseY);
        drawLowFloorRightWindow (houseX, houseY);
        drawUpperFloorLeftWindow(houseX, houseY);
        drawUpperFloorRightWindow(houseX, houseY);
    }

    private void drawLowFloorLeftWindow(double houseX, double houseY) {
        double windowWidth = WINDOW_FRAME_WIDTH * 3;
        double windowHeight = WINDOW_FRAME_HEIGHT * 2;
        double halfAHouseWidth = HOUSE_WIDTH / 2;
        double halfAHouseHeight = HOUSE_HEIGHT / 2;

        for (int i = 0; i < FRAMES_IN_LARGE_WINDOW; i++) {
            for(int j = 0; j < 2; j++) {
                double windowX = houseX + ((halfAHouseWidth - windowWidth - DOOR_WIDTH / 2)/2) + i * WINDOW_FRAME_WIDTH ;
                double windowY = houseY + halfAHouseHeight + (halfAHouseHeight  -  2 *windowHeight) + j * WINDOW_FRAME_HEIGHT;
                GRect windowFrame = new GRect(windowX, windowY, WINDOW_FRAME_WIDTH, WINDOW_FRAME_HEIGHT);
                add(windowFrame);
            }
        }
    }

    private void drawLowFloorRightWindow(double houseX, double houseY){
        double windowWidth = WINDOW_FRAME_WIDTH * 3;
        double windowHeight = WINDOW_FRAME_HEIGHT * 2;
        double halfAHouseWidth = HOUSE_WIDTH / 2;
        double halfAHouseHeight = HOUSE_HEIGHT / 2;

        for (int i = 0; i < FRAMES_IN_LARGE_WINDOW; i++) {
            for(int j = 0; j < 2; j++) {
                double windowX = houseX + halfAHouseWidth + ((halfAHouseWidth - windowWidth - DOOR_WIDTH / 2)) + i * WINDOW_FRAME_WIDTH ;
                double windowY = houseY + halfAHouseHeight + (halfAHouseHeight  -  2 *windowHeight) + j * WINDOW_FRAME_HEIGHT;
                GRect windowFrame = new GRect(windowX, windowY, WINDOW_FRAME_WIDTH, WINDOW_FRAME_HEIGHT);
                add(windowFrame);
            }
        }
    }

    private void drawUpperFloorLeftWindow(double houseX, double houseY){
        double windowWidth = WINDOW_FRAME_WIDTH * 2;
        double windowHeight = WINDOW_FRAME_HEIGHT * 2;
        double halfAHouseWidth = HOUSE_WIDTH / 2;
        double halfAHouseHeight = HOUSE_HEIGHT / 2;

        for (int i = 0; i < FRAMES_IN_SMALL_WINDOW; i++) {
            for(int j = 0; j < 2; j++) {
                double windowX = houseX + ((halfAHouseWidth - windowWidth - DOOR_WIDTH / 2)/2)  + i * WINDOW_FRAME_WIDTH ;
                double windowY = (houseY + (halfAHouseHeight  - windowHeight)/2)  + j * WINDOW_FRAME_HEIGHT;
                GRect windowFrame = new GRect(windowX, windowY, WINDOW_FRAME_WIDTH, WINDOW_FRAME_HEIGHT);
                add(windowFrame);
            }
        }
    }

    private void drawUpperFloorRightWindow(double houseX, double houseY){
        double windowWidth = WINDOW_FRAME_WIDTH * 2;
        double windowHeight = WINDOW_FRAME_HEIGHT * 2;
        double halfAHouseWidth = HOUSE_WIDTH / 2;
        double halfAHouseHeight = HOUSE_HEIGHT / 2;

        for (int i = 0; i < FRAMES_IN_SMALL_WINDOW; i++) {
            for(int j = 0; j < 2; j++) {
                double windowX = houseX + halfAHouseWidth + ((halfAHouseWidth - windowWidth - DOOR_WIDTH / 2)) - WINDOW_FRAME_WIDTH / 2 + i * WINDOW_FRAME_WIDTH ;
                double windowY = (houseY + (halfAHouseHeight  - windowHeight)/2)  + j * WINDOW_FRAME_HEIGHT;
                GRect windowFrame = new GRect(windowX, windowY, WINDOW_FRAME_WIDTH, WINDOW_FRAME_HEIGHT);
                add(windowFrame);
            }
        }
    }
}
