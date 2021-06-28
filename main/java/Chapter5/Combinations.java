import acm.program.ConsoleProgram;

/**
 * File: Combinations.java
 * =====================
 * This program computes the mathematical combinations functions
 * C(n, k) which is the number of ways of selecting k objects from a set of n distinct object
 */

public class Combinations extends ConsoleProgram {

    public void run(){
        int n = readInt(" Enter number of objects in the set (n) :");
        int k = readInt("Enter number to be chosen (k) : ");
        println("C(" + n + ", " + k + " ) = " + combinations(n, k));
    }

    private int combinations(int n, int k){
        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    private int factorial(int n){
        int result = 1;
        for(int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }
}
