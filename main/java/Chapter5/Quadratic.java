import acm.program.ConsoleProgram;
import java.lang.Math;

/**
 * File: Quadatic.java
 * ===================
 * This program solves the two ways of the highschool quadratic equation
 *         a * x * x + b * x + c = 0
 */

public class Quadratic extends ConsoleProgram {

    public void run(){
        println("Enter coeficients for the quadratic equation: ");
        int a = readInt("a: ");
        int b = readInt("b: ");
        int c = readInt("c: ");
        try {
            println("The first solution is : " + firstQuadraticSolution(a, b, c));
        } catch (Exception e) {
             String message = e.getMessage();
            println(message);
            e.printStackTrace();
        } try {
            println("The second solution is : " + secondQuadraticSolution(a, b, c));
        } catch (Exception e) {
            String message = e.getMessage();
            println(message);
            e.printStackTrace();
        }
    }

    private double firstQuadraticSolution( int a, int b, int c) throws Exception {
        //x = (-b + squareRoot  (b * b - 4 * a * c) / 2 * a
        if (Math.sqrt(b * b - 4 * a * c) < 0) {
           throw new Exception("Number under square root is negative");
        }
        return  (- b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    }

    private double secondQuadraticSolution( int a, int b, int c) throws Exception {
        //x = (-b - squareRoot  (b * b - 4 * a * c) / 2 * a
        if (Math.sqrt(b * b - 4 * a * c) < 0) {
            throw new Exception("Number under square root is negative");
        }
        return  (- b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    }
}
