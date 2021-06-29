package Chapter6; /**
 * File: Chapter6.FilledRect.java
 * -----------------------
 * This file defines a graphical object that appears as a filled rectangle
 */

import acm.graphics.GRect;
import java.awt.*;

/**
 * This class is  a GObject subclass that is almost identical to GRect except that it starts out filled instead of outlined
 */
public class FilledRect extends GRect {

    /**
     * Creates a new Chapter6.FilledRect with the specified bounds
     */
    public FilledRect(double x, double y, double width, double height ){
        super(x, y, width, height);
        setFilled(true);
    }

    /**
     * Creates a new filled rect with the specified bounds and color
     */
    public FilledRect(double x, double y, double width, double height, Color color){
        this(x, y, width, height);
        setColor(color);
    }
}
