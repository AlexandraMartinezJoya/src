import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class DrawHouseOfUsher extends GraphicsProgram {

    /**
     * Private constants
     */
    private final double WINDOW_RADIUS = 20;

    private final double HOUSE_WIDTH = 250;
    private final double HOUSE_HEIGHT = 200;
    private final double HOUSE_ROOF_HEIGHT = 100;

    private final double DOOR_WIDTH = 40;
    private final double DOOR_HEIGHT = 55;
    private final double DOOR_ROOF_HEIGHT = 45;

    private final double TOWER_HEIGHT = 300;
    private final double TOWER_WIDTH = 50;
    private final double TOWER_ROOF_HEIGHT = 55;

    private final double TREE_HEIGHT = 100;
    private final double TREE_WIDTH = 30;
    private final double TREE_ROOF_HEIGHT = 75;

    public void run() {
        double dx = getHouseX();
        double dy = getHouseY();

        drawHouse (dx ,dy);
        drawTrees(dx, dy);
    }

    private void drawHouse(double totalHouseX, double totalHouseY){
        drawLeftTower(totalHouseX, totalHouseY);
        drawHouseMiddle(totalHouseX, totalHouseY);
        drawRightTower(totalHouseX, totalHouseY);
    }

    private void drawRightTower(double totalHouseX, double totalHouseY){
        double rightTowerX = totalHouseX + TOWER_WIDTH + HOUSE_WIDTH;
        drawRoofedStructure(rightTowerX, totalHouseY, TOWER_WIDTH, TOWER_HEIGHT,TOWER_ROOF_HEIGHT);
    }

    private void drawLeftTower(double totalHouseX, double totalHouseY){
        double leftTowerX = totalHouseX;
        double leftTowerY = totalHouseY;
        drawRoofedStructure(leftTowerX, leftTowerY, TOWER_WIDTH, TOWER_HEIGHT,TOWER_ROOF_HEIGHT);
    }

    private void drawRoofedStructure(double x, double y, double width, double height, double roofHeight) {
        GRect leftTower = new GRect(x, y, width, height);
        leftTower.setFilled(false);
        add(leftTower);
        GLine leftRoofLine = new GLine(x, y, x + width / 2 , y - roofHeight);
        add(leftRoofLine);
        GLine rightRoofLine = new GLine(  x + width,  y, x + width / 2 , y - roofHeight);
        add(rightRoofLine);
    }

    private void drawHouseMiddle(double totalHouseX, double totalHouseY){
        double houseX = totalHouseX + TOWER_WIDTH;
        double houseY = totalHouseY  + TOWER_HEIGHT - HOUSE_HEIGHT;
        drawRoofedStructure(houseX, houseY, HOUSE_WIDTH, HOUSE_HEIGHT, HOUSE_ROOF_HEIGHT);
        drawHouseDoor(houseX, houseY);
        drawHouseWindows(houseX, houseY);
    }

    private void drawHouseDoor(double houseX, double houseY){
        double doorX = houseX + (HOUSE_WIDTH / 2 - DOOR_WIDTH / 2);
        double doorY = houseY  + HOUSE_HEIGHT - DOOR_HEIGHT;
        drawRoofedStructure(doorX, doorY, DOOR_WIDTH, DOOR_HEIGHT, DOOR_ROOF_HEIGHT);
    }

    private void drawHouseWindows(double houseX, double houseY){
        double leftWindowX = houseX + ((HOUSE_WIDTH  - WINDOW_RADIUS * 2) / 4) ;
        double leftWindowY = houseY + ((HOUSE_HEIGHT - WINDOW_RADIUS * 2) / 4);
        GOval leftWindow = new GOval(leftWindowX, leftWindowY, 2 * WINDOW_RADIUS, 2 * WINDOW_RADIUS);
        add(leftWindow);

        double rightWindowX =  houseX + HOUSE_WIDTH/ 2 + ((HOUSE_WIDTH  - WINDOW_RADIUS * 2) / 6) ;
        GOval rightWindow = new GOval(rightWindowX, leftWindowY, 2 * WINDOW_RADIUS, 2 * WINDOW_RADIUS);
        add(rightWindow);
    }

    private double getHouseX(){
        return (double) getWidth()  / 2 - 2 * TOWER_WIDTH - HOUSE_WIDTH;
    }

    private double getHouseY(){
        return ((double) getHeight() - (TOWER_HEIGHT)) / 2 + TOWER_ROOF_HEIGHT / 2;
    }


    private void drawTrees(double totalHouseX, double totalHouseY){
        double equalSpaceBetweenTrees = ((double) getWidth() / 2 + 3 * TREE_WIDTH)/8;
        double firstTreeX = (double) getWidth() / 2 + equalSpaceBetweenTrees  ;
        double treeY =  totalHouseY + HOUSE_HEIGHT ;
        drawRoofedStructure(firstTreeX, treeY, TREE_WIDTH, TREE_HEIGHT, TREE_ROOF_HEIGHT);

        double secondTreeX = (double) getWidth() / 2 + 2* equalSpaceBetweenTrees + TREE_WIDTH;
        drawRoofedStructure(secondTreeX, treeY, TREE_WIDTH, TREE_HEIGHT, TREE_ROOF_HEIGHT);

        double thirdTreeX = (double) getWidth() / 2 + 3 * equalSpaceBetweenTrees + 2 * TREE_WIDTH;
        drawRoofedStructure(thirdTreeX, treeY, TREE_WIDTH, TREE_HEIGHT, TREE_ROOF_HEIGHT);
    }
}
