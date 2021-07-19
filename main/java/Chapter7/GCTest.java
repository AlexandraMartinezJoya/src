package Chapter7;

import Chapter6.Rational;
import acm.program.ConsoleProgram;

public class GCTest extends ConsoleProgram {

    /** Private constants */
    private final int NUMBER_OF_OBJECTS = 10000;

    public void run(){
        Runtime myRuntime = Runtime.getRuntime();
        println("Allocating " + NUMBER_OF_OBJECTS + " Rational objects");
        for (int i = 0; i <= NUMBER_OF_OBJECTS; i++){
            new Rational();
        }
        long freeMemory = myRuntime.freeMemory();
        myRuntime.gc();
        long memoryAfterGC = myRuntime.freeMemory();
        long memoryFreed = freeMemory - memoryAfterGC;
        println("Garbage collection freed " + memoryFreed +  " bytes");
    }
}
