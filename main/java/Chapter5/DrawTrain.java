

        /*
         * File: DrawTrain.java
         * --------------------
         * @EricRoberts
         * This program displays a train figure on the screen.
         * It is exercise 8 from chapter 5.
         */

        import acm.program.*;
        import acm.graphics.*;
        import java.awt.*;

        public class DrawTrain extends GraphicsProgram {

            public void run() {
                double trainWidth = 3 * CAR_WIDTH + 4 * CONNECTOR;
                double x = (getWidth() - trainWidth) / 2;
                double y = getHeight();
                double dx = CAR_WIDTH + CONNECTOR;
                drawEngine(x, y);
                drawBoxcar(x + dx, y, Color.GREEN);
                drawCaboose ( x + 2 * dx, y);
            }

            /* This method draws the engine and its composing parts: the car frame
             * the smoke-stack and the cab
             */
            private void drawEngine (double x, double y) {
                drawCarFrame(x, y, Color.BLACK);
                drawSmokestack(x, y);
                drawCab(x, y);
            }

            /* This method draws the boxcar and the two doors the boxcar has */
            private void drawBoxcar(double x, double y, Color color) {
                drawCarFrame(x, y, color);
                double xRight = x + CONNECTOR + CAR_WIDTH / 2;
                double xLeft = xRight - DOOR_WIDTH;
                double yDoor = y - CAR_BASELINE - DOOR_HEIGHT;
                add(new GRect(xLeft, yDoor, DOOR_WIDTH, DOOR_HEIGHT));
                add(new GRect(xRight, yDoor, DOOR_WIDTH, DOOR_HEIGHT));
            }

            /* This method draws the caboose and its cupola */
            private void drawCaboose (double x, double y) {
                drawCarFrame(x, y, Color.RED);
                drawCupola (x + (CAR_WIDTH - CUPOLA_WIDTH) / 2, y - CUPOLA_HEIGHT - CAR_HEIGHT - CAR_BASELINE);
            }

            /*This method draws a basic car frame composed of the car itself and
             * its wheels.
             */
            private void drawCarFrame (double x, double y, Color color) {
                double x0 = x + CONNECTOR;
                double y0 = y - CAR_BASELINE;
                double top = y0 - CAR_HEIGHT;
                add(new GLine (x, y0, x + CAR_WIDTH - 2 * CONNECTOR, y0));
                drawWheel(x0 + WHEEL_INSET, y - WHEEL_RADIUS);
                drawWheel(x0 + CAR_WIDTH - WHEEL_INSET, y - WHEEL_RADIUS);
                GRect r = new GRect(x0, top, CAR_WIDTH, CAR_HEIGHT);
                r.setFilled(true);
                r.setFillColor(color);
                add (r);
            }
            /*This method draws the wheels of the cars used in the basic car-frame */
            private void drawWheel(double x, double y) {
                double r = WHEEL_RADIUS;
                GOval wheel = new GOval (x - r, y - r, 2 * r, 2 * r);
                wheel.setFilled(true);
                wheel.setColor(Color.GRAY);
                add(wheel);
            }

            /* This method draws the smokestack of the engine) */
            private void drawSmokestack( double x, double y ) {
                double x0 = x + 2 * SMOKESTACK_INSET ;
                double y0 = y - CAR_BASELINE - CAR_HEIGHT - SMOKESTACK_HEIGHT;
                GRect smokestack = new GRect(x0, y0, SMOKESTACK_WIDTH, SMOKESTACK_HEIGHT);
                smokestack.setFilled(true);
                add(smokestack);
            }

            /* This method adds the cab part of the engine */
            private void drawCab(double x, double y) {
                double x0 = x + CAR_WIDTH - CAB_WIDTH;
                double y0 = y - CAR_BASELINE - CAR_HEIGHT - CAB_HEIGHT;
                GRect cab = new GRect (x0, y0, CAB_WIDTH, CAB_HEIGHT);
                cab.setFilled(true);
                cab.setColor(Color.BLACK);
                add(cab);
            }

            /* This method draws the cupola of the caboose */
            private void drawCupola(double x, double y) {
                GRect cupola = new GRect(x, y, CUPOLA_WIDTH, CUPOLA_HEIGHT);
                cupola.setFilled(true);
                cupola.setFillColor(Color.RED);
                add (cupola);
            }
            /* Dimensions of the frame of a car train */
            private static final double CAR_WIDTH = 60;
            private static final double CAR_HEIGHT = 28;

            /* Distance from the bottom of a train car to the bottom below it*/
            private static final double CAR_BASELINE = 10;

            /* Width of the connector, which overlaps between successive cars */
            private static final double CONNECTOR = 4;

            /* Radius of the wheels of each car */
            private static final double WHEEL_RADIUS = 6;

            /* Distance from the edge of the wheel to the frame of the wheel */
            private static final double WHEEL_INSET = 16;

            /* Dimensions of the cab of the engine */
            private static final double CAB_WIDTH = 30;
            private static final double CAB_HEIGHT = 8;

            /* Dimensions of the smokestack and its distance from the front */
            private static final double SMOKESTACK_WIDTH = 8;
            private static final double SMOKESTACK_HEIGHT = 8;
            private static final double SMOKESTACK_INSET = 8;

            /* Dimensions of the door_pannels to the boxcar*/
            private static final double DOOR_WIDTH = 18;
            private static final double DOOR_HEIGHT = 24;

            /* Dimensions of the cupola on the caboose */
            private static final double CUPOLA_WIDTH = 30;
            private static final double CUPOLA_HEIGHT = 8;
        }
