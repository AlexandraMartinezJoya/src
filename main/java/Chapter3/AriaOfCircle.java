package Chapter3;

import acm.program.ConsoleProgram;

public class AriaOfCircle extends ConsoleProgram {

        public void run(){
            println("This program calculates the area of a circle, of radius of your choosing.");
            double radius = readDouble("Please enter circle radius: ");
            double circleAria = PI * radius * radius;
            println("The area of the circle is " + circleAria);
        }

        /*private constants*/
        private final double PI = 3.14159265;

}
