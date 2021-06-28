package Chapter4;

import acm.program.ConsoleProgram;

public class DigitalRoot extends ConsoleProgram {

    public void run(){
        println("This program calculates the digital root of a integer");
        int n = readInt("Enter a pozitive number: ");
        int digitSum = 0;
        while ( n > 0){
            digitSum += n % 10;
            n /= 10;
            println("Iteration "+ n + "is " + digitSum );
        }
        n = digitSum;
        int digitalRoot = 0;
        while ( n > 0){
            digitalRoot += n % 10;
            n /= 10;
            println("Iteration 2 "+ n + "is  " + digitalRoot );
            if(digitalRoot == 10) {
                digitalRoot = 1;
            }
        }
        println("The digital root: " + digitalRoot);
    }
}