package Chapter6;

/**
 * The student class keeps track of the following pieces of data about a student :
 * the student's name, ID number, the number of credits the student has earned
 * toward graduation, and wether the student is paid up with respect to university bills
 * All of his information is entirely private to the class.
 * Clients can obtain that information only by using the various methods defined by the class
 */

public class Student {

    /**
     * Private instance variables
     */

    /**
     * The student's name as a string
     */
    private String studentName;

    /**
     * The student's ID number as int
     */
    private int studentID;

    /**
     * The student's credits earned
     */
    private double creditsEarned;

    /**
     * The student's paid up status
     */
    private boolean paidUp;

    /*    Public constants */
    /*    The Number of credits required for graduation */
    public static final double CREDITS_TO_GRADUATE = 32;

    /**
     * Creates a new Chapter6.Student object with the specified name and ID.
     * @param  name The student's name as a String
     * @param ID The student's ID number as int
     */
    public Student(String name, int ID) {
        this.studentName = name;
        this.studentID = ID;
    }

    /**
     * Gets the name of the student
     * @return studentName
     */
    public String getName(){
        return  this.studentName;
    }

    /**
     * Gets the ID number of this Chapter6.Student
     * @return The ID number of the student
     */
    public int getID(){
        return this.studentID;
    }

    /**
     * Sets the number of credits earned
     * @param credits The number of credits earned
     */
    public void setCredits(double credits){
        this.creditsEarned = credits;
    }

    /**
     * Gets the number of credits earned
     * @return The number of credits earned
     */
    public double getCredits() {
        return this.creditsEarned;
    }

    /**
     * Sets wether the student is paid up
     * @param flag The value of true or false indicating paid-up status
     */
    public void setPaidUp(boolean flag){
        this.paidUp = flag;
    }

    /**
     * Returns whether the student is paid up
     * @return whether the student is paid up
     */
    public boolean isPaidUp(){
        return  this.paidUp;
    }

    /**
     * Creates a string identifying the student
     * @return the string used to display the student
     */
    public String toString() {
        return this.studentName + " (#" + this.studentID + ")";
    }

    private boolean isEligibleToGraduate(Student student) {
        return student.getCredits() >= Student.CREDITS_TO_GRADUATE && student.isPaidUp();
    }
}
