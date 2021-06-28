package Chapter2;

import acm.program.ConsoleProgram;

/***
 *HelloProgram2.java
 * ==============
 * Exercise 2  from chapter 2 from The art and science of Java.
 * Program is Written by Alexandru Martinez, my 7 year old son, and me, Alexandra Martinez, his mother
 */

public class SomeProgram extends ConsoleProgram {

    public void run(){
        double triangleBase = readDouble("Enter triangle base: ");
        double triangleHeight = readDouble("Enter triangle height: ");
        double areaOfTriangle = (triangleBase * triangleHeight) / 2;
        println("The Area of the triangle is " + areaOfTriangle);
    }
}
