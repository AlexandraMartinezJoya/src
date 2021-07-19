package Chapter7;

/**
 * This class defines a signal tower object that passes a message to the next tower in the line
 */

public class SignalTower {

    /* Instance variables */
    private String towerName;
    private SignalTower nextTower;

    /**
     * Constructs a new signal tower object with the following parameters:
     * @param name The name of the tower
     * @param link A link to the next tower , or null if none exists
     */
    public SignalTower(String name, SignalTower link) {
        this.towerName = name;
        this.nextTower = link;
    }

    /**
     * This method represents sending a signal to this tower. The effect is to light the signal fire here and
     * to send an additional signal message to the next tower in chain. If any
     */
    public void signal() {
        lightCurrentTower();
        if(nextTower != null ) {
            nextTower.signal();
        }
    }

    /** This method lights the signal fire for this tower. This version that simply prints the name of the tower
     * to the standard output channel. If you wanted to extend this class to be a part of graphical application,
     * for example, you could override this method to draw an indication of the signal being displayed.
     */
    public void lightCurrentTower() {
        System.out.println("Lighting " + this.towerName);
    }
}
