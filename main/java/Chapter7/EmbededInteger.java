package Chapter7;

/**
 * This class allows its clients to treat an integer as an object.
 * The underlying integer value is set using setValue and returned using getValue
 */
public class EmbededInteger {
    /*
    ======================
     * Private instance variables
    ======================
     */
    /**
     * the internal value
     */
    private int value;

    /**
     * Creates an embedded integer with the value of n.
     */
    public EmbededInteger(int n){
        value = n;
    }

    /**
     * Sets the internal value of this Chapter7.EmbededInteger to n
     */
    public void setValue(int n){
         value = n;
    }

    /**
     * Returns the internal value of this Chapter7.EmbededInteger
     */
    public int getValue(){
        return value;
    }

    /**
     * Overrides toString method to make it return the string corresponding to the internal value
     */
    public String toString(){
        return "" + value;
    }
}
